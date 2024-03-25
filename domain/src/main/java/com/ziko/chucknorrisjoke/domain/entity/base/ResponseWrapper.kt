package com.ziko.chucknorrisjoke.domain.entity.base

import com.ziko.chucknorrisjoke.domain.exception.CustomException

sealed class ResponseWrapper<T: Any> {

    data class Success<T: Any>(val data: T) : ResponseWrapper<T>()

    data class Error<T: Any>(val code: Int, val message: String?) : ResponseWrapper<T>()

    data class Exception<T: Any, R: CustomException>(val throwable: R) : ResponseWrapper<T>()
}