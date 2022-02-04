package com.material.components.fcm;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.Gson;
import com.material.components.R;
import com.material.components.activity.MainMenu;
import com.material.components.data.SharedPref;
import com.material.components.room.AppDatabase;
import com.material.components.room.DAO;
import com.material.components.room.table.NotificationEntity;

public class FcmMessagingService extends FirebaseMessagingService {

    private static int VIBRATION_TIME = 500; // in millisecond
    private SharedPref sharedPref;
    private int retry_count = 0;
    private DAO dao;

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        sharedPref = new SharedPref(this);
        sharedPref.setFcmRegId(s);
        sharedPref.setNeedRegister(true);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        sharedPref = new SharedPref(this);
        dao = AppDatabase.getDb(this).getDAO();

        retry_count = 0;
        try {
            if (remoteMessage.getData().size() <= 0) return;
            Object obj = remoteMessage.getData();
            String data = new Gson().toJson(obj);

            NotificationEntity notification = new Gson().fromJson(data, NotificationEntity.class);
            notification.id = System.currentTimeMillis();
            notification.created_at = System.currentTimeMillis();
            notification.read = false;

            // display notification
            prepareImageNotification(notification);

            // save notification to room db
            saveNotification(notification);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void prepareImageNotification(final NotificationEntity notif) {
        String image_url = notif.image;

        if (image_url != null) {
            glideLoadImageFromUrl(this, image_url, new CallbackImageNotif() {
                @Override
                public void onSuccess(Bitmap bitmap) {
                    showNotification(notif, bitmap);
                }

                @Override
                public void onFailed(String string) {
                    Log.e("onFailed", string);
                    if (retry_count <= 5) {
                        retry_count++;
                        prepareImageNotification(notif);
                    } else {
                        showNotification(notif, null);
                    }
                }
            });
        } else {
            showNotification(notif, null);
        }
    }

    private void showNotification(NotificationEntity notif, Bitmap bitmap) {
        Intent intent = ActivityDialogNotification.navigateBase(this, notif, true);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);

        String channelId = getString(R.string.default_notification_channel_id);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, channelId);
        builder.setContentTitle(notif.title);
        builder.setContentText(notif.content);
        builder.setSmallIcon(R.drawable.ic_notification);
        builder.setDefaults(android.app.Notification.DEFAULT_LIGHTS);
        builder.setContentIntent(pendingIntent);
        builder.setAutoCancel(true);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            builder.setPriority(android.app.Notification.PRIORITY_HIGH);
        }
        Bitmap largeIcon = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_round);
        builder.setLargeIcon(largeIcon);
        builder.setStyle(new NotificationCompat.BigTextStyle().bigText(notif.content));
        if (bitmap != null) {
            builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).setSummaryText(notif.content));
        }

        // display push notif
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(channelId, channelId, NotificationManager.IMPORTANCE_LOW);
            notificationManager.createNotificationChannel(channel);
        }
        int unique_id = (int) System.currentTimeMillis();
        notificationManager.notify(unique_id, builder.build());

        vibrationAndPlaySound();
    }

    private void vibrationAndPlaySound() {
        try {
            // play vibration
            ((Vibrator) getSystemService(Context.VIBRATOR_SERVICE)).vibrate(VIBRATION_TIME);
            // play tone
            RingtoneManager.getRingtone(this, Uri.parse("content://settings/system/notification_sound")).play();
        } catch (Exception e) {
        }
    }


    // load image with callback
    Handler mainHandler = new Handler(Looper.getMainLooper());
    Runnable myRunnable;

    private void glideLoadImageFromUrl(final Context ctx, final String url, final CallbackImageNotif callback) {

        myRunnable = new Runnable() {
            @Override
            public void run() {
                Glide.with(ctx).load(url).asBitmap().into(new SimpleTarget<Bitmap>() {
                    @Override
                    public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
                        callback.onSuccess(resource);
                        mainHandler.removeCallbacks(myRunnable);
                    }

                    @Override
                    public void onLoadFailed(Exception e, Drawable errorDrawable) {
                        callback.onFailed(e.getMessage());
                        super.onLoadFailed(e, errorDrawable);
                        mainHandler.removeCallbacks(myRunnable);
                    }
                });
            }
        };
        mainHandler.post(myRunnable);
    }

    private void saveNotification(NotificationEntity notification) {
        dao.insertNotification(notification);
    }

    public interface CallbackImageNotif {

        void onSuccess(Bitmap bitmap);

        void onFailed(String string);

    }

}
