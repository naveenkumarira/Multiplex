package com.example.data.data_source.i_data_source

import com.example.core.entity.MemeEntity

interface IRemoteDataSource {
    fun getMemes(onSuccess: (movies : List<MemeEntity>) -> Unit,
                       onStatus: (status : String) -> Unit)

    suspend fun getMemesSus(): List<MemeEntity>
}