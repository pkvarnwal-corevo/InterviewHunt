package leetcode

import java.nio.CharBuffer
import java.nio.charset.Charset
import java.util.Stack
import javax.swing.text.AttributeSet.CharacterAttribute

class ValidParentheses {

    fun checkParentheses(s: String) : Boolean {

        var stack = Stack<String>()
        s.forEach {
            when(it.toString()) {
                "(" -> stack.push(")")
                "{" -> stack.push("}")
                "[" -> stack.push("]")
                else -> {
                    if (stack.isEmpty() || stack.pop() != it.toString()) {
                        return false
                    }
                }
            }
        }
        return stack.isEmpty()
    }
}

fun main() {

    val s1 = "(){}[]"
    val s2 = "()"
    var s3 = "(]"

    val vp = ValidParentheses()
    val result = vp.checkParentheses(s3)
    println(result)
}