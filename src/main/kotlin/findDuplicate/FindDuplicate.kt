package findDuplicate

class FindDuplicate {
    fun checkDuplicate(arr: Array<Int>) {
        val map = HashMap<Int, Int>()

        for (i in arr) {
            if (map.containsKey(i)) {
                map[i] = map.get(i)!! + 1
            } else map[i] = 1
        }

        map.forEach {
            if (it.value >= 2) print("$it ")
        }
    }

    fun findDuplicate(arr: Array<Int>) {
        val map = HashMap<Int, Int>()
        for(i in arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i)!! + 1)
            } else map.put(i, 1)
        }
    }

    fun removeDuplicates(nums: Array<Int>): Int {
        val uniqueNums = nums.distinct()

        for (i in uniqueNums.indices) {
            nums[i] = uniqueNums[i]
        }
        return uniqueNums.size
    }
}

fun main() {
    val arr = arrayOf(3, 4, 5, 2, 4, 6, 4, 5, 2, 2)
    val f = FindDuplicate()
    f.checkDuplicate(arr)
//    println(f.removeDuplicates(arr))
}