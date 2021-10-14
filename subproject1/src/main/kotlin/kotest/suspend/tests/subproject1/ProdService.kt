package kotest.suspend.tests.subproject1
import kotlinx.coroutines.delay
import kotlin.coroutines.*

class ProdService {
    suspend fun functionality1(input: String): String {
        delay(10_000L)
        return "$input-output1"
    }
}