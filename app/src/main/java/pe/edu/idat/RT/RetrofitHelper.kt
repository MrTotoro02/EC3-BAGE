package pe.edu.idat.RT

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {


    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://www.themealdb.com/")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun getComidaService(): ComidaSevice = retrofit.create(ComidaSevice::class.java)

}

