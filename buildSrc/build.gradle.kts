import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}
repositories {
    mavenCentral()
    google()
}
gradlePlugin {
    plugins {
        register("AnrSpyPlugin") {
            group = "io.github.farimarwat"
            id = "AnrSpyPlugin"
            implementationClass = "pk.farimarwat.anrspyplugin.AnrSpyPlugin"
        }
    }
}