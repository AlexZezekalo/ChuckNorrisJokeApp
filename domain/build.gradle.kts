plugins {
    alias(libs.plugins.kotlin.jvm)
}
dependencies {
    implementation(project(":common"))
    implementation(libs.kotlinx.coroutines.core)
}