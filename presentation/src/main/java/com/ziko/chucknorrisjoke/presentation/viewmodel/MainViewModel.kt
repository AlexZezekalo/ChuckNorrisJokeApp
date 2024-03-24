package com.ziko.chucknorrisjoke.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.ziko.chucknorrisjoke.domain.usecase.GetCategoriesUseCase
import com.ziko.chucknorrisjoke.domain.usecase.GetJokesByKeyUseCase
import com.ziko.common.extensions.logI
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getCategoriesUseCase: GetCategoriesUseCase,
    private val getJokesByKeyUseCase: GetJokesByKeyUseCase,
) : ViewModel() {

    init {
        logI("Start View Model")
    }
}