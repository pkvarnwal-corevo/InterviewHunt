import sealed.*

fun main() {

    val obj = Demo.B()
    obj.display()
    val obj1=Demo.A()
    obj1.display()
}

fun log(e: Error) = when(e) {
    is FileReadError -> { println("Error while reading file ${e.file}") }
    is DatabaseError -> { println("Error while reading from database ${e.source}") }
    is RuntimeError ->  { println("Runtime error") }
}

