fun checkArmstrong() {
    var num = 153
    var remainder: Int
    val arr = ArrayList<Int>()
    val originalNum = num

    while (num != 0) {
        remainder = num % 10
        arr.add(remainder)
        num /= 10
    }
    arr.reverse()
    var temp = 0
    arr.forEach { temp += calPow(it, arr.size) }
    if (originalNum == temp) println("$originalNum is Armstrong number")
    else println("$originalNum is not Armstrong number")
}
private fun calPow(i: Int, size: Int): Int {
    var result = 1
    for (j in 1..size) result *= i
    return result
}
fun main() {
    checkArmstrong()
}