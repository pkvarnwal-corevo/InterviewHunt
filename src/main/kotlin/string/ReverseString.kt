package string

class ReverseString {

    fun reverse() {
        var str = "overoC gnimoceb erianoilliB "

        var arr = str.split(" ")

        arr.forEach {
            for(i in it.length - 1 downTo 0) {
                print(it[i])

            }
            print(" ")
        }
    }
}

fun main() {
    val rs = ReverseString()
    rs.reverse()
}