package com.ziko.chucknorrisjoke.domain.repository

import com.ziko.chucknorrisjoke.domain.entity.IJoke
import com.ziko.chucknorrisjoke.domain.entity.IJokeList
import kotlinx.coroutines.flow.Flow

interface JokeRepository {
    suspend fun loadJoke(): Flow<Result<IJoke>>
    suspend fun searchJokesByKey(key: String): Flow<Result<IJokeList>>
}