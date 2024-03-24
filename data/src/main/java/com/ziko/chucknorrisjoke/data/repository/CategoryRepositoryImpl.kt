package com.ziko.chucknorrisjoke.data.repository

import com.ziko.chucknorrisjoke.domain.entity.Categories
import com.ziko.chucknorrisjoke.domain.repository.CategoryRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CategoryRepositoryImpl @Inject constructor(): CategoryRepository {

    override suspend fun getCategories(): Flow<Result<Categories>> {
        TODO("Not yet implemented")
    }
}