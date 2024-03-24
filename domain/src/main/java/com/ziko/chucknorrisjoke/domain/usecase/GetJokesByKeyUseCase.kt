package com.ziko.chucknorrisjoke.domain.usecase

import com.ziko.chucknorrisjoke.domain.entity.IJokeList
import com.ziko.chucknorrisjoke.domain.repository.JokeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetJokesByKeyUseCase @Inject constructor(private val jokeRepository: JokeRepository) {

    suspend operator fun invoke(key: String): Flow<Result<IJokeList>> =
        jokeRepository.searchJokesByKey(key)
}