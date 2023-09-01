package sealed

import sealed.HttpError.Unauthorized

sealed class HttpError(val code : Int) {

    data class Unauthorized(val reason: String) : HttpError(401)
    data object NotFound : HttpError(404)
}


enum class HttpErrorEnum(val code: Int) {
    Unauthorized(401),
    NotFound(404)
}


fun main() {

    val error : HttpError = HttpError.NotFound

    when(error) {
        HttpError.NotFound -> Unit
        is Unauthorized -> Unit
        is Unauthorized -> Unit
    }

    val errorEnum : HttpErrorEnum = HttpErrorEnum.NotFound
    HttpErrorEnum.values().forEach { print(it .name) }

    when(errorEnum) {
        HttpErrorEnum.NotFound -> Unit
        HttpErrorEnum.Unauthorized -> Unit
    }

}