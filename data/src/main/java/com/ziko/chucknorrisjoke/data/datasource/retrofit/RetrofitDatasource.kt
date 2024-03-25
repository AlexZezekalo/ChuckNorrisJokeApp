package com.ziko.chucknorrisjoke.data.datasource.retrofit

import com.ziko.chucknorrisjoke.data.datasource.IRemoteDatasource
import com.ziko.chucknorrisjoke.domain.entity.Categories
import com.ziko.chucknorrisjoke.domain.entity.IJoke
import com.ziko.chucknorrisjoke.domain.entity.IJokeList
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class RetrofitDatasource @Inject constructor(
    val retrofitApiService: IRetrofitApiService
): IRemoteDatasource {

    override suspend fun loadJoke(): Flow<Result<IJoke>> {
        TODO("Not yet implemented")
    }

    override suspend fun searchJokesByKey(key: String): Flow<Result<IJokeList>> {
        TODO("Not yet implemented")
    }

    override suspend fun getCategories(): Flow<Result<Categories>> {
        TODO("Not yet implemented")
    }
}