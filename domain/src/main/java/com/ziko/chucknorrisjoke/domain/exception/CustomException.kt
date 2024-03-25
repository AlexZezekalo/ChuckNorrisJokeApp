package com.ziko.chucknorrisjoke.domain.exception

open class CustomException(
    override val message: String = "Custom Exception",
    override val cause: Throwable? = null,
) : RuntimeException()