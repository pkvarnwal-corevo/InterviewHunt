package sealed

import java.io.File
import javax.sql.DataSource

sealed interface Error

sealed class IOError() : Error

class FileReadError(val file: File) : IOError()
class DatabaseError(val source: DataSource) : IOError()

object RuntimeError : Error


sealed class Demo {
    class A : Demo() {
        fun display() {
            println("Subclass A of Sealed class Demo ")
        }
    }

    class B : Demo() {
        fun display() {
            println("Subclass B of sealed class Demo")
        }
    }
}