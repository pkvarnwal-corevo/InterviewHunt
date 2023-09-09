// Java program for implementation of Heap Sort
class HeapSort {
    fun sort(arr: IntArray) {
        val N = arr.size

        for (i in N / 2 - 1 downTo 0) heapify(arr, N, i)

        for (i in N - 1 downTo 1) {
            // Move current root to end
            val temp = arr[0]
            arr[0] = arr[i]
            arr[i] = temp

            heapify(arr, i, 0)
        }
    }

    fun heapify(arr: IntArray, N: Int, i: Int) {
        var largest = i // Initialize largest as root
        val l = 2 * i + 1 // left = 2*i + 1
        val r = 2 * i + 2 // right = 2*i + 2

        // If left child is larger than root
        if (l < N && arr[l] > arr[largest]) largest = l

        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest]) largest = r

        // If largest is not root
        if (largest != i) {
            val swap = arr[i]
            arr[i] = arr[largest]
            arr[largest] = swap

            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest)
        }
    }

    companion object {
        /* A utility function to print array of size n */
        fun printArray(arr: IntArray) {
            val N = arr.size
            for (i in 0 until N) print(arr[i].toString() + " ")
            println()
        }

        // Driver's code
        @JvmStatic
        fun main(args: Array<String>) {
            val arr = intArrayOf(12, 11, 13, 5, 6, 7)
            val ob = HeapSort()
            ob.sort(arr)
            println("Sorted array is")
            printArray(arr)
        }
    }
}
