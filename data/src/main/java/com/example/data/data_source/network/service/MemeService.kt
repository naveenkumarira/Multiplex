package com.example.data.data_source.network.service

import com.example.core.entity.MemeEntity
import retrofit2.Call
import retrofit2.http.GET


interface MemeService {

    @GET("get_memes")
    fun getMemes(): Call<List<MemeEntity>>

    @GET("get_memes")
    suspend fun getMemesSus(): List<MemeEntity>
}