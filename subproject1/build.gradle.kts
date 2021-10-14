plugins {
    java
    kotlin("jvm")

    id("io.qameta.allure") version Vers.allure_plugin
    id("io.qameta.allure-adapter") version Vers.allure_plugin
}

allure {
    adapter {
        autoconfigure.set(false)
        version.set(Vers.allure_cli)
    }
}

dependencies {
    implementation(Libs.slf4j_api)

    implementation(Libs.kotlin_stdlib)
    implementation(Libs.kotlin_jdk8)
    implementation(Libs.kotlinx_coroutines_core)
    implementation(Libs.kotlin_reflect)

    testImplementation(Libs.kotest_assertions)
    testImplementation(Libs.kotest_runner)
    testImplementation(Libs.kotest_allure)

    testImplementation(Libs.log4j_slf4j_impl)
    testImplementation(Libs.log4j_kotlin)
    testImplementation(Libs.kotlinx_coroutines_core)
    testImplementation(Libs.junit_jupiter_engine)
    testImplementation(Libs.junit_jupiter_api)

}
