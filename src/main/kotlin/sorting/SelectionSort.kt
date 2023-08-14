package sorting

class SelectionSort {
    fun selectionSort(list: ArrayList<Int>) {
        var min: Int

        for (i in 0 until list.size) {
            min = i
            for (j in i+1 until list.size) {
                if (list[j] < list[min]) {
                    min = j
                }
            }
            val temp = list[min]
            list[min] = list[i]
            list[i] = temp
        }

        list.forEach { print("$it ") }
    }
}

fun main() {
    val list = ArrayList(readln().split(" ").map { it.toInt() })
    val ss = SelectionSort()
    ss.selectionSort(list)
}