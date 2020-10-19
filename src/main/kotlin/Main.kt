fun main() {
    println("Коммисия за перевод: ${typeCommission("Maestro", 76000*100, 10000*100)} коп.")
}

fun typeCommission(cardType: String, prevAmount: Int, amount: Int): Double {
    val resultCommission = when (cardType) {
        "MasterCard" -> if (prevAmount >= 75000 * 100) amount * 0.6 / 100 + 2000 else 0.0
        "Maestro" -> if (prevAmount >= 75000 * 100) amount * 0.6 / 100 + 2000 else 0.0
        else -> 0.0
    }
    return resultCommission

}