package leetcode

import kotlin.math.roundToInt

fun main() {
//    print(readlnOrNull()?.let { m1(it.trim()) })
    print(readlnOrNull()?.let { printStar(it.trim()) })
}

fun printStar(str: String) : String {
    val rating = str.toFloatOrNull()
    var temp = ""

    if(rating != null && rating >= 0.0f && rating <= 5.0f) {
        println("Rating: $rating")
        temp = validateStar(rating)
    } else println("Invalid rating. Please enter a number between 0.0 and 5.0.")

    return temp
}

fun validateStar(rating: Float) : String {
    var str = ""
    val roundedRating = rating.roundToInt()
    var count = 1
    for(i in 1 until roundedRating) {
//        print(" Full ")
        str += " Full "
    }

    if(rating % 1 != 0.0f) {
//        print(" half ")
        str += " half "
        count++
    }

    var remaining = 4
    if(roundedRating != 0 && count != 1) {
        remaining = 5 - roundedRating
    } else if(roundedRating == 0 && count == 1) {
        remaining = 5
    }

    for(j in 0 until remaining) {
//        print(" empty ")
        str += " empty "
    }
    println()

    return str
}

fun m1(str: String) : String {
var result = ""
    for(i in str.length - 1 downTo 0) {
         result += str[i]
    }
    return result
}