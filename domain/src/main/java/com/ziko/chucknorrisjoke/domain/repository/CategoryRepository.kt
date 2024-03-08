package com.ziko.chucknorrisjoke.domain.repository

import com.ziko.chucknorrisjoke.domain.entity.Categories
import kotlinx.coroutines.flow.Flow

interface CategoryRepository {
    suspend fun getCategories(): Flow<Result<Categories>>
}