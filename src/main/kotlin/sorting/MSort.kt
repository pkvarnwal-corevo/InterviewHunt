package sorting

class MSort {

    fun ms(arr: IntArray): IntArray {
        if (arr.size <= 1) return arr

        val mid = arr.size / 2
        val leftArr = arr.copyOfRange(0, mid)
        val rightArr = arr.copyOfRange(mid, arr.size)

        return merge(ms(leftArr), ms(rightArr))
    }

     fun merge(leftArr: IntArray, rightArr: IntArray): IntArray {
        var idx1 = 0
        var idx2 = 0
        var result = 0
        val resultArr = IntArray(leftArr.size + rightArr.size)

        while (idx1 < leftArr.size && idx2 < rightArr.size) {
            if (leftArr[idx1] < rightArr[idx2]) resultArr[result++] = leftArr[idx1++]
            else resultArr[result++] = rightArr[idx2++]
        }

        while (idx1 < leftArr.size) {
            resultArr[result++] = leftArr[idx1++]
        }

        while (idx2 < rightArr.size) {
            resultArr[result++] = rightArr[idx2++]
        }

        return resultArr
    }
}


fun main() {
    val arr1 = intArrayOf(9, 5, 6)
    val arr2 = intArrayOf(2, 3, 1)
    val mSort = MSort()
    val sortArr1 = mSort.ms(arr1)
    val sortArr2 = mSort.ms(arr2)
    sortArr1.forEach { print("$it ") }
    println()
    sortArr2.forEach { print("$it ") }
    println()
    val mergeSortedArr = mSort.merge(sortArr1, sortArr2)
    mergeSortedArr.forEach { print("$it ") }
}
