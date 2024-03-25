package com.ziko.chucknorrisjoke.app.di.module

import com.ziko.chucknorrisjoke.data.datasource.IRemoteDatasource
import com.ziko.chucknorrisjoke.data.datasource.retrofit.RetrofitDatasource
import com.ziko.chucknorrisjoke.data.repository.CategoryRepositoryImpl
import com.ziko.chucknorrisjoke.data.repository.JokeRepositoryImpl
import com.ziko.chucknorrisjoke.domain.repository.CategoryRepository
import com.ziko.chucknorrisjoke.domain.repository.JokeRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton


@Module
interface DataModule {

    @Singleton
    @Binds
    fun bindCategoryRepository(categoryRepository: CategoryRepositoryImpl): CategoryRepository

    @Singleton
    @Binds
    fun bindJokeRepository(jokeRepository: JokeRepositoryImpl): JokeRepository

    @Singleton
    @Binds
    fun bindRetrofitDatasource(retrofitDatasource: RetrofitDatasource): IRemoteDatasource
}