plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.myiconpack"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myiconpack"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    // Pure icon packs do not require extra Java dependencies
}