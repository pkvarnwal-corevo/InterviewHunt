package sealed

sealed class Shape {

    class Circle(var radius: Float) : Shape()
    class Square(var length: Int) : Shape()
    class Rectangle(var length: Int, var width: Int) : Shape()

//    object NotAShape : Shape()
}

fun main() {

    val circle = Shape.Circle(5.0f)
    val square = Shape.Square(5)
    val rectangle = Shape.Rectangle(4, 5)

    eval(circle)
    eval(square)
    eval(rectangle)
}

fun eval(e: Shape) =
    when (e) {
        is Shape.Circle -> println("Circle area is: ${3.14 * e.radius * e.radius}")
        is Shape.Square -> println("Square is: ${e.length * e.length}")
        is Shape.Rectangle -> println("Rectangle is: ${e.length * e.width}")
    }