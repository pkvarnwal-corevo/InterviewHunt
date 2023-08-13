package leetcode

class TwoSum {

    fun twoSum(number: Array<Int>, target: Int) {

        for (i in 0..<number.size - 1) {
            if (number[i] + number[i + 1] == target)
                println("The index $i and ${i + 1} is equal target: $target")
            else println("Did not find the number")
        }
    }
}

fun main() {
    val number = arrayOf(1, 8, 3, 6, 5, 4, 3, 7, 2, 5, 5)
    val target = 9
    val ts = TwoSum()
    ts.twoSum(number, target)
}