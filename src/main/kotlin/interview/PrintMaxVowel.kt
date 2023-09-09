package interview

fun countVowels(input: String): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    var count = 0
    for (char in input.lowercase()) {
        if (char in vowels) {
            count++
        }
    }
    return count
}


fun main() {
    var highestVowels = 0
    var countryName = ""
    val strCountries = "pApA New GuineA, UnitED Arab EmIrAtEs, ChinA, InDIA, Dominican RepUbLIC"
    val arr = strCountries.split(",")
    arr.forEach {
        val vowelCount = countVowels(it)
        println("The number of vowels in '$it' is $vowelCount")
        if (highestVowels < vowelCount) {
            highestVowels = vowelCount
            countryName = it
        }
    }
    println("$countryName has the maximum vowels of $highestVowels in its name.")
}
