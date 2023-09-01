import kotlin.math.roundToInt

fun main() {
    print("Enter a rating (0-5): ")
    val rating = readLine()?.toFloatOrNull()

    if (rating != null && rating >= 0.0f && rating <= 5.0f) {
        println("Rating: $rating")
        printStars(rating)
    } else {
        println("Invalid rating. Please enter a number between 0.0 and 5.0.")
    }
}

fun printStars(rating: Float) {
    val roundedRating = rating.roundToInt() // Round the rating to the nearest integer
    var count = 1
    for (i in 1 until roundedRating) {
        print(" full ") // You can use any symbol you like here, e.g., "*"
    }

    // If there is a fractional part, print a half star if applicable
    if (rating % 1 != 0.0f) {
        print(" half ")
        count++
    }
    var remaining = 4
    if (roundedRating != 0 && count != 1) {
        remaining = 5 - roundedRating
    } else if (roundedRating == 0 && count == 1) {
        remaining = 5
    }
    for (j in 0 until remaining) {
        print(" empty ")
    }

    println()
}
