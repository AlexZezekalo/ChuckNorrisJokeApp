package com.ziko.chucknorrisjoke.data.utils

import com.ziko.chucknorrisjoke.domain.entity.base.Item
import com.ziko.chucknorrisjoke.domain.entity.base.ResponseWrapper
import com.ziko.chucknorrisjoke.domain.exception.CustomException
import com.ziko.chucknorrisjoke.domain.mapper.ISimpleMapper
import retrofit2.HttpException
import retrofit2.Response

/*
*  Function to convert Response(retrofit) entity to base Domain ResponseWrapper
*  Domain model is an interface, Data model is a data class inherited from domain.
*/
suspend fun <T : R, R: Item> handleApi(
    execute: suspend  () -> Response<T>
): ResponseWrapper<R> {
    return try {
        val response = execute()
        val body = response.body()

    if (response.isSuccessful && body != null) {
            ResponseWrapper.Success(body)
        } else {
            ResponseWrapper.Error(response.code(), response.message())
        }
    } catch (exception: HttpException) {
        ResponseWrapper.Error(exception.code(), exception.message())
    } catch (throwable: Throwable) {
        ResponseWrapper.Exception(CustomException(cause = throwable))
    }
}

/*
*  Function to convert Response(retrofit) entity to base Domain ResponseWrapper
*  Domain model and Data model are both data classes.
*/
suspend fun <T : Any, R: Any> handleApi(
    mapper: ISimpleMapper<T, R>,
    execute: suspend  () -> Response<T>
): ResponseWrapper<R> {
    return try {
        val response = execute()
        val body = response.body()?.let { mapper.map(it) }

        if (response.isSuccessful && body != null) {
            ResponseWrapper.Success(body)
        } else {
            ResponseWrapper.Error(response.code(), response.message())
        }
    } catch (exception: HttpException) {
        ResponseWrapper.Error(exception.code(), exception.message())
    } catch (throwable: Throwable) {
        ResponseWrapper.Exception(CustomException(cause = throwable))
    }
}