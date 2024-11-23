plugins {
    alias(libs.plugins.kotlin.jvm) apply false
}

tasks {
    wrapper {
        gradleVersion = project.properties["gradleVersion"].toString()
    }
}
