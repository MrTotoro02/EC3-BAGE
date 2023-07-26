package pe.edu.idat.repository

import pe.edu.idat.RT.RetrofitHelper
import pe.edu.idat.response.Apiresponse
import pe.edu.idat.response.ComidaResponse


class ComidaRespository {
    suspend fun getComidas(): Apiresponse<ComidaResponse>{
        return try {
            val response = RetrofitHelper.getComidaService().getComidas()
            Apiresponse.Success(response)
        }catch (e: java.lang.Exception){
            Apiresponse.Error(e)
        }

    }
}