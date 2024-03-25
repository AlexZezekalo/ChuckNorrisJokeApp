package com.ziko.chucknorrisjoke.data.mapper

import com.ziko.chucknorrisjoke.data.entity.ApiCategories
import com.ziko.chucknorrisjoke.domain.entity.Categories
import com.ziko.chucknorrisjoke.domain.mapper.ISimpleMapper
import javax.inject.Inject

class CategoriesMapper @Inject constructor(): ISimpleMapper<ApiCategories, Categories> {

    override fun map(source: ApiCategories): Categories =
        Categories(
            items = source.items.map { it }
        )
    }