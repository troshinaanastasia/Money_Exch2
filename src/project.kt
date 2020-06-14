fun calDoll(rub: Int = 1000): Double{
    val Dollconst = 74

    return rub.toDouble()/Dollconst
}

fun main(args: Array<String>){
    val rub_user: String? = readLine()

    if (rub_user ==null) return

    val rub: Int = rub_user.toInt()

    var Doll: Double = calDoll(rub)

    val number:Double = Doll
    val number3digits:Double = Math.round(number * 1000.0) / 1000.0
    Doll = Math.round(number3digits * 100.0) / 100.0

    println(" You entered ${rub} rubles.")
    println(" ${rub} rubles is ${Doll} dollars.")
}