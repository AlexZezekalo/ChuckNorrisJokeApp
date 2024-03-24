package com.ziko.chucknorrisjoke.data.repository

import com.ziko.chucknorrisjoke.domain.entity.IJoke
import com.ziko.chucknorrisjoke.domain.entity.IJokeList
import com.ziko.chucknorrisjoke.domain.repository.JokeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class JokeRepositoryImpl @Inject constructor() : JokeRepository {

    override suspend fun loadJoke(): Flow<Result<IJoke>> {
        TODO("Not yet implemented")
    }

    override suspend fun searchJokesByKey(key: String): Flow<Result<IJokeList>> {
        TODO("Not yet implemented")
    }
}