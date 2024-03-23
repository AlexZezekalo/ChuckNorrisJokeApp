package com.ziko.chucknorrisjoke.domain.usecase

import com.ziko.chucknorrisjoke.domain.entity.IJoke
import com.ziko.chucknorrisjoke.domain.repository.JokeRepository
import com.ziko.common.extensions.logI
import kotlinx.coroutines.flow.Flow

class GetJokeUseCase(private val jokeRepository: JokeRepository) {

    suspend operator fun invoke(): Flow<Result<IJoke>> =
        jokeRepository.loadJoke().also {
            logI("executing GetJokeUseCase...")
        }

}