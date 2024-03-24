package com.ziko.chucknorrisjoke.domain.usecase

import com.ziko.chucknorrisjoke.domain.entity.IJoke
import com.ziko.chucknorrisjoke.domain.repository.JokeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetJokeUseCase @Inject constructor(private val jokeRepository: JokeRepository) {

    suspend operator fun invoke(): Flow<Result<IJoke>> =
        jokeRepository.loadJoke()

}