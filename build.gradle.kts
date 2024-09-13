// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    // kotlin 2.0 버전 이후 전용 컴포즈 컴파일러 추가
    alias(libs.plugins.compose.compiler) apply false
    // hilt
    alias(libs.plugins.hilt) apply false
    // ksp
    id("com.google.devtools.ksp") version "2.0.0-1.0.22" apply false
}