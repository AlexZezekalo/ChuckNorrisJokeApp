package com.ziko.chucknorrisjoke.domain.usecase

import com.ziko.chucknorrisjoke.domain.entity.Categories
import com.ziko.chucknorrisjoke.domain.repository.CategoryRepository
import kotlinx.coroutines.flow.Flow

class GetCategoriesUseCase(private val categoryRepository: CategoryRepository) {

    suspend operator fun invoke(): Flow<Result<Categories>> =
        categoryRepository.getCategories()
}