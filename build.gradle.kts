import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenCentral()
        mavenLocal()
    }
    dependencies {
        classpath(Libs.gradle_kotlin_stdlib)
        classpath(Libs.gradle_kotlin_jdk8)
    }
}

plugins {
    kotlin("jvm") version Vers.kotlin apply false
}



subprojects {
    group = "kotest-suspend-tests"

    apply {
        plugin("java")
    }

    repositories {
        mavenCentral()
        mavenLocal()
    }

    tasks {
        withType<KotlinCompile> {
            kotlinOptions {
                jvmTarget = "11"
            }
        }
        withType<Test> {
            useJUnitPlatform()

            maxParallelForks = 10

            testLogging {
                events(TestLogEvent.PASSED, TestLogEvent.FAILED, TestLogEvent.SKIPPED)
                showStandardStreams = true
                showExceptions = true
                exceptionFormat = TestExceptionFormat.FULL
            }
        }
    }
}

