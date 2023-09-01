package sorting


fun qs2(arr: IntArray, low: Int, high: Int) {
    if (low < high) {
        val pivotIndex = partition2(arr, low, high)
        qs2(arr, low, pivotIndex - 1)
        qs2(arr, pivotIndex + 1, high)
    }
}

fun partition2(arr: IntArray, low: Int, high: Int): Int {
    val pivot = arr[high]
    var i = low - 1
    for (j in low until high) {
        if (arr[j] < pivot) {
            i++
            swap2(arr, i, j)
        }
    }
    swap2(arr, i + 1, high)
    return i + 1
}

fun swap2(arr: IntArray, i: Int, j: Int) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}
fun main() {
    val arr = intArrayOf(64, 34, 25, 12, 22, 11, 90)
    println("Unsorted array: ${arr.joinToString()}")
    qs2(arr, 0, arr.size - 1)
    println("Sorted array: ${arr.joinToString()}")

}