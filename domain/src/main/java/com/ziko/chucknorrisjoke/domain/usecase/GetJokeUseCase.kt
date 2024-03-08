package com.ziko.chucknorrisjoke.domain.usecase

import com.ziko.chucknorrisjoke.domain.entity.IJoke
import com.ziko.chucknorrisjoke.domain.repository.JokeRepository
import kotlinx.coroutines.flow.Flow

class GetJokeUseCase(private val jokeRepository: JokeRepository) {

    suspend operator fun invoke(): Flow<IJoke> =
        jokeRepository.loadJoke()

}