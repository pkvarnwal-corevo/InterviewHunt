package leetcode

import java.util.*

    fun checkParentheses(s: String) : Boolean {
        val stack = Stack<String>()
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

fun main() {
    val s1 = "(){}[]"
    val result = checkParentheses(s1)
    println(result)
}