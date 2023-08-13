package string

class StringRe {

    fun swipe() {
        val str = "123 345 456 453"

        val arr = str.split(" ").toMutableList()

       arr [arr.size - 1] = "XYZ"
       println(arr)
    }
}

fun main() {
    val sr = StringRe()
    sr.swipe()
}
