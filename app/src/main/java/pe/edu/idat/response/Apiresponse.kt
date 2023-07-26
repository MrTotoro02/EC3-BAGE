package pe.edu.idat.response

open class Apiresponse<T>(data: T? = null, exception: java.lang.Exception? = null) {
    data class  Success<T>(val data: T): Apiresponse<T>(data)
    data class Error<T>(val exception: Exception): Apiresponse<T>(null,exception)
}