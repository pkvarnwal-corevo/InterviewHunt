package equals

class Car(var color: String) {
}


data class Vehicle(var color: String)

fun main() {

    val car1 = Car("RED")
    val car2 = Car("RED")

    val car3 = car1

    println(car1 == car2)
    //output will be false even color is same because we have not implemented the equals method.

    println(car1 === car3)


    val vehicle1 = Vehicle("RED")
    val vehicle2 = Vehicle("RED")
    val vehicle3 = vehicle1

    println(vehicle1 == vehicle2)
    println(vehicle1 === vehicle2)
    println(vehicle1 === vehicle3)



}