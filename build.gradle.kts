plugins {
    alias(libs.plugins.compose) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
}

tasks {
    wrapper {
        gradleVersion = project.properties["gradle.version"].toString()
    }
}
