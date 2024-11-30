package mapswap

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import ru.otus.homework.mapswap.swap

class MapSwapKtTest {
    @Test
    fun swapsIntAndString() {
        val source = mapOf(
            1 to "one",
            2 to "two",
            3 to "three"
        )
        assertEquals(
            mapOf(
                "one" to 1,
                "two" to 2,
                "three" to 3
            ),
            source.swap()
        )
    }
}