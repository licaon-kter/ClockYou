// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    dependencies {
        // Add this line
        classpath(libs.kotlin.gradle.plugin)
    }
    repositories {
        mavenCentral()
    }
}

plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.kotlinAndroid) apply false
    alias(libs.plugins.library) apply false

}
true // Needed to make the Suppress annotation work for the plugins block


