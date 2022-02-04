package com.build.materialq

import android.R
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.MenuItemCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBar
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.*
import android.widget.*
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.MenuItemCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ApplicationProvider.getApplicationContext
import com.google.ads.mediation.admob.AdMobAdapter
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.InterstitialAd
import com.google.android.material.navigation.NavigationView
import com.material.components.BuildConfig
import com.material.components.R
import com.material.components.activity.about.AboutApp
import com.material.components.activity.about.AboutAppSimple
import com.material.components.activity.about.AboutAppSimpleBlue
import com.material.components.activity.about.AboutCompany
import com.material.components.activity.about.AboutCompanyCard
import com.material.components.activity.about.AboutCompanyImage
import com.material.components.activity.about.AboutDialogMainAction
import com.material.components.activity.article.ArticleBigHeader
import com.material.components.activity.article.ArticleCard
import com.material.components.activity.article.ArticleFood
import com.material.components.activity.article.ArticleFoodReview
import com.material.components.activity.article.ArticleMedium
import com.material.components.activity.article.ArticleMediumDark
import com.material.components.activity.article.ArticleSimple
import com.material.components.activity.article.ArticleStepper
import com.material.components.activity.bottomnavigation.BottomNavigationBasic
import com.material.components.activity.bottomnavigation.BottomNavigationDark
import com.material.components.activity.bottomnavigation.BottomNavigationIcon
import com.material.components.activity.bottomnavigation.BottomNavigationLight
import com.material.components.activity.bottomnavigation.BottomNavigationLightSimple
import com.material.components.activity.bottomnavigation.BottomNavigationMapBlue
import com.material.components.activity.bottomnavigation.BottomNavigationPrimary
import com.material.components.activity.bottomnavigation.BottomNavigationShifting
import com.material.components.activity.bottomsheet.BottomSheetBasic
import com.material.components.activity.bottomsheet.BottomSheetFloating
import com.material.components.activity.bottomsheet.BottomSheetFull
import com.material.components.activity.bottomsheet.BottomSheetList
import com.material.components.activity.bottomsheet.BottomSheetMap
import com.material.components.activity.button.ButtonBasic
import com.material.components.activity.button.ButtonInUtilities
import com.material.components.activity.button.FabMiddle
import com.material.components.activity.button.FabMore
import com.material.components.activity.button.FabMoreText
import com.material.components.activity.card.CardBasic
import com.material.components.activity.card.CardOverlap
import com.material.components.activity.card.CardTimeline
import com.material.components.activity.card.CardWizard
import com.material.components.activity.card.CardWizardLight
import com.material.components.activity.card.CardWizardOverlap
import com.material.components.activity.chip.ChipBasic
import com.material.components.activity.chip.ChipTag
import com.material.components.activity.dashboard.DashboardCryptocurrency
import com.material.components.activity.dashboard.DashboardFinance
import com.material.components.activity.dashboard.DashboardFlight
import com.material.components.activity.dashboard.DashboardGridFab
import com.material.components.activity.dashboard.DashboardPayBill
import com.material.components.activity.dashboard.DashboardStatistics
import com.material.components.activity.dashboard.DashboardWallet
import com.material.components.activity.dashboard.DashboardWalletGreen
import com.material.components.activity.dialog.DialogAddPost
import com.material.components.activity.dialog.DialogAddReview
import com.material.components.activity.dialog.DialogBasic
import com.material.components.activity.dialog.DialogCustom
import com.material.components.activity.dialog.DialogCustomDark
import com.material.components.activity.dialog.DialogCustomInfo
import com.material.components.activity.dialog.DialogCustomLight
import com.material.components.activity.dialog.DialogCustomWarning
import com.material.components.activity.dialog.DialogFullscreen
import com.material.components.activity.dialog.DialogGDPRBasic
import com.material.components.activity.dialog.DialogHeader
import com.material.components.activity.dialog.DialogImage
import com.material.components.activity.dialog.DialogTermOfServices
import com.material.components.activity.expansionpanel.ExpansionPanelBasic
import com.material.components.activity.expansionpanel.ExpansionPanelInvoice
import com.material.components.activity.expansionpanel.ExpansionPanelTicket
import com.material.components.activity.form.FormAddress
import com.material.components.activity.form.FormCheckout
import com.material.components.activity.form.FormEcommerce
import com.material.components.activity.form.FormLogin
import com.material.components.activity.form.FormProfileData
import com.material.components.activity.form.FormSignUp
import com.material.components.activity.form.FormSignupCard
import com.material.components.activity.form.FormSignupCardStack
import com.material.components.activity.form.FormSignupDark
import com.material.components.activity.form.FormSignupImage
import com.material.components.activity.form.FormSignupImageCard
import com.material.components.activity.form.FormSignupImageOutline
import com.material.components.activity.form.FormTextArea
import com.material.components.activity.form.FormWithIcon
import com.material.components.activity.gridlist.GridAlbums
import com.material.components.activity.gridlist.GridBasic
import com.material.components.activity.gridlist.GridCaller
import com.material.components.activity.gridlist.GridSectioned
import com.material.components.activity.gridlist.GridSingleLine
import com.material.components.activity.gridlist.GridTwoLine
import com.material.components.activity.list.ListAnimation
import com.material.components.activity.list.ListBasic
import com.material.components.activity.list.ListDrag
import com.material.components.activity.list.ListExpand
import com.material.components.activity.list.ListMultiSelection
import com.material.components.activity.list.ListSectioned
import com.material.components.activity.list.ListSwipe
import com.material.components.activity.login.LoginCardLight
import com.material.components.activity.login.LoginCardOverlap
import com.material.components.activity.login.LoginImageTeal
import com.material.components.activity.login.LoginSimpleDark
import com.material.components.activity.login.LoginSimpleGreen
import com.material.components.activity.login.LoginSimpleLight
import com.material.components.activity.menu.MenuDrawerMail
import com.material.components.activity.menu.MenuDrawerNews
import com.material.components.activity.menu.MenuDrawerNoIcon
import com.material.components.activity.menu.MenuDrawerSimpleDark
import com.material.components.activity.menu.MenuDrawerSimpleLight
import com.material.components.activity.menu.MenuOverflowList
import com.material.components.activity.menu.MenuOverflowToolbar
import com.material.components.activity.noitem.NoItemArchived
import com.material.components.activity.noitem.NoItemBgCactus
import com.material.components.activity.noitem.NoItemBgCity
import com.material.components.activity.noitem.NoItemInternetIcon
import com.material.components.activity.noitem.NoItemInternetImage
import com.material.components.activity.noitem.NoItemSearch
import com.material.components.activity.noitem.NoItemTabs
import com.material.components.activity.payment.PaymentCardCollections
import com.material.components.activity.payment.PaymentCardDetails
import com.material.components.activity.payment.PaymentForm
import com.material.components.activity.payment.PaymentProfile
import com.material.components.activity.payment.PaymentSuccessDialog
import com.material.components.activity.picker.PickerColor
import com.material.components.activity.picker.PickerDateDark
import com.material.components.activity.picker.PickerDateLight
import com.material.components.activity.picker.PickerLocation
import com.material.components.activity.picker.PickerTimeDark
import com.material.components.activity.picker.PickerTimeLight
import com.material.components.activity.player.PlayerMusicAlbumCircle
import com.material.components.activity.player.PlayerMusicAlbumDark
import com.material.components.activity.player.PlayerMusicAlbumGrid
import com.material.components.activity.player.PlayerMusicAlbumSimple
import com.material.components.activity.player.PlayerMusicBasic
import com.material.components.activity.player.PlayerMusicGenre
import com.material.components.activity.player.PlayerMusicGenreImage
import com.material.components.activity.player.PlayerMusicGenreLight
import com.material.components.activity.player.PlayerMusicLight
import com.material.components.activity.player.PlayerMusicSongList
import com.material.components.activity.player.PlayerMusicTabs
import com.material.components.activity.player.PlayerMusicTabsIcon
import com.material.components.activity.player.PlayerVideoBasic
import com.material.components.activity.player.PlayerVideoSimple
import com.material.components.activity.profile.ProfileBlueAppbar
import com.material.components.activity.profile.ProfileCardHeader
import com.material.components.activity.profile.ProfileCardHeaderImage
import com.material.components.activity.profile.ProfileCardList
import com.material.components.activity.profile.ProfileCardOverlap
import com.material.components.activity.profile.ProfileDrawerImage
import com.material.components.activity.profile.ProfileDrawerSimple
import com.material.components.activity.profile.ProfileFabMenu
import com.material.components.activity.profile.ProfileFormal
import com.material.components.activity.profile.ProfileFreelancer
import com.material.components.activity.profile.ProfileGallery
import com.material.components.activity.profile.ProfileGalleryTwo
import com.material.components.activity.profile.ProfileImageAppbar
import com.material.components.activity.profile.ProfilePolygon
import com.material.components.activity.profile.ProfilePurple
import com.material.components.activity.profile.ProfileRating
import com.material.components.activity.profile.ProfileRed
import com.material.components.activity.profile.ProfileSkills
import com.material.components.activity.progressactivity.ProgressBasic
import com.material.components.activity.progressactivity.ProgressCircleCenter
import com.material.components.activity.progressactivity.ProgressDotsBounce
import com.material.components.activity.progressactivity.ProgressDotsFade
import com.material.components.activity.progressactivity.ProgressDotsGrow
import com.material.components.activity.progressactivity.ProgressLinearCenter
import com.material.components.activity.progressactivity.ProgressLinearTop
import com.material.components.activity.progressactivity.ProgressOnScroll
import com.material.components.activity.progressactivity.ProgressPullRefresh
import com.material.components.activity.search.SearchCity
import com.material.components.activity.search.SearchFilterHotel
import com.material.components.activity.search.SearchFilterProduct
import com.material.components.activity.search.SearchFilterProperty
import com.material.components.activity.search.SearchHistoryCard
import com.material.components.activity.search.SearchPrimary
import com.material.components.activity.search.SearchPrimaryBg
import com.material.components.activity.search.SearchStore
import com.material.components.activity.search.SearchToolbarDark
import com.material.components.activity.search.SearchToolbarLight
import com.material.components.activity.settings.SettingFlat
import com.material.components.activity.settings.SettingProfile
import com.material.components.activity.settings.SettingProfileLight
import com.material.components.activity.settings.SettingSectioned
import com.material.components.activity.shopping.ShoppingCartCard
import com.material.components.activity.shopping.ShoppingCartCardDark
import com.material.components.activity.shopping.ShoppingCartSimple
import com.material.components.activity.shopping.ShoppingCategoryCard
import com.material.components.activity.shopping.ShoppingCategoryImage
import com.material.components.activity.shopping.ShoppingCategoryList
import com.material.components.activity.shopping.ShoppingCheckoutCard
import com.material.components.activity.shopping.ShoppingCheckoutOnePage
import com.material.components.activity.shopping.ShoppingCheckoutStep
import com.material.components.activity.shopping.ShoppingCheckoutTimeline
import com.material.components.activity.shopping.ShoppingProductAdvDetails
import com.material.components.activity.shopping.ShoppingProductDetails
import com.material.components.activity.shopping.ShoppingProductGrid
import com.material.components.activity.shopping.ShoppingSubCategoryTabs
import com.material.components.activity.slider.SliderColorPicker
import com.material.components.activity.slider.SliderDark
import com.material.components.activity.slider.SliderLight
import com.material.components.activity.sliderimage.SliderImageCard
import com.material.components.activity.sliderimage.SliderImageCardAuto
import com.material.components.activity.sliderimage.SliderImageHeader
import com.material.components.activity.sliderimage.SliderImageHeaderAuto
import com.material.components.activity.snackbartoast.SnackbarAndFab
import com.material.components.activity.snackbartoast.SnackbarCustom
import com.material.components.activity.snackbartoast.SnackbarToastBasic
import com.material.components.activity.snackbartoast.ToastCustom
import com.material.components.activity.stepper.StepperDots
import com.material.components.activity.stepper.StepperProgress
import com.material.components.activity.stepper.StepperText
import com.material.components.activity.stepper.StepperVertical
import com.material.components.activity.stepper.StepperWizardColor
import com.material.components.activity.stepper.StepperWizardLight
import com.material.components.activity.tabs.TabsBasic
import com.material.components.activity.tabs.TabsDark
import com.material.components.activity.tabs.TabsIcon
import com.material.components.activity.tabs.TabsIconLight
import com.material.components.activity.tabs.TabsIconStack
import com.material.components.activity.tabs.TabsLight
import com.material.components.activity.tabs.TabsRound
import com.material.components.activity.tabs.TabsScroll
import com.material.components.activity.tabs.TabsStore
import com.material.components.activity.tabs.TabsTextIcon
import com.material.components.activity.timeline.TimelineDotCard
import com.material.components.activity.timeline.TimelineFeed
import com.material.components.activity.timeline.TimelinePath
import com.material.components.activity.timeline.TimelineSimple
import com.material.components.activity.timeline.TimelineTwitter
import com.material.components.activity.toolbar.ToolbarBasic
import com.material.components.activity.toolbar.ToolbarCollapse
import com.material.components.activity.toolbar.ToolbarCollapsePin
import com.material.components.activity.toolbar.ToolbarDark
import com.material.components.activity.toolbar.ToolbarLight
import com.material.components.activity.verification.VerificationBlue
import com.material.components.activity.verification.VerificationCode
import com.material.components.activity.verification.VerificationHeader
import com.material.components.activity.verification.VerificationImage
import com.material.components.activity.verification.VerificationOrange
import com.material.components.activity.verification.VerificationPhone
import com.material.components.adapter.ExpandableRecyclerAdapter
import com.material.components.adapter.MainMenuAdapter
import com.material.components.data.GDPR
import com.material.components.data.RemoteConfig
import com.material.components.data.SharedPref
import com.material.components.fcm.ActivityNotifications
import com.material.components.model.MenuType
import com.material.components.room.AppDatabase
import com.material.components.room.DAO
import com.material.components.utils.NetworkCheck
import com.material.components.utils.Tools
import java.util.*


class MainMenu : AppCompatActivity() {
    private var recycler: RecyclerView? = null
    private var adapter: MainMenuAdapter? = null
    private var sharedPref: SharedPref? = null
    private var remoteConfig: RemoteConfig? = null
    private var actionBar: ActionBar? = null
    private var toolbar: Toolbar? = null
    private var drawer: DrawerLayout? = null
    private var navigation_header: View? = null
    private var notif_badge: View? = null
    private var notification_count = -1
    private var dao: DAO? = null
    private var mAdView: AdView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sharedPref = SharedPref(this)
        remoteConfig = RemoteConfig()
        remoteConfig.fetchData(this)
        dao = AppDatabase.getDb(this).getDAO()
        initToolbar()
        initComponentMenu()
        initDrawerMenu()
        prepareBanner()
        prepareInterstitial()
    }

    private fun initToolbar() {
        toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        actionBar = supportActionBar
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setHomeButtonEnabled(true)
        Tools.setSystemBarColor(this, R.color.black)
    }

    private fun initComponentMenu() {
        recycler = findViewById<View>(R.id.main_recycler) as RecyclerView
        adapter = MainMenuAdapter(this, generateMenuItems(), object : OnItemClickListener() {
            fun onItemClick(view: View?, itemId: Int) {
                onMenuItemSelected(itemId)
            }
        })
        adapter.setMode(ExpandableRecyclerAdapter.MODE_ACCORDION)
        recycler!!.layoutManager = LinearLayoutManager(this)
        recycler!!.isNestedScrollingEnabled = false
        recycler!!.adapter = adapter
        if (sharedPref.isFirstLaunch()) {
            showDialogAbout()
        }
    }

    private fun onMenuItemSelected(itemId: Int) {
        if (sharedPref.getClickSwitch()) {
            if (sharedPref.actionClickOffer()) {
                showDialogOffer()
                sharedPref.setClickSwitch(false)
                return
            }
        } else {
            if (sharedPref.actionClickInters()) {
                val istShown = showInterstitial()
                sharedPref.setClickSwitch(true)
                if (istShown) return
            }
        }
        when (itemId) {
            101 -> startActivity(Intent(this, BottomNavigationBasic::class.java))
            102 -> startActivity(Intent(this, BottomNavigationShifting::class.java))
            103 -> startActivity(Intent(this, BottomNavigationLight::class.java))
            104 -> startActivity(Intent(this, BottomNavigationDark::class.java))
            105 -> startActivity(Intent(this, BottomNavigationIcon::class.java))
            106 -> startActivity(Intent(this, BottomNavigationPrimary::class.java))
            107 -> startActivity(Intent(this, BottomNavigationMapBlue::class.java))
            108 -> startActivity(Intent(this, BottomNavigationLightSimple::class.java))
            201 -> startActivity(Intent(this, BottomSheetBasic::class.java))
            202 -> startActivity(Intent(this, BottomSheetList::class.java))
            203 -> startActivity(Intent(this, BottomSheetMap::class.java))
            204 -> startActivity(Intent(this, BottomSheetFloating::class.java))
            205 -> startActivity(Intent(this, BottomSheetFull::class.java))
            301 -> startActivity(Intent(this, ButtonBasic::class.java))
            302 -> startActivity(Intent(this, ButtonInUtilities::class.java))
            303 -> startActivity(Intent(this, FabMiddle::class.java))
            304 -> startActivity(Intent(this, FabMore::class.java))
            305 -> startActivity(Intent(this, FabMoreText::class.java))
            401 -> startActivity(Intent(this, CardBasic::class.java))
            402 -> startActivity(Intent(this, CardTimeline::class.java))
            403 -> startActivity(Intent(this, CardOverlap::class.java))
            404 -> startActivity(Intent(this, CardWizard::class.java))
            405 -> startActivity(Intent(this, CardWizardLight::class.java))
            406 -> startActivity(Intent(this, CardWizardOverlap::class.java))
            501 -> startActivity(Intent(this, ChipBasic::class.java))
            502 -> startActivity(Intent(this, ChipTag::class.java))
            601 -> startActivity(Intent(this, DialogBasic::class.java))
            602 -> startActivity(Intent(this, DialogFullscreen::class.java))
            603 -> startActivity(Intent(this, DialogCustom::class.java))
            604 -> startActivity(Intent(this, DialogCustomInfo::class.java))
            605 -> startActivity(Intent(this, DialogCustomWarning::class.java))
            606 -> startActivity(Intent(this, DialogCustomLight::class.java))
            607 -> startActivity(Intent(this, DialogCustomDark::class.java))
            608 -> startActivity(Intent(this, DialogAddPost::class.java))
            609 -> startActivity(Intent(this, DialogAddReview::class.java))
            610 -> startActivity(Intent(this, DialogGDPRBasic::class.java))
            611 -> startActivity(Intent(this, DialogTermOfServices::class.java))
            612 -> startActivity(Intent(this, DialogHeader::class.java))
            613 -> startActivity(Intent(this, DialogImage::class.java))
            701 -> startActivity(Intent(this, ExpansionPanelBasic::class.java))
            702 -> startActivity(Intent(this, ExpansionPanelInvoice::class.java))
            703 -> startActivity(Intent(this, ExpansionPanelTicket::class.java))
            801 -> startActivity(Intent(this, GridBasic::class.java))
            802 -> startActivity(Intent(this, GridSingleLine::class.java))
            803 -> startActivity(Intent(this, GridTwoLine::class.java))
            804 -> startActivity(Intent(this, GridSectioned::class.java))
            805 -> startActivity(Intent(this, GridAlbums::class.java))
            806 -> startActivity(Intent(this, GridCaller::class.java))
            901 -> startActivity(Intent(this, ListBasic::class.java))
            902 -> startActivity(Intent(this, ListSectioned::class.java))
            903 -> startActivity(Intent(this, ListAnimation::class.java))
            904 -> startActivity(Intent(this, ListExpand::class.java))
            905 -> startActivity(Intent(this, ListDrag::class.java))
            906 -> startActivity(Intent(this, ListSwipe::class.java))
            907 -> startActivity(Intent(this, ListMultiSelection::class.java))
            2001 -> startActivity(Intent(this, MenuDrawerNews::class.java))
            2002 -> startActivity(Intent(this, MenuDrawerMail::class.java))
            2003 -> startActivity(Intent(this, MenuDrawerSimpleLight::class.java))
            2004 -> startActivity(Intent(this, MenuDrawerSimpleDark::class.java))
            2005 -> startActivity(Intent(this, MenuDrawerNoIcon::class.java))
            2006 -> startActivity(Intent(this, MenuOverflowToolbar::class.java))
            2007 -> startActivity(Intent(this, MenuOverflowList::class.java))
            1001 -> startActivity(Intent(this, PickerDateLight::class.java))
            1002 -> startActivity(Intent(this, PickerDateDark::class.java))
            1003 -> startActivity(Intent(this, PickerTimeLight::class.java))
            1004 -> startActivity(Intent(this, PickerTimeDark::class.java))
            1005 -> startActivity(Intent(this, PickerColor::class.java))
            1006 -> startActivity(Intent(this, PickerLocation::class.java))
            1101 -> startActivity(Intent(this, ProgressBasic::class.java))
            1102 -> startActivity(Intent(this, ProgressLinearCenter::class.java))
            1103 -> startActivity(Intent(this, ProgressLinearTop::class.java))
            1104 -> startActivity(Intent(this, ProgressCircleCenter::class.java))
            1105 -> startActivity(Intent(this, ProgressOnScroll::class.java))
            1106 -> startActivity(Intent(this, ProgressPullRefresh::class.java))
            1107 -> startActivity(Intent(this, ProgressDotsBounce::class.java))
            1108 -> startActivity(Intent(this, ProgressDotsFade::class.java))
            1109 -> startActivity(Intent(this, ProgressDotsGrow::class.java))
            1201 -> startActivity(Intent(this, SliderLight::class.java))
            1202 -> startActivity(Intent(this, SliderDark::class.java))
            1203 -> startActivity(Intent(this, SliderColorPicker::class.java))
            1301 -> startActivity(Intent(this, SnackbarToastBasic::class.java))
            1302 -> startActivity(Intent(this, SnackbarAndFab::class.java))
            1303 -> startActivity(Intent(this, ToastCustom::class.java))
            1304 -> startActivity(Intent(this, SnackbarCustom::class.java))
            1401 -> startActivity(Intent(this, StepperText::class.java))
            1402 -> startActivity(Intent(this, StepperDots::class.java))
            1403 -> startActivity(Intent(this, StepperProgress::class.java))
            1404 -> startActivity(Intent(this, StepperVertical::class.java))
            1405 -> startActivity(Intent(this, StepperWizardLight::class.java))
            1406 -> startActivity(Intent(this, StepperWizardColor::class.java))
            1501 -> startActivity(Intent(this, TabsBasic::class.java))
            1502 -> startActivity(Intent(this, TabsStore::class.java))
            1503 -> startActivity(Intent(this, TabsLight::class.java))
            1504 -> startActivity(Intent(this, TabsDark::class.java))
            1505 -> startActivity(Intent(this, TabsIcon::class.java))
            1506 -> startActivity(Intent(this, TabsTextIcon::class.java))
            1507 -> startActivity(Intent(this, TabsIconLight::class.java))
            1508 -> startActivity(Intent(this, TabsIconStack::class.java))
            1509 -> startActivity(Intent(this, TabsScroll::class.java))
            1510 -> startActivity(Intent(this, TabsRound::class.java))
            1601 -> startActivity(Intent(this, FormLogin::class.java))
            1602 -> startActivity(Intent(this, FormSignUp::class.java))
            1603 -> startActivity(Intent(this, FormProfileData::class.java))
            1604 -> startActivity(Intent(this, FormWithIcon::class.java))
            1605 -> startActivity(Intent(this, FormTextArea::class.java))
            1606 -> startActivity(Intent(this, FormAddress::class.java))
            1607 -> startActivity(Intent(this, FormCheckout::class.java))
            1608 -> startActivity(Intent(this, FormEcommerce::class.java))
            1609 -> startActivity(Intent(this, FormSignupCard::class.java))
            1610 -> startActivity(Intent(this, FormSignupCardStack::class.java))
            1611 -> startActivity(Intent(this, FormSignupDark::class.java))
            1612 -> startActivity(Intent(this, FormSignupImage::class.java))
            1613 -> startActivity(Intent(this, FormSignupImageCard::class.java))
            1614 -> startActivity(Intent(this, FormSignupImageOutline::class.java))
            1701 -> startActivity(Intent(this, ToolbarBasic::class.java))
            1702 -> startActivity(Intent(this, ToolbarCollapse::class.java))
            1703 -> startActivity(Intent(this, ToolbarCollapsePin::class.java))
            1704 -> startActivity(Intent(this, ToolbarLight::class.java))
            1705 -> startActivity(Intent(this, ToolbarDark::class.java))
            1801 -> startActivity(Intent(this, ProfilePolygon::class.java))
            1802 -> startActivity(Intent(this, ProfilePurple::class.java))
            1803 -> startActivity(Intent(this, ProfileRed::class.java))
            1804 -> startActivity(Intent(this, ProfileBlueAppbar::class.java))
            1805 -> startActivity(Intent(this, ProfileImageAppbar::class.java))
            1806 -> startActivity(Intent(this, ProfileDrawerSimple::class.java))
            1807 -> startActivity(Intent(this, ProfileDrawerImage::class.java))
            1808 -> startActivity(Intent(this, ProfileGallery::class.java))
            1809 -> startActivity(Intent(this, ProfileGalleryTwo::class.java))
            1810 -> startActivity(Intent(this, ProfileCardList::class.java))
            1811 -> startActivity(Intent(this, ProfileFabMenu::class.java))
            1812 -> startActivity(Intent(this, ProfileCardHeader::class.java))
            1813 -> startActivity(Intent(this, ProfileCardHeaderImage::class.java))
            1814 -> startActivity(Intent(this, ProfileCardOverlap::class.java))
            1815 -> startActivity(Intent(this, ProfileFormal::class.java))
            1816 -> startActivity(Intent(this, ProfileFreelancer::class.java))
            1817 -> startActivity(Intent(this, ProfileRating::class.java))
            1818 -> startActivity(Intent(this, ProfileSkills::class.java))
            19001 -> startActivity(Intent(this, NoItemArchived::class.java))
            19002 -> startActivity(Intent(this, NoItemSearch::class.java))
            19003 -> startActivity(Intent(this, NoItemInternetIcon::class.java))
            19004 -> startActivity(Intent(this, NoItemInternetImage::class.java))
            19005 -> startActivity(Intent(this, NoItemBgCity::class.java))
            19006 -> startActivity(Intent(this, NoItemBgCactus::class.java))
            19007 -> startActivity(Intent(this, NoItemTabs::class.java))
            20001 -> startActivity(Intent(this, PlayerMusicBasic::class.java))
            20002 -> startActivity(Intent(this, PlayerMusicLight::class.java))
            20003 -> startActivity(Intent(this, PlayerMusicAlbumDark::class.java))
            20004 -> startActivity(Intent(this, PlayerMusicAlbumCircle::class.java))
            20005 -> startActivity(Intent(this, PlayerMusicAlbumSimple::class.java))
            20006 -> startActivity(Intent(this, PlayerMusicSongList::class.java))
            20007 -> startActivity(Intent(this, PlayerMusicAlbumGrid::class.java))
            20008 -> startActivity(Intent(this, PlayerMusicTabs::class.java))
            20009 -> startActivity(Intent(this, PlayerMusicTabsIcon::class.java))
            20010 -> startActivity(Intent(this, PlayerMusicGenre::class.java))
            20011 -> startActivity(Intent(this, PlayerMusicGenreImage::class.java))
            20012 -> startActivity(Intent(this, PlayerMusicGenreLight::class.java))
            20013 -> startActivity(Intent(this, PlayerVideoBasic::class.java))
            20014 -> startActivity(Intent(this, PlayerVideoSimple::class.java))
            21001 -> startActivity(Intent(this, TimelineFeed::class.java))
            21002 -> startActivity(Intent(this, TimelinePath::class.java))
            21003 -> startActivity(Intent(this, TimelineDotCard::class.java))
            21004 -> startActivity(Intent(this, TimelineTwitter::class.java))
            21005 -> startActivity(Intent(this, TimelineSimple::class.java))
            22001 -> startActivity(Intent(this, ShoppingCategoryList::class.java))
            22002 -> startActivity(Intent(this, ShoppingCategoryCard::class.java))
            22003 -> startActivity(Intent(this, ShoppingCategoryImage::class.java))
            22004 -> startActivity(Intent(this, ShoppingSubCategoryTabs::class.java))
            22005 -> startActivity(Intent(this, ShoppingProductGrid::class.java))
            22006 -> startActivity(Intent(this, ShoppingProductDetails::class.java))
            22007 -> startActivity(Intent(this, ShoppingProductAdvDetails::class.java))
            22008 -> startActivity(Intent(this, ShoppingCheckoutCard::class.java))
            22009 -> startActivity(Intent(this, ShoppingCheckoutStep::class.java))
            22010 -> startActivity(Intent(this, ShoppingCheckoutOnePage::class.java))
            22011 -> startActivity(Intent(this, ShoppingCheckoutTimeline::class.java))
            22012 -> startActivity(Intent(this, ShoppingCartSimple::class.java))
            22013 -> startActivity(Intent(this, ShoppingCartCard::class.java))
            22014 -> startActivity(Intent(this, ShoppingCartCardDark::class.java))
            23001 -> startActivity(Intent(this, SearchToolbarLight::class.java))
            23002 -> startActivity(Intent(this, SearchToolbarDark::class.java))
            23003 -> startActivity(Intent(this, SearchStore::class.java))
            23004 -> startActivity(Intent(this, SearchPrimary::class.java))
            23005 -> startActivity(Intent(this, SearchPrimaryBg::class.java))
            23006 -> startActivity(Intent(this, SearchHistoryCard::class.java))
            23007 -> startActivity(Intent(this, SearchCity::class.java))
            23008 -> startActivity(Intent(this, SearchFilterHotel::class.java))
            23009 -> startActivity(Intent(this, SearchFilterProduct::class.java))
            23010 -> startActivity(Intent(this, SearchFilterProperty::class.java))
            24001 -> startActivity(Intent(this, SliderImageHeader::class.java))
            24002 -> startActivity(Intent(this, SliderImageHeaderAuto::class.java))
            24003 -> startActivity(Intent(this, SliderImageCard::class.java))
            24004 -> startActivity(Intent(this, SliderImageCardAuto::class.java))
            25001 -> startActivity(Intent(this, SettingSectioned::class.java))
            25002 -> startActivity(Intent(this, SettingFlat::class.java))
            25003 -> startActivity(Intent(this, SettingProfile::class.java))
            25004 -> startActivity(Intent(this, SettingProfileLight::class.java))
            26001 -> startActivity(Intent(this, VerificationPhone::class.java))
            26002 -> startActivity(Intent(this, VerificationCode::class.java))
            26003 -> startActivity(Intent(this, VerificationHeader::class.java))
            26004 -> startActivity(Intent(this, VerificationImage::class.java))
            26005 -> startActivity(Intent(this, VerificationBlue::class.java))
            26006 -> startActivity(Intent(this, VerificationOrange::class.java))
            27001 -> startActivity(Intent(this, LoginSimpleLight::class.java))
            27002 -> startActivity(Intent(this, LoginSimpleDark::class.java))
            27003 -> startActivity(Intent(this, LoginSimpleGreen::class.java))
            27004 -> startActivity(Intent(this, LoginImageTeal::class.java))
            27005 -> startActivity(Intent(this, LoginCardLight::class.java))
            27006 -> startActivity(Intent(this, LoginCardOverlap::class.java))
            28001 -> startActivity(Intent(this, PaymentCardCollections::class.java))
            28002 -> startActivity(Intent(this, PaymentCardDetails::class.java))
            28003 -> startActivity(Intent(this, PaymentForm::class.java))
            28004 -> startActivity(Intent(this, PaymentProfile::class.java))
            28005 -> startActivity(Intent(this, PaymentSuccessDialog::class.java))
            29001 -> startActivity(Intent(this, DashboardGridFab::class.java))
            29002 -> startActivity(Intent(this, DashboardStatistics::class.java))
            29003 -> startActivity(Intent(this, DashboardPayBill::class.java))
            29004 -> startActivity(Intent(this, DashboardFlight::class.java))
            29005 -> startActivity(Intent(this, DashboardWallet::class.java))
            29006 -> startActivity(Intent(this, DashboardWalletGreen::class.java))
            29007 -> startActivity(Intent(this, DashboardFinance::class.java))
            29008 -> startActivity(Intent(this, DashboardCryptocurrency::class.java))
            30001 -> startActivity(Intent(this, ArticleSimple::class.java))
            30002 -> startActivity(Intent(this, ArticleMedium::class.java))
            30003 -> startActivity(Intent(this, ArticleMediumDark::class.java))
            30004 -> startActivity(Intent(this, ArticleBigHeader::class.java))
            30005 -> startActivity(Intent(this, ArticleStepper::class.java))
            30006 -> startActivity(Intent(this, ArticleCard::class.java))
            30007 -> startActivity(Intent(this, ArticleFood::class.java))
            30008 -> startActivity(Intent(this, ArticleFoodReview::class.java))
            31001 -> startActivity(Intent(this, AboutApp::class.java))
            31002 -> startActivity(Intent(this, AboutAppSimple::class.java))
            31003 -> startActivity(Intent(this, AboutAppSimpleBlue::class.java))
            31004 -> startActivity(Intent(this, AboutCompany::class.java))
            31005 -> startActivity(Intent(this, AboutCompanyImage::class.java))
            31006 -> startActivity(Intent(this, AboutCompanyCard::class.java))
            31007 -> startActivity(Intent(this, AboutDialogMainAction::class.java))
            1 -> showDialogAbout()
        }
    }

    private fun generateMenuItems(): List<ListItem> {
        val items: MutableList<ListItem> = ArrayList<ListItem>()
        items.add(ListItem(-1, null, -1, MenuType.DIVIDER))
        items.add(
            ListItem(
                100,
                "Bottom Navigation",
                R.drawable.ic_view_column,
                true,
                MenuType.HEADER
            )
        )
        items.add(ListItem(101, "Basic", -1, MenuType.SUB_HEADER))
        items.add(ListItem(102, "Shifting", -1, MenuType.SUB_HEADER))
        items.add(ListItem(103, "Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(104, "Dark", -1, MenuType.SUB_HEADER))
        items.add(ListItem(105, "Icon", -1, MenuType.SUB_HEADER))
        items.add(ListItem(106, "Primary", -1, MenuType.SUB_HEADER))
        items.add(ListItem(107, "Map Blue", -1, MenuType.SUB_HEADER))
        items.add(ListItem(108, "Light Simple", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(200, "Bottom Sheet", R.drawable.ic_call_to_actio, MenuType.HEADER))
        items.add(ListItem(201, "Basic", -1, MenuType.SUB_HEADER))
        items.add(ListItem(202, "List", -1, MenuType.SUB_HEADER))
        items.add(ListItem(203, "Map", -1, MenuType.SUB_HEADER))
        items.add(ListItem(204, "Floating", -1, MenuType.SUB_HEADER))
        items.add(ListItem(205, "Full", -1, MenuType.SUB_HEADER))
        items.add(ListItem(300, "Buttons", R.drawable.ic_touch_app, MenuType.HEADER))
        items.add(ListItem(301, "Basic", -1, MenuType.SUB_HEADER))
        items.add(ListItem(302, "Button In Utilities", -1, MenuType.SUB_HEADER))
        items.add(ListItem(303, "Fab Middle", -1, MenuType.SUB_HEADER))
        items.add(ListItem(304, "Fab More", -1, MenuType.SUB_HEADER))
        items.add(ListItem(305, "Fab More Text", -1, MenuType.SUB_HEADER))
        items.add(ListItem(400, "Cards", R.drawable.ic_note, MenuType.HEADER))
        items.add(ListItem(401, "Basic", -1, MenuType.SUB_HEADER))
        items.add(ListItem(402, "Timeline", -1, MenuType.SUB_HEADER))
        items.add(ListItem(403, "Overlap", -1, MenuType.SUB_HEADER))
        items.add(ListItem(404, "Wizard", -1, MenuType.SUB_HEADER))
        items.add(ListItem(405, "Wizard Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(406, "Wizard Overlap", -1, MenuType.SUB_HEADER))
        items.add(ListItem(500, "Chips", R.drawable.ic_label, MenuType.HEADER))
        items.add(ListItem(501, "Basic", -1, MenuType.SUB_HEADER))
        items.add(ListItem(502, "Tag", -1, MenuType.SUB_HEADER))
        items.add(ListItem(600, "Dialogs", R.drawable.ic_picture_in_picture, MenuType.HEADER))
        items.add(ListItem(601, "Basic", -1, MenuType.SUB_HEADER))
        items.add(ListItem(602, "Fullscreen", -1, MenuType.SUB_HEADER))
        items.add(ListItem(603, "Custom", -1, MenuType.SUB_HEADER))
        items.add(ListItem(604, "Custom Info", -1, MenuType.SUB_HEADER))
        items.add(ListItem(605, "Custom Warning", -1, MenuType.SUB_HEADER))
        items.add(ListItem(606, "Custom Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(607, "Custom Dark", -1, MenuType.SUB_HEADER))
        items.add(ListItem(608, "Custom Add Post", -1, MenuType.SUB_HEADER))
        items.add(ListItem(609, "Custom Add Review", -1, MenuType.SUB_HEADER))
        items.add(ListItem(610, "GDPR Basic", -1, MenuType.SUB_HEADER))
        items.add(ListItem(611, "Term of Services", -1, MenuType.SUB_HEADER))
        items.add(ListItem(612, "Header", -1, MenuType.SUB_HEADER))
        items.add(ListItem(613, "Image", -1, MenuType.SUB_HEADER))
        items.add(ListItem(700, "Expansion Panels", R.drawable.ic_arrow_downward, MenuType.HEADER))
        items.add(ListItem(701, "Basic", -1, MenuType.SUB_HEADER))
        items.add(ListItem(702, "Invoice", -1, MenuType.SUB_HEADER))
        items.add(ListItem(703, "Ticket", -1, MenuType.SUB_HEADER))
        items.add(ListItem(800, "Grid", R.drawable.ic_apps, MenuType.HEADER))
        items.add(ListItem(801, "Basic", -1, MenuType.SUB_HEADER))
        items.add(ListItem(802, "Single Line", -1, MenuType.SUB_HEADER))
        items.add(ListItem(803, "Two Line", -1, MenuType.SUB_HEADER))
        items.add(ListItem(804, "Sectioned", -1, MenuType.SUB_HEADER))
        items.add(ListItem(805, "Albums", -1, MenuType.SUB_HEADER))
        items.add(ListItem(806, "Caller", -1, MenuType.SUB_HEADER))
        items.add(ListItem(900, "Lists", R.drawable.ic_view_stream, MenuType.HEADER))
        items.add(ListItem(901, "Basic", -1, MenuType.SUB_HEADER))
        items.add(ListItem(902, "Sectioned", -1, MenuType.SUB_HEADER))
        items.add(ListItem(903, "Animation", -1, MenuType.SUB_HEADER))
        items.add(ListItem(904, "Expand", -1, MenuType.SUB_HEADER))
        items.add(ListItem(905, "Draggable", -1, MenuType.SUB_HEADER))
        items.add(ListItem(906, "Swipe", -1, MenuType.SUB_HEADER))
        items.add(ListItem(907, "Multi Selection", -1, MenuType.SUB_HEADER))
        items.add(ListItem(2000, "Menu", R.drawable.ic_reoder, MenuType.HEADER))
        items.add(ListItem(2001, "Drawer News", -1, MenuType.SUB_HEADER))
        items.add(ListItem(2002, "Drawer Mail", -1, MenuType.SUB_HEADER))
        items.add(ListItem(2003, "Drawer Simple Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(2004, "Drawer Simple Dark", -1, MenuType.SUB_HEADER))
        items.add(ListItem(2005, "Drawer No Icon", -1, MenuType.SUB_HEADER))
        items.add(ListItem(2006, "Overflow Toolbar", -1, MenuType.SUB_HEADER))
        items.add(ListItem(2007, "Overflow List", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1000, "Pickers", R.drawable.ic_event, MenuType.HEADER))
        items.add(ListItem(1001, "Date Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1002, "Date Dark", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1003, "Time Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1004, "Time Dark", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1005, "Color RGB", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1006, "Location", -1, MenuType.SUB_HEADER))
        items.add(
            ListItem(
                1100,
                "Progress & Activity",
                R.drawable.ic_settings_backup_restore,
                MenuType.HEADER
            )
        )
        items.add(ListItem(1101, "Basic", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1102, "Linear Center", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1103, "Linear Top", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1104, "Circle Center", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1105, "On Scroll", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1106, "Pull Refresh", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1107, "Dots Bounce", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1108, "Dots Fade", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1109, "Dots Grow", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1200, "Sliders", R.drawable.ic_tune, MenuType.HEADER))
        items.add(ListItem(1201, "Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1202, "Dark", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1203, "Color Picker", -1, MenuType.SUB_HEADER))
        items.add(
            ListItem(
                1300,
                "Snackbars & Toasts",
                R.drawable.ic_wb_iridescent,
                true,
                MenuType.HEADER
            )
        )
        items.add(ListItem(1301, "Basic", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1302, "Lift FAB", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1303, "Toast Custom", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(1304, "Snackbar Custom", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(1400, "Steppers", R.drawable.ic_timeline, MenuType.HEADER))
        items.add(ListItem(1401, "Text", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1402, "Dots", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1403, "Progress", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1404, "Vertical", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1405, "Wizard Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1406, "Wizard Color", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1500, "Tabs", R.drawable.ic_tabs, MenuType.HEADER))
        items.add(ListItem(1501, "Basic", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1502, "Store", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1503, "Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1504, "Dark", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1505, "Icon", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1506, "Text & Icon", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1507, "Icon Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1508, "Icon Stack", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1509, "Scroll", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1510, "Round", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1600, "Form", R.drawable.ic_assignment, true, MenuType.HEADER))
        items.add(ListItem(1601, "Login", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1602, "Sign Up", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1603, "Profile Data", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1604, "With Icon", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1605, "Text Area", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1606, "Address", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(1607, "Checkout", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(1608, "Ecommerce", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(1609, "Sign Up Card", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(1610, "Sign Up Card Stack", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(1611, "Sign Up Dark", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(1612, "Sign Up Image", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(1613, "Sign Up Image Card", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(1614, "Sign Up Image Outline", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(1700, "Toolbars", R.drawable.ic_web_asset, MenuType.HEADER))
        items.add(ListItem(1701, "Basic", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1702, "Collapse", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1703, "Collapse And Pin", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1704, "Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1705, "Dark", -1, MenuType.SUB_HEADER))
        items.add(ListItem(-1, "Extra", -1, MenuType.DIVIDER))
        items.add(ListItem(1800, "Profile", R.drawable.ic_person, true, MenuType.HEADER))
        items.add(ListItem(1801, "Polygon", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1802, "Purple", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1803, "Red", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1804, "Blue Appbar", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1805, "Image Appbar", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1806, "Drawer Simple", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1807, "Drawer Image", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1808, "Gallery", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1809, "Gallery Two", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1810, "Card List", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1811, "Fab Menu", -1, MenuType.SUB_HEADER))
        items.add(ListItem(1812, "Card Header", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(1813, "Card Header Image", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(1814, "Card Overlap", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(1815, "Formal", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(1816, "Freelancer", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(1817, "Rating", -1, true, MenuType.SUB_HEADER))
        items.add(ListItem(1818, "Skills", -1, true, MenuType.SUB_HEADER))
        items.add(
            ListItem(
                19000,
                "No Item Page",
                R.drawable.ic_do_not_disturb_off,
                MenuType.HEADER
            )
        )
        items.add(ListItem(19001, "Archived", -1, MenuType.SUB_HEADER))
        items.add(ListItem(19002, "Search", -1, MenuType.SUB_HEADER))
        items.add(ListItem(19003, "Internet Icon", -1, MenuType.SUB_HEADER))
        items.add(ListItem(19004, "Internet Image", -1, MenuType.SUB_HEADER))
        items.add(ListItem(19005, "Bg City", -1, MenuType.SUB_HEADER))
        items.add(ListItem(19006, "Bg Cactus", -1, MenuType.SUB_HEADER))
        items.add(ListItem(19007, "Tabs", -1, MenuType.SUB_HEADER))
        items.add(ListItem(20000, "Player", R.drawable.ic_live_tv, MenuType.HEADER))
        items.add(ListItem(20001, "Music Basic", -1, MenuType.SUB_HEADER))
        items.add(ListItem(20002, "Music Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(20003, "Music Album Dark", -1, MenuType.SUB_HEADER))
        items.add(ListItem(20004, "Music Album Circle", -1, MenuType.SUB_HEADER))
        items.add(ListItem(20005, "Music Album Simple", -1, MenuType.SUB_HEADER))
        items.add(ListItem(20006, "Music Song List", -1, MenuType.SUB_HEADER))
        items.add(ListItem(20007, "Music Album Grid", -1, MenuType.SUB_HEADER))
        items.add(ListItem(20008, "Music Tabs", -1, MenuType.SUB_HEADER))
        items.add(ListItem(20009, "Music Tabs Icon", -1, MenuType.SUB_HEADER))
        items.add(ListItem(20010, "Music Genre", -1, MenuType.SUB_HEADER))
        items.add(ListItem(20011, "Music Genre Image", -1, MenuType.SUB_HEADER))
        items.add(ListItem(20012, "Music Genre Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(20011, "Music Genre Image", -1, MenuType.SUB_HEADER))
        items.add(ListItem(20012, "Music Genre Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(20013, "Video Basic", -1, MenuType.SUB_HEADER))
        items.add(ListItem(20014, "Video Simple", -1, MenuType.SUB_HEADER))
        items.add(ListItem(21000, "Timeline", R.drawable.ic_wrap_text, MenuType.HEADER))
        items.add(ListItem(21001, "Timeline Feed", -1, MenuType.SUB_HEADER))
        items.add(ListItem(21002, "Timeline Path", -1, MenuType.SUB_HEADER))
        items.add(ListItem(21003, "Timeline Dot Card", -1, MenuType.SUB_HEADER))
        items.add(ListItem(21004, "Timeline Twitter", -1, MenuType.SUB_HEADER))
        items.add(ListItem(21005, "Timeline Simple", -1, MenuType.SUB_HEADER))
        items.add(ListItem(22000, "Shopping", R.drawable.ic_shopping_cart, MenuType.HEADER))
        items.add(ListItem(22001, "Category List", -1, MenuType.SUB_HEADER))
        items.add(ListItem(22002, "Category Card", -1, MenuType.SUB_HEADER))
        items.add(ListItem(22003, "Category Image", -1, MenuType.SUB_HEADER))
        items.add(ListItem(22004, "Sub Category Tabs", -1, MenuType.SUB_HEADER))
        items.add(ListItem(22005, "Product Grid", -1, MenuType.SUB_HEADER))
        items.add(ListItem(22006, "Product Details", -1, MenuType.SUB_HEADER))
        items.add(ListItem(22007, "Product Adv Details", -1, MenuType.SUB_HEADER))
        items.add(ListItem(22008, "Checkout Card", -1, MenuType.SUB_HEADER))
        items.add(ListItem(22009, "Checkout Step", -1, MenuType.SUB_HEADER))
        items.add(ListItem(22010, "Checkout One Page", -1, MenuType.SUB_HEADER))
        items.add(ListItem(22011, "Checkout Timeline", -1, MenuType.SUB_HEADER))
        items.add(ListItem(22012, "Cart Simple", -1, MenuType.SUB_HEADER))
        items.add(ListItem(22013, "Cart Card", -1, MenuType.SUB_HEADER))
        items.add(ListItem(22014, "Cart Dark", -1, MenuType.SUB_HEADER))
        items.add(ListItem(23000, "Search Page", R.drawable.ic_search, MenuType.HEADER))
        items.add(ListItem(23001, "Toolbar Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(23002, "Toolbar Dark", -1, MenuType.SUB_HEADER))
        items.add(ListItem(23003, "Store", -1, MenuType.SUB_HEADER))
        items.add(ListItem(23004, "Primary", -1, MenuType.SUB_HEADER))
        items.add(ListItem(23005, "Primary Bg", -1, MenuType.SUB_HEADER))
        items.add(ListItem(23006, "History Card", -1, MenuType.SUB_HEADER))
        items.add(ListItem(23007, "City", -1, MenuType.SUB_HEADER))
        items.add(ListItem(23008, "Filter Hotel", -1, MenuType.SUB_HEADER))
        items.add(ListItem(23009, "Filter Product", -1, MenuType.SUB_HEADER))
        items.add(ListItem(23010, "Filter Property", -1, MenuType.SUB_HEADER))
        items.add(ListItem(24000, "Slider Image", R.drawable.ic_photo_library, MenuType.HEADER))
        items.add(ListItem(24001, "Header", -1, MenuType.SUB_HEADER))
        items.add(ListItem(24002, "Header Auto", -1, MenuType.SUB_HEADER))
        items.add(ListItem(24003, "Card", -1, MenuType.SUB_HEADER))
        items.add(ListItem(24004, "Card Auto", -1, MenuType.SUB_HEADER))
        items.add(ListItem(25000, "Settings", R.drawable.ic_settings, MenuType.HEADER))
        items.add(ListItem(25001, "Sectioned", -1, MenuType.SUB_HEADER))
        items.add(ListItem(25002, "Flat", -1, MenuType.SUB_HEADER))
        items.add(ListItem(25003, "Profile", -1, MenuType.SUB_HEADER))
        items.add(ListItem(25004, "Profile Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(26000, "Verification", R.drawable.ic_check_circle, MenuType.HEADER))
        items.add(ListItem(26001, "Phone", -1, MenuType.SUB_HEADER))
        items.add(ListItem(26002, "Code", -1, MenuType.SUB_HEADER))
        items.add(ListItem(26003, "Header", -1, MenuType.SUB_HEADER))
        items.add(ListItem(26004, "Image", -1, MenuType.SUB_HEADER))
        items.add(ListItem(26005, "Blue", -1, MenuType.SUB_HEADER))
        items.add(ListItem(26006, "Orange", -1, MenuType.SUB_HEADER))
        items.add(ListItem(27000, "Login", R.drawable.ic_https, MenuType.HEADER))
        items.add(ListItem(27001, "Simple Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(27002, "Simple Dark", -1, MenuType.SUB_HEADER))
        items.add(ListItem(27003, "Simple Green", -1, MenuType.SUB_HEADER))
        items.add(ListItem(27004, "Image Teal", -1, MenuType.SUB_HEADER))
        items.add(ListItem(27005, "Card Light", -1, MenuType.SUB_HEADER))
        items.add(ListItem(27006, "Card Overlap", -1, MenuType.SUB_HEADER))
        items.add(ListItem(28000, "Payment", R.drawable.ic_monetization_on, MenuType.HEADER))
        items.add(ListItem(28001, "Card Collections", -1, MenuType.SUB_HEADER))
        items.add(ListItem(28002, "Card Details", -1, MenuType.SUB_HEADER))
        items.add(ListItem(28003, "Form", -1, MenuType.SUB_HEADER))
        items.add(ListItem(28004, "Profile", -1, MenuType.SUB_HEADER))
        items.add(ListItem(28005, "Success Dialog", -1, MenuType.SUB_HEADER))
        items.add(ListItem(29000, "Dashboard", R.drawable.ic_event_seat, MenuType.HEADER))
        items.add(ListItem(29001, "Grid Fab", -1, MenuType.SUB_HEADER))
        items.add(ListItem(29002, "Statistics", -1, MenuType.SUB_HEADER))
        items.add(ListItem(29003, "Pay Bill", -1, MenuType.SUB_HEADER))
        items.add(ListItem(29004, "Flight", -1, MenuType.SUB_HEADER))
        items.add(ListItem(29005, "Wallet", -1, MenuType.SUB_HEADER))
        items.add(ListItem(29006, "Wallet Green", -1, MenuType.SUB_HEADER))
        items.add(ListItem(29007, "Finance", -1, MenuType.SUB_HEADER))
        items.add(ListItem(29008, "Cryptocurrency", -1, MenuType.SUB_HEADER))
        items.add(ListItem(30000, "Article", R.drawable.ic_subject, MenuType.HEADER))
        items.add(ListItem(30001, "Simple", -1, MenuType.SUB_HEADER))
        items.add(ListItem(30002, "Medium", -1, MenuType.SUB_HEADER))
        items.add(ListItem(30003, "Medium Dark", -1, MenuType.SUB_HEADER))
        items.add(ListItem(30004, "Big Header", -1, MenuType.SUB_HEADER))
        items.add(ListItem(30005, "Stepper", -1, MenuType.SUB_HEADER))
        items.add(ListItem(30006, "Card", -1, MenuType.SUB_HEADER))
        items.add(ListItem(30007, "Food", -1, MenuType.SUB_HEADER))
        items.add(ListItem(30008, "Food Review", -1, MenuType.SUB_HEADER))
        items.add(ListItem(31000, "About", R.drawable.ic_perm_device_info, MenuType.HEADER))
        items.add(ListItem(31001, "App", -1, MenuType.SUB_HEADER))
        items.add(ListItem(31002, "App Simple", -1, MenuType.SUB_HEADER))
        items.add(ListItem(31003, "App Simple Blue", -1, MenuType.SUB_HEADER))
        items.add(ListItem(31004, "Company", -1, MenuType.SUB_HEADER))
        items.add(ListItem(31005, "Company Image", -1, MenuType.SUB_HEADER))
        items.add(ListItem(31006, "Company Card", -1, MenuType.SUB_HEADER))
        items.add(ListItem(31007, "Dialog Main Action", -1, MenuType.SUB_HEADER))
        items.add(ListItem(-1, "Application", -1, MenuType.DIVIDER))
        items.add(ListItem(1, "About", R.drawable.ic_error_outline, MenuType.NORMAL))
        return items
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_activity_main, menu)
        Tools.changeMenuIconColor(menu, Color.WHITE)
        Tools.changeOverflowMenuIconColor(toolbar, Color.WHITE)
        val menuItem = menu.findItem(R.id.action_notifications)
        val actionView = MenuItemCompat.getActionView(menuItem)
        notif_badge = actionView.findViewById(R.id.notif_badge)
        setupBadge()
        actionView.setOnClickListener { onOptionsItemSelected(menuItem) }
        return true
    }

    private fun setupBadge() {
        if (notif_badge == null) return
        if (notification_count == 0) {
            notif_badge!!.visibility = View.GONE
        } else {
            notif_badge!!.visibility = View.VISIBLE
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val item_id = item.itemId
        if (item_id == R.id.action_portfolio) {
            Tools.openInAppBrowser(this, "http://portfolio.dream-space.web.id/", false)
        } else if (item_id == R.id.action_notifications) {
            ActivityNotifications.navigate(this)
        } else if (item_id == R.id.action_rate) {
            Tools.rateAction(this)
        } else if (item_id == R.id.action_about) {
            showDialogAbout()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun initDrawerMenu() {
        val nav_view =
            findViewById<View>(R.id.nav_view) as NavigationView
        drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        val toggle: ActionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            drawer,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        ) {
            override fun onDrawerOpened(drawerView: View) {
                updateCounter(nav_view)
                super.onDrawerOpened(drawerView)
            }
        }
        drawer!!.setDrawerListener(toggle)
        toggle.syncState()
        nav_view.setNavigationItemSelectedListener { item ->
            val item_id = item.itemId
            if (item_id == R.id.action_portfolio) {
                Tools.openInAppBrowser(
                    this@MainMenu,
                    "http://portfolio.dream-space.web.id/",
                    false
                )
            } else if (item_id == R.id.action_notifications) {
                ActivityNotifications.navigate(this@MainMenu)
            } else if (item_id == R.id.action_rate) {
                Tools.rateAction(this@MainMenu)
            } else if (item_id == R.id.action_about) {
                showDialogAbout()
            }
            true
        }

        // navigation header
        navigation_header = nav_view.getHeaderView(0)
        val tv_new_version =
            navigation_header.findViewById<View>(R.id.tv_new_version) as TextView
        val bt_update =
            navigation_header.findViewById<View>(R.id.bt_update) as ImageButton
        if (Tools.getVersionCode(this) >= remoteConfig.getAppVersion()) {
            tv_new_version.visibility = View.GONE
            bt_update.visibility = View.GONE
        }
        bt_update.setOnClickListener { Tools.rateAction(this@MainMenu) }
    }

    private fun updateCounter(nav: NavigationView) {
        val m = nav.menu
        val drw_notif_badge =
            m.findItem(R.id.action_notifications).actionView
                .findViewById<View>(R.id.notif_badge)
        if (notification_count == 0) {
            drw_notif_badge.visibility = View.GONE
        } else {
            drw_notif_badge.visibility = View.VISIBLE
        }
    }

    override fun onResume() {
        super.onResume()
        if (mAdView != null) mAdView.resume()
        val new_notif_count: Int = dao.getNotificationUnreadCount()
        if (new_notif_count != notification_count) {
            notification_count = new_notif_count
            invalidateOptionsMenu()
        }
    }

    override fun onPause() {
        super.onPause()
        if (mAdView != null) mAdView.pause()
    }

    override fun onBackPressed() {
        doExitApp()
    }

    private var exitTime: Long = 0
    fun doExitApp() {
        if (System.currentTimeMillis() - exitTime > 2000) {
            Toast.makeText(this, "Press again to exit app", Toast.LENGTH_SHORT).show()
            exitTime = System.currentTimeMillis()
        } else {
            finish()
        }
    }

    private fun showDialogAbout() {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE) // before
        dialog.setContentView(R.layout.dialog_about)
        dialog.setCancelable(true)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialog.window!!.attributes)
        lp.width = WindowManager.LayoutParams.WRAP_CONTENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT
        (dialog.findViewById<View>(R.id.tv_version) as TextView).text =
            "Version " + BuildConfig.VERSION_NAME
        (dialog.findViewById(R.id.bt_getcode) as View).setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("https://codecanyon.net/user/dream_space/portfolio")
            startActivity(i)
        }
        (dialog.findViewById<View>(R.id.bt_close) as ImageButton).setOnClickListener { dialog.dismiss() }
        (dialog.findViewById<View>(R.id.bt_rate) as Button).setOnClickListener {
            Tools.rateAction(
                this@MainMenu
            )
        }
        (dialog.findViewById<View>(R.id.bt_portfolio) as Button).setOnClickListener {
            Tools.openInAppBrowser(
                this@MainMenu,
                "http://portfolio.dream-space.web.id/",
                false
            )
        }
        sharedPref.setFirstLaunch(false)
        dialog.show()
        dialog.window!!.attributes = lp
    }

    private fun showDialogOffer() {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE) // before
        dialog.setContentView(R.layout.dialog_offer)
        dialog.setCancelable(true)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialog.window!!.attributes)
        lp.width = WindowManager.LayoutParams.WRAP_CONTENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT
        (dialog.findViewById(R.id.bt_getcode) as View).setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("https://codecanyon.net/user/dream_space/portfolio")
            startActivity(i)
        }
        sharedPref.setFirstLaunch(false)
        dialog.show()
        dialog.window!!.attributes = lp
    }

    private var mInterstitialAd: InterstitialAd? = null
    private fun prepareBanner() {
        val ad_container =
            findViewById<View>(R.id.ad_container) as LinearLayout
        if (NetworkCheck.isConnect(applicationContext)) {
            mAdView = AdView(this)
            mAdView.setAdSize(AdSize.BANNER)
            mAdView.setAdUnitId(remoteConfig.getBannerUnitId())
            ad_container.addView(mAdView)
            mAdView.loadAd(
                Builder()
                    .addNetworkExtrasBundle(AdMobAdapter::class.java, GDPR.getBundleAd(this))
                    .build()
            )
        } else {
            ad_container.visibility = View.GONE
        }
    }

    private fun prepareInterstitial() {
        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.setAdUnitId(remoteConfig.getInterstitialUnitId())
        mInterstitialAd.loadAd(
            Builder()
                .addNetworkExtrasBundle(AdMobAdapter::class.java, GDPR.getBundleAd(this)).build()
        )
        mInterstitialAd.setAdListener(object : AdListener() {
            fun onAdClosed() {
                prepareInterstitial()
                super.onAdClosed()
            }
        })
    }

    /* show ads */
    fun showInterstitial(): Boolean {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show()
            return true
        }
        return false
    }

    public override fun onStart() {
        super.onStart()
        active = true
    }

    override fun onDestroy() {
        super.onDestroy()
        active = false
    }

    companion object {
        var active = false
    }
}
