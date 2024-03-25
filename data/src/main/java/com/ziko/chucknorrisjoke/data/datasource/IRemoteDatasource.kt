package com.ziko.chucknorrisjoke.data.datasource

import com.ziko.chucknorrisjoke.domain.entity.Categories
import com.ziko.chucknorrisjoke.domain.entity.IJoke
import com.ziko.chucknorrisjoke.domain.entity.IJokeList
import kotlinx.coroutines.flow.Flow

interface IRemoteDatasource {
    suspend fun loadJoke(): Flow<Result<IJoke>>
    suspend fun searchJokesByKey(key: String): Flow<Result<IJokeList>>
    suspend fun getCategories(): Flow<Result<Categories>>
}