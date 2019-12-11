package com.example.data.data_source.network

import com.example.data.data_source.network.service.MemeService
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitManager {


    private const val BASE_URL = "https://api.imgflip.com"
    var INSTANCE: Retrofit? = null

    private fun getRetrofit(): Retrofit {

        if(INSTANCE != null) return INSTANCE!!

        synchronized(this) {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(Gson()))
                .build()
            INSTANCE = retrofit
        }

        return INSTANCE!!

    }



    fun getMemeService(): MemeService {
        return getRetrofit().create(MemeService::class.java)
    }
}