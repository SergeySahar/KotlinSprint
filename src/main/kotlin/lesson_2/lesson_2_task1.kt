package lesson_2

fun main() {

    val workers: Int = 50
    val cash: Int = 30000
    val sum = (workers * cash) //сумма постоянная

    val intercessor: Int = 30
    val lowCash: Int = 20000
    val sum1 = (intercessor * lowCash) //сумма стажерская

    val e = (sum + sum1)
    val f = (workers + intercessor)

    println(sum)
    println(sum + sum1)
    println(e / f) //усредненная зп сотрудника

}