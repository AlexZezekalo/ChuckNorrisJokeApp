package com.ziko.chucknorrisjoke.app.di.module

import com.ziko.chucknorrisjoke.data.repository.CategoryRepositoryImpl
import com.ziko.chucknorrisjoke.data.repository.JokeRepositoryImpl
import com.ziko.chucknorrisjoke.domain.repository.CategoryRepository
import com.ziko.chucknorrisjoke.domain.repository.JokeRepository
import dagger.Binds
import dagger.Module


@Module
interface RepositoryModule {

    @Binds
    fun bindCategoryRepository(categoryRepository: CategoryRepositoryImpl): CategoryRepository

    @Binds
    fun bindJokeRepository(jokeRepository: JokeRepositoryImpl): JokeRepository
}