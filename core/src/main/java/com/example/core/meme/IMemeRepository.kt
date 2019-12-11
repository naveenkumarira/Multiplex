package com.example.core.meme

import androidx.lifecycle.LiveData
import com.example.core.entity.MemeEntity

interface IMemeRepository {
    fun getMemes(): LiveData<List<MemeEntity?>>
    suspend fun getMemesSus(): List<MemeEntity>
}