package annotations

import java.util.Date

data class Session  (val name: String, val date: Date = Date())




fun main() {

    val session = Session("Prinsu", Date())
    println(session.name)
}