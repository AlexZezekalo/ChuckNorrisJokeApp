package com.ziko.chucknorrisjoke.domain.mapper

interface ISimpleMapper<T, R> {

    fun map(source: T): R
}