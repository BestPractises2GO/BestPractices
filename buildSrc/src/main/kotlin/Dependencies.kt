
object Dependencies{
    val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
    val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    val lifecycle_compiler = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"
    val lifecycle_testing = "androidx.arch.core:core-testing:${Versions.lifecycle_test}"

    val koin_core = "org.koin:koin-core:${Versions.koin}"
    val koin_android = "org.koin:koin-android:${Versions.koin}"
    val koin_viewmodel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"

    val coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    val coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    val coroutines_test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
}