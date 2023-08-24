package sorting
/*QuickSort is a popular sorting algorithm that efficiently sorts an array or a list by partitioning it into smaller
sub-arrays and then recursively sorting those sub-arrays.
It's known for its average-case time complexity of O(n log n),
making it faster than some other sorting algorithms like Bubble Sort or Insertion Sort.*/
fun quickSort(arr: IntArray, low: Int, high: Int) {
    if (low < high) {
        val pivotIndex = partition(arr, low, high)
        quickSort(arr, low, pivotIndex - 1)
        quickSort(arr, pivotIndex + 1, high)
    }
}
fun partition(arr: IntArray, low: Int, high: Int): Int {
    val pivot = arr[high]
    var i = low - 1
    for (j in low until high) {
        if (arr[j] < pivot) {
            i++
            swap(arr, i, j)
        }
    }
    swap(arr, i + 1, high)
    return i + 1
}
fun swap(arr: IntArray, i: Int, j: Int) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}
fun main() {
    val arr = intArrayOf(64, 34, 25, 12, 22, 11, 90)
    println("Unsorted array: ${arr.joinToString()}")
    quickSort(arr, 0, arr.size - 1)
    println("Sorted array: ${arr.joinToString()}")
}