plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(29)
    buildToolsVersion = "29.0.1"
    defaultConfig {
        applicationId = "de.fred.bestpractices"
        minSdkVersion(23)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled  = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    dataBinding {
        isEnabled = true
    }

    compileOptions {
        setSourceCompatibility(JavaVersion.VERSION_1_8)
        setTargetCompatibility(JavaVersion.VERSION_1_8)
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}")
    implementation("androidx.appcompat:appcompat:1.0.2")
    implementation("androidx.core:core-ktx:1.0.2")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")

    //architecture components
    implementation(Dependencies.lifecycle_extensions)
    implementation(Dependencies.lifecycle_compiler)
    testImplementation(Dependencies.lifecycle_testing)

    //Koin
    implementation(Dependencies.koin_core)
    implementation(Dependencies.koin_android)
    implementation(Dependencies.koin_viewmodel)
    compileOnly("com.squareup.inject:assisted-inject-annotations:0.5.0")
    annotationProcessor("com.squareup.inject:assisted-inject-processor:0.5.0")

    //coroutines
    implementation(Dependencies.coroutines_core)
    implementation(Dependencies.coroutines_android)
    testImplementation(Dependencies.coroutines_test)

    //Viewpager2
    implementation("androidx.viewpager2:viewpager2:1.0.0-beta03")

    //material
    implementation("com.google.android.material:material:1.1.0-alpha09")

    implementation(
      group = "org.amshove.kluent",  name = "kluent-android", version = "1.53"
    )
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.1.0")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test:runner:1.2.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
}
