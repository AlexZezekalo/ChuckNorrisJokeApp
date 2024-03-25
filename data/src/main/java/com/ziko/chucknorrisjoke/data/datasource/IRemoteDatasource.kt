package com.ziko.chucknorrisjoke.data.datasource

import com.ziko.chucknorrisjoke.domain.entity.Categories
import com.ziko.chucknorrisjoke.domain.entity.IJoke
import com.ziko.chucknorrisjoke.domain.entity.IJokeList
import com.ziko.chucknorrisjoke.domain.entity.base.ResponseWrapper

interface IRemoteDatasource {
    suspend fun loadJoke(): ResponseWrapper<IJoke>
    suspend fun searchJokesByKey(query: String): ResponseWrapper<IJokeList>
    suspend fun getCategories(): ResponseWrapper<Categories>
}