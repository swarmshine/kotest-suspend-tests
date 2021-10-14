object Vers {
    //Plugins
    const val allure_plugin = "2.9.6"
    const val allure_cli = "2.15.0"

    //Dependencies
    const val kotlin = "1.5.31"
    const val kotlin_gradle = "1.5.21"
    const val kotlin_coroutines = "1.5.2"


    const val junit_jupiter = "5.8.1"
    const val slf4j = "1.7.32"
    const val log4j = "2.14.1"

    const val kotest = "5.0.0.M2"
}

object Libs {
    //Plugins

    //Dependencies
    const val gradle_kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlin_gradle}"
    const val gradle_kotlin_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Vers.kotlin_gradle}"

    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlin}"
    const val kotlin_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Vers.kotlin}"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Vers.kotlin}"
    const val kotlinx_coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Vers.kotlin_coroutines}"


    const val slf4j_api = "org.slf4j:slf4j-api:${Vers.slf4j}"
    const val log4j_slf4j_impl = "org.apache.logging.log4j:log4j-slf4j-impl:${Vers.log4j}"
    const val log4j_kotlin = "org.apache.logging.log4j:log4j-api-kotlin:1.0.0"

    const val junit_jupiter_engine = "org.junit.jupiter:junit-jupiter-engine:${Vers.junit_jupiter}"
    const val junit_jupiter_api = "org.junit.jupiter:junit-jupiter-api:${Vers.junit_jupiter}"

    const val kotest_assertions = "io.kotest:kotest-assertions-core-jvm:${Vers.kotest}"
    const val kotest_runner = "io.kotest:kotest-runner-junit5-jvm:${Vers.kotest}"
    const val kotest_allure = "io.kotest.extensions:kotest-extensions-allure:1.0.3"



}
