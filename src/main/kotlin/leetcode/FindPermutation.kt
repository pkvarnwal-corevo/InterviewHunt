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

fun generatePermutation(s: String, current: String = "") {
    if (s.isEmpty()) {
        print("$current, ")
        return
    }

    for(i in s.indices) {
        val remaining = s.removeRange(i, i+1)
        generatePermutation(remaining, current + s[i])
    }
}

fun generatePermu(s: String, current : String = "") {
    if(s.isEmpty()) {
        println("$current, ")
        return
    }
    for(i in s.indices) {
        val remaining = s.removeRange(i, i + 1)
        generatePermu(remaining, current + s[i])
    }
}



fun main() {
    var s = "abcd"

//    findPermutation(s)
    generatePermutation("abc")
}