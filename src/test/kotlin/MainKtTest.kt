import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun typeCommission_yes() {
        val cardType = "Maestro"
        val prevAmount = 10000000
        val amount = 1000000

        val result:Double = typeCommission(
            cardType = cardType,
            prevAmount = prevAmount,
            amount = amount
        )
        assertEquals(8000.0, result,0.0)
    }

    @Test
    fun typeCommission_not() {
        val cardType = "Maestro"
        val prevAmount = 74000*100
        val amount = 1000000

        val result:Double = typeCommission(
            cardType = cardType,
            prevAmount = prevAmount,
            amount = amount
        )
        assertEquals(0.0, result,0.0)
    }
}