package kotest.suspend.tests.subproject1

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.apache.logging.log4j.kotlin.Logging

class ProdServiceFunSpec2Test : FunSpec({
    test("test-01") {
        logger.info("spec2-test-01 start")
        ProdService().functionality1("input").shouldBe("input-output1")
        logger.info("spec2-test-01 end")
    }

    test("test-02") {
        logger.info("spec2-test-02 start")
        ProdService().functionality1("input").shouldBe("input-output1")
        logger.info("spec2-test-02 end")
    }

    test("test-03") {
        logger.info("spec2-test-03 start")
        ProdService().functionality1("input").shouldBe("input-output1")
        logger.info("spec2-test-03 end")
    }

    test("test-04") {
        logger.info("spec2-test-04 start")
        ProdService().functionality1("input").shouldBe("input-output1")
        logger.info("spec2-test-04 end")
    }

    test("test-05") {
        logger.info("spec2-test-05 start")
        ProdService().functionality1("input").shouldBe("input-output1")
        logger.info("spec2-test-05 end")
    }
}) {
    companion object : Logging
}