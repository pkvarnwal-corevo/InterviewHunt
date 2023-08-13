import java.util.Random

fun funLet() {
    var name: String? = null
    name = "Prinsu"

    var scope = name?.let {
        println("let() called on $it")

        "let() return the last statement"
    }
    println(scope)
}

fun funWith() {
    val student = Student("")

    val scope = with(student) {
        println( student.name)
        println( student.age)
        "With scope"
        3
    }
    println(scope)

    val numbers = mutableListOf("One", "Two", "Three")
    with(numbers) {
        println("First item: ${first()}, last item: ${last()}")
    }
}

fun alsoApply() {
    val numberList = mutableListOf<Double>()
    numberList.also { println("Populating the list") }
        .apply {
            add(2.71)
            add(3.14)
            add(1.0)
        }
        .also { println("Sorting the list") }
        .sort()

    numberList.forEach { print("$it ") }
    println()
}

fun funRun() {
    val numbers = mutableListOf("One", "Two", "Three")
    val countEndsWithE = numbers.run {
        add("Four")
        add("five")
        count{it.endsWith("e")}
    }
    println("There are $countEndsWithE elements that end with e.")
}

fun getRandomIntUsingAlso(): Int {
    return kotlin.random.Random.nextInt(100).also {
        println("getRandomInt() generated value $it")
    }
}

fun main() {
//    funLet()
    funWith()
    alsoApply()
    funRun()

    getRandomIntUsingAlso()
}

class Student(s: String) {
    var name: String = "Amogh"
    var age : Float = 1.5F
    var city = "Fazilnagar"
}

