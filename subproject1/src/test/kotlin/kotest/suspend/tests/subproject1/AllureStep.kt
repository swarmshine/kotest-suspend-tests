package kotest.suspend.tests.subproject1

import io.qameta.allure.Step
import org.apache.logging.log4j.kotlin.Logging

class AllureStep {
    companion object: Logging

    @Step("nice step")
    fun myInterestingStep(){
        logger.info("allure step")
    }
}