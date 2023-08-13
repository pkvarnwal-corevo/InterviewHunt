class Palindrome {
    fun checkPalindrome() {
        var p = 12321
        var remainder : Int
        var reverseP = 0
        val originalP = p

        while(p!=0) {
            remainder = p % 10
            reverseP = reverseP * 10 + remainder
            p /= 10
        }
        if (originalP.equals(reverseP)) println("$originalP is Palindrome number")
        else println("$originalP is not Palindrome number")
    }
}

fun main() {
val p = Palindrome()
    p.checkPalindrome()
}