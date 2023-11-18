pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    plugins{
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion
    }
}



rootProject.name = "Lesson_kotlin1"

include("m1l1-first-app")
include("m1l1-first-app")