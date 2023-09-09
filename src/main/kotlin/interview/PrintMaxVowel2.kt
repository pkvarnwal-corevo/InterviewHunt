package interview

class PrintMaxVowel2 {
    fun maxVowel(str: String): Int {
        val map = HashMap<Char, Int>()

        for (i in str.toCharArray()) {
            if (i.equals('a', ignoreCase = true) || i.equals('e', ignoreCase = true) ||
                i.equals('i', ignoreCase = true) || i.equals('o', ignoreCase = true) ||
                i.equals('u', ignoreCase = true)
            ) {
                if (map.containsKey(i)) map.put(i, map.get(i)!! + 1)
                else map.put(i, 1)
            }
        }

        return map.values.sum()
    }
}

fun main() {
    val strCountries = "pApA New GuineA, UnitED Arab EmIrAtEs, ChinA, InDIA, Dominican RepUbLIC"
    val pm = PrintMaxVowel2()

    val arr = strCountries.split(",")
    var highestNum = 0
    var count = 0
    var temp = ""
    arr.forEach {
        count = pm.maxVowel(it)

        if (highestNum < count) {
            highestNum = count
            temp = it
        }
    }
    println()
    print("$temp has the highest num of vowel is: $highestNum")
}