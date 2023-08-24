package leetcode

fun printPairs(listOf: List<Int>, listOf1: List<Int>, x: Int): List<Pair<Int, Int>> {
    val result: MutableList<Pair<Int, Int>> = mutableListOf()
    for (i in listOf.indices) {

        for (j in listOf1.indices) {
            if (listOf[i] + listOf1[j] == x) {
                result.add(Pair(listOf[i], listOf1[i]))
            }
        }
    }
    return result
}
//ak.lo;l
fun main() {
    println(printPairs(listOf(1, 2, 4, 5, 7), listOf(5, 6, 3, 4, 8), 9))
}