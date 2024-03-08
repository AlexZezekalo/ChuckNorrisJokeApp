package com.ziko.chucknorrisjoke.domain.usecase

import com.ziko.chucknorrisjoke.domain.entity.IJokeList
import com.ziko.chucknorrisjoke.domain.repository.JokeRepository
import kotlinx.coroutines.flow.Flow

class GetJokesByKeyUseCase(private val jokeRepository: JokeRepository) {

    suspend operator fun invoke(key: String): Flow<Result<IJokeList>> =
        jokeRepository.searchJokesByKey(key)
}