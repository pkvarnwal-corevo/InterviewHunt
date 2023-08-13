package calPow

import kotlin.math.absoluteValue

class CalPow {

    fun myPow(x: Double, n: Int): Double {
        var result = 1.0
        val po = n.absoluteValue

        for (i in 1..po) {
            result *= x
        }

        if (n < 0) {
            result = 1/result
        }
        return result
    }
}

fun main() {
    val x = 2.00000
    val n = -2
    val cp = CalPow()
    val result = cp.myPow(x, n)
    println(result)
}