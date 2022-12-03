private const val kotlinVersion = "1.7.20"
private const val hiltVersion = "2.44"
private const val lifecycleVersion = "2.5.1"
private const val navVersion = "2.5.3"
private const val rxVersion = "3.0.0"
//private const val glideVersion = "4.12.0"
//private const val exoPlayerVersion = "2.13.2"
private const val retrofitVersion = "2.9.0"
//private const val roomVersion = "2.2.6"

object Deps {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
    const val coreKtx = "androidx.core:core-ktx:1.9.0"
    const val appCompat = "androidx.appcompat:appcompat:1.3.1"
    const val material = "com.google.android.material:material:1.3.0"
    const val constraint = "androidx.constraintlayout:constraintlayout:2.0.4"
//    const val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
//    const val viewPager2 = "androidx.viewpager2:viewpager2:1.0.0"
//    const val activityKtx = "androidx.activity:activity-ktx:1.6.0"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:1.5.4"

//    const val gmsLocation = "com.google.android.gms:play-services-location:18.0.0"

    const val hilt = "com.google.dagger:hilt-android:$hiltVersion"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:$hiltVersion"

    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
    const val lifecycleCommon  = "androidx.lifecycle:lifecycle-common-java8:$lifecycleVersion"

    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:$navVersion"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:$navVersion"

    const val rxAndroid = "io.reactivex.rxjava3:rxandroid:$rxVersion"
    const val rxJava = "io.reactivex.rxjava3:rxjava:$rxVersion"

    const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
    const val retrofitRxAdapter = "com.github.akarnokd:rxjava3-retrofit-adapter:3.0.0"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
    const val okHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:4.9.0"

//    const val room = "androidx.room:room-runtime:$roomVersion"
//    const val roomCompiler = "androidx.room:room-compiler:$roomVersion"

//    const val localeChanger = "com.github.franmontiel:LocaleChanger:1.1"

//    const val viewPager2Indicator = "me.relex:circleindicator:2.1.6"

//    const val shimmerFacebook = "com.facebook.shimmer:shimmer:0.5.0"

//    const val glide = "com.github.bumptech.glide:glide:$glideVersion"
//    const val glideProcessor = "com.github.bumptech.glide:compiler:$glideVersion"

//    const val imageGallery = "com.github.MikeOrtiz:TouchImageView:1.4.1"
//    const val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"

//    const val exoPlayerCore = "com.google.android.exoplayer:exoplayer-core:$exoPlayerVersion"
//    const val exoPlayerHls = "com.google.android.exoplayer:exoplayer-hls:$exoPlayerVersion"

//    const val customSwitch = "com.github.zcweng:switch-button:0.0.3@aar"

//    const val circleImageView = "com.mikhaellopez:circularimageview:4.3.0"

//    const val firebaseBom = "com.google.firebase:firebase-bom:28.4.0"
//    const val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics-ktx"
//    const val firebaseAnalytics = "com.google.firebase:firebase-analytics-ktx"
}

object Plugins {
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val androidGradleTools = "com.android.tools.build:gradle:7.3.1"
    const val hiltGradle = "com.google.dagger:hilt-android-gradle-plugin:$hiltVersion"

    const val kapt = "kotlin-kapt"
    const val hilt = "dagger.hilt.android.plugin"

    const val androidApp = "com.android.application"
    const val androidLib = "com.android.library"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinParcelize = "kotlin-parcelize"

    const val kotlin = "kotlin"
    const val javaLib = "java-library"

    const val safeArgsGradle = "androidx.navigation:navigation-safe-args-gradle-plugin:$navVersion"
    const val safeArgs = "androidx.navigation.safeargs.kotlin"

    const val googleServicesGradle = "com.google.gms:google-services:4.3.10"
    const val googleServices = "com.google.gms.google-services"

    const val crashlyticsGradle = "com.google.firebase:firebase-crashlytics-gradle:2.7.1"
    const val crashlytics= "com.google.firebase.crashlytics"
}

object TestDeps {
    const val junit = "junit:junit:4.13.2"
    const val androidExtJunit = "androidx.test.ext:junit:1.1.2"
    const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
}