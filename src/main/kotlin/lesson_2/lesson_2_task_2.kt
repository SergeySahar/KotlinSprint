package lesson_2

fun main() {

    val workers: Int = 50
    val cash: Int = 30000
    val sum = (workers * cash) //сумма постоянная

    val intercessor: Int = 30
    val lowCash: Int = 20000
    val sum1 = (intercessor * lowCash) //сумма стажерская

    val totalSum = (sum + sum1) //общая сумма по зп
    val staff = (workers + intercessor) //общее колличество работников

    var employees: Int = 2000

    println(workers)
    println(cash)
    println(sum)
    println(intercessor)
    println(lowCash)
    println(sum1)
    println(sum + sum1)
    println(totalSum / staff) //усредненная зп сотрудника
    //println(employees) /* один уволился */

    employees-- //декремент увольнение 1 сотрудника
    println(employees)

}