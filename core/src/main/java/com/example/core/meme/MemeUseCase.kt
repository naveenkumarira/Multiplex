package com.example.core.meme

import com.example.core.entity.MemeEntity

class MemeUseCase(private val iMemeRepository: IMemeRepository) {
    fun getMemes(): List<MemeEntity>? {
        return iMemeRepository.getMemes()
    }

    suspend fun getMemesSus(): List<MemeEntity> {
        return iMemeRepository.getMemesSus()
    }

}