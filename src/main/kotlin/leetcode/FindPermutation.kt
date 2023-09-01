package leetcode

fun findPermutation(s: String, current: String = "") {
    if (s.isEmpty()) {
        print("$current, ")
        return
    }

    for (i in s.indices) {
        val remaining = s.removeRange(i, i + 1)
        findPermutation(remaining, current + s[i])
    }
}

fun main() {
    val s = "abcd"

    findPermutation(s)
}