package com.example.data.data_source.source

import com.example.data.data_source.i_data_source.IRemoteDataSource
import com.example.data.data_source.network.service.MemeService
import com.example.core.entity.MemeEntity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MemeRemoteData(private val service: MemeService): IRemoteDataSource {

    override suspend fun getMemesSus(): List<MemeEntity> {
        return service.getMemesSus()
    }

    override fun getMemes(
        onSuccess: (movies: List<MemeEntity>) -> Unit,
        onStatus: (status: String) -> Unit
    ) {
        service.getMemes().enqueue(object: Callback<List<MemeEntity>> {
            override fun onFailure(call: Call<List<MemeEntity>>, t: Throwable) {
                onStatus("Network error")
            }

            override fun onResponse(
                call: Call<List<MemeEntity>>,
                response: Response<List<MemeEntity>>) {
                    if(response.isSuccessful && response.body() != null) {
                        val list  = response.body() as List<MemeEntity>
                        onSuccess(list)
                    }
            }

        })
    }

}