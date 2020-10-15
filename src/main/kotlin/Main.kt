fun main() {
    println("Коммисия за перевод: ${main2("Maestro",10000000,amount = 1000000)} коп.")
}

fun main2 (cardType:String = "VKPay", prevAmount:Int=0, amount:Int):Double {
    val commission = if(prevAmount >= 75000*100) amount*0.6/100+2000 else 0.0
    val resultCommission = when(cardType){
        "MasterCard" -> commission
        "Maestro" -> commission
        else -> 0.0
    }
    return resultCommission

}