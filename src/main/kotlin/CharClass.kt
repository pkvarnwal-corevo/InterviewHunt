import kotlin.Char

class CharClass {

    //return a value decremented by 1
    fun decrement() {
        val a = 3
        val b = a.dec()

        println(a)
        println(b)
    }

    fun increment() {
        val a = 3
        val b = a.inc()
        println(a)
        println(b)
    }


}

fun main() {
    val c = CharClass()
    c.decrement()
    c.increment()
}