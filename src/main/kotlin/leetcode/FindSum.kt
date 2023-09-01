package leetcode

fun printPairs(listOf1: List<Int>, listOf2: List<Int>, x: Int): List<Pair<Int, Int>> {
    val result: MutableList<Pair<Int, Int>> = mutableListOf()
    for (i in listOf1.indices) {

        for (j in listOf2.indices) {
            if (listOf1[i] + listOf2[j] == x) {
                result.add(Pair(listOf1[i], listOf2[i]))
            }
        }
    }
    return result
}
//ak.lo;l
fun main() {
    println(printPairs(listOf(1, 2, 4, 5, 7), listOf(5, 6, 3, 4, 8), 9))
}