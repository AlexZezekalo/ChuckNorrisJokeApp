package com.ziko.chucknorrisjoke.data.datasource.retrofit

import com.ziko.chucknorrisjoke.data.entity.ApiCategories
import com.ziko.chucknorrisjoke.data.entity.ApiJoke
import com.ziko.chucknorrisjoke.data.entity.ApiJokeList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface IRetrofitApiService {

    @GET("/jokes/random")
    fun getRandomJoke(): Response<ApiJoke>

    @GET("/jokes/categories")
    fun getCategories(): Response<ApiCategories>

    @GET("/jokes/search")
    fun getJokesBySearch(@Query("query") query: String): Response<ApiJokeList>
}