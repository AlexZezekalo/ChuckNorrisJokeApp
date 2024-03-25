package com.ziko.chucknorrisjoke.data.datasource.retrofit

import com.ziko.chucknorrisjoke.data.datasource.retrofit.entity.ApiCategories
import com.ziko.chucknorrisjoke.data.datasource.retrofit.entity.ApiJoke
import com.ziko.chucknorrisjoke.data.datasource.retrofit.entity.ApiJokeList
import retrofit2.Response
import retrofit2.http.GET

interface IRetrofitApiService {

    @GET("/jokes/random")
    fun getRandomJoke(): Response<ApiJoke>

    @GET("/jokes/categories")
    fun getCategories(): Response<ApiCategories>

    @GET("/jokes/search")
    fun getJokesBySearch(): Response<ApiJokeList>
}