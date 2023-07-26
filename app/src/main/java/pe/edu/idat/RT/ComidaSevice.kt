package pe.edu.idat.RT

import pe.edu.idat.response.ComidaResponse
import retrofit2.http.GET

interface ComidaSevice {
    @GET("api/json/v1/1/search.php?f=b")
    suspend fun getComidas() : ComidaResponse

}