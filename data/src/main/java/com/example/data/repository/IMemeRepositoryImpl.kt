package com.example.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.data.data_source.source.MemeRemoteData
import com.example.core.entity.MemeEntity
import com.example.core.meme.IMemeRepository

class IMemeRepositoryImpl(private val remoteDataSource: MemeRemoteData): IMemeRepository {
    override suspend fun getMemesSus(): List<MemeEntity> {
        return remoteDataSource.getMemesSus()
    }

    override fun getMemes(): LiveData<List<MemeEntity?>> {
        val liveData = MutableLiveData<List<MemeEntity?>>()
        remoteDataSource.getMemes(
            {
                liveData.value = it
            },
            {
                //TODO: Should Handle error
            }
        )
        return liveData
    }

}