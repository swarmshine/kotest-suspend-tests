package kotest.suspend.tests.subproject1

import io.kotest.common.ExperimentalKotest
import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.config.Configuration
import io.kotest.core.listeners.Listener

object ProjectConfig : AbstractProjectConfig() {

    @ExperimentalKotest
    override val concurrentSpecs = Configuration.MaxConcurrency

    @ExperimentalKotest
    override val concurrentTests = Configuration.MaxConcurrency

    override val parallelism = 10


}