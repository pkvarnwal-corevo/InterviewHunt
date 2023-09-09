package sorting

class InsertionSort {

    fun insertionSort(arr: IntArray) {
        for (i in arr.indices) {
            var min = i
            for(j in i+1 until arr.size) {
                if(arr[j] < arr[i]) {
                    min = j
                }
            }
            swap(arr, min, i)
        }

     arr.forEach { print("$it ") }
    }

    private fun swap(arr: IntArray, min: Int, i : Int) {
        val temp = arr[min]
        arr[min] = arr[i]
        arr[i] = temp
    }
}

fun main() {
    val arr = intArrayOf(10, 3, 7, 2, 1)
    val sort = InsertionSort()
    sort.insertionSort(arr)
}