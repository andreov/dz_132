import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun typeCommission_yes_Maestro() {
        val cardType = "Maestro"
        val prevAmount = 76000 * 100
        val amount = 10000 * 100

        val result: Double = typeCommission(
            cardType = cardType,
            prevAmount = prevAmount,
            amount = amount
        )

        assertEquals(8000.0, result, 0.0)
    }

    @Test
    fun typeCommission_not_Maestro() {
        val cardType = "Maestro"
        val prevAmount = 74000 * 100
        val amount = 10000 * 100

        val result: Double = typeCommission(
            cardType = cardType,
            prevAmount = prevAmount,
            amount = amount
        )
        assertEquals(0.0, result, 0.0)
    }

    @Test
    fun typeCommission_yes_VKPay() {
        val cardType = "VKPay"
        val prevAmount = 760000 * 100
        val amount = 10000 * 100

        val result: Double = typeCommission(
            cardType = cardType,
            prevAmount = prevAmount,
            amount = amount
        )
        assertEquals(0.0, result, 0.0)
    }

    @Test
    fun typeCommission_not_VKPay() {
        val cardType = "VKPay"
        val prevAmount = 0
        val amount = 1000000

        val result: Double = typeCommission(
            cardType = cardType,
            prevAmount = prevAmount,
            amount = amount
        )
        assertEquals(0.0, result, 0.0)
    }

    @Test
    fun typeCommission_yes_MasterCard() {
        val cardType = "MasterCard"
        val prevAmount = 10000000
        val amount = 1000000

        val result: Double = typeCommission(
            cardType = cardType,
            prevAmount = prevAmount,
            amount = amount
        )
        assertEquals(8000.0, result, 0.0)
    }

    @Test
    fun typeCommission_not_MasterCard() {
        val cardType = "MasterCard"
        val prevAmount = 0
        val amount = 1000000

        val result: Double = typeCommission(
            cardType = cardType,
            prevAmount = prevAmount,
            amount = amount
        )
        assertEquals(0.0, result, 0.0)

    }

}