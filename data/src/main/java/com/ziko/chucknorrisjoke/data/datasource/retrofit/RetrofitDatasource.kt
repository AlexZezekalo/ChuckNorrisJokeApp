package com.ziko.chucknorrisjoke.data.datasource.retrofit

import com.ziko.chucknorrisjoke.data.datasource.IRemoteDatasource
import com.ziko.chucknorrisjoke.data.mapper.CategoriesMapper
import com.ziko.chucknorrisjoke.data.utils.handleApi
import com.ziko.chucknorrisjoke.domain.entity.Categories
import com.ziko.chucknorrisjoke.domain.entity.IJoke
import com.ziko.chucknorrisjoke.domain.entity.IJokeList
import com.ziko.chucknorrisjoke.domain.entity.base.ResponseWrapper
import javax.inject.Inject


class RetrofitDatasource @Inject constructor(
    private val retrofitApiService: IRetrofitApiService,
    private val categoriesMapper: CategoriesMapper,
): IRemoteDatasource {

    override suspend fun loadJoke(): ResponseWrapper<IJoke> =
        handleApi { retrofitApiService.getRandomJoke() }

    override suspend fun searchJokesByKey(query: String): ResponseWrapper<IJokeList> =
        handleApi { retrofitApiService.getJokesBySearch(query) }

    override suspend fun getCategories(): ResponseWrapper<Categories> =
        handleApi(categoriesMapper) { retrofitApiService.getCategories() }

}