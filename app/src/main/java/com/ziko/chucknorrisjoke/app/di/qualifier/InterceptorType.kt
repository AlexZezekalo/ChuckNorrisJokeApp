package com.ziko.chucknorrisjoke.app.di.qualifier

import javax.inject.Qualifier

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class InterceptorNamed(val value: InterceptorType)


enum class InterceptorType {
    LOGGING,
    HEADERS
}