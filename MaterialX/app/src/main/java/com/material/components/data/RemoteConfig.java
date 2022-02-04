package com.material.components.data;

import android.app.Activity;

import com.material.components.BuildConfig;

public class RemoteConfig {

    public RemoteConfig() {

    }

    public void fetchData(Activity activity) {
    }

    public String getPublisherId() {
        return "pub-3239677XXXXXX";
    }

    public String getBannerUnitId() {
        return "ca-app-pub-3239677920600357/9667976501";
    }

    public String getInterstitialUnitId() {
        return "ca-app-pub-3239677920600357/3286400988";
    }

    public String getAdAppId() {
        return "ca-app-pub-3239677920600357~2463316049";
    }

    public String getPrivacyPolicyUrl() {
        return "http://dream-space.web.id/";
    }

    public Long getAppVersion() {
        return Long.valueOf(BuildConfig.VERSION_CODE);
    }
}
