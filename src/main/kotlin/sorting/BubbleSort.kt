package sorting

class BubbleSort {

    fun sort(arr: Array<Int>) {
        var swap = true

        while (swap) {
            swap = false

            for(i in 0..<arr.size - 1) {
                if (arr[i] > arr[i+1]) {
                    val temp = arr[i]
                    arr[i] = arr[i+1]
                    arr[i+1] = temp

                    swap = true
                }
            }
        }
        arr.forEach { print("$it ") }
    }
}

fun main() {
    val arr = arrayOf(7, 3, 4, 1, 5, 2)
    val bs = BubbleSort()
    bs.sort(arr)
}