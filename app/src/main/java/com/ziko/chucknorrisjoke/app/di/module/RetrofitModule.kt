package com.ziko.chucknorrisjoke.app.di.module

import com.google.gson.Gson
import com.ziko.chucknorrisjoke.app.BuildConfig
import com.ziko.chucknorrisjoke.app.di.qualifier.InterceptorNamed
import com.ziko.chucknorrisjoke.app.di.qualifier.InterceptorType
import com.ziko.chucknorrisjoke.data.datasource.retrofit.IRetrofitApiService
import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class RetrofitModule {

    @Singleton
    @Provides
    fun provideGson(): Gson = Gson()

    @Singleton
    @InterceptorNamed(InterceptorType.LOGGING)
    @Provides
    fun provideLoggingInterceptor(): Interceptor = HttpLoggingInterceptor()
        .apply {
            setLevel(HttpLoggingInterceptor.Level.BODY)
        }

    @InterceptorNamed(InterceptorType.HEADERS)
    @Provides
    fun provideHeaderInterceptor(): Interceptor = Interceptor { chain ->
        val request = chain.request()
        request.newBuilder()
            .addHeader(name = "accept", value = "application/json")
            .addHeader(name = "X-RapidAPI-Key", value = "96c7a379c0msh89087fcd2b9821dp152c31jsn22db8c5ef61c")
            .addHeader(name = "X-RapidAPI-Host", value = "matchilling-chuck-norris-jokes-v1.p.rapidapi.com")
            .build()
        chain.proceed(request)
    }

    @Singleton
    @Provides
    fun provideOkHttpClient(
        @InterceptorNamed(InterceptorType.LOGGING) loggingInterceptor: Interceptor,
        @InterceptorNamed(InterceptorType.HEADERS) headersInterceptor: Interceptor,
    ): OkHttpClient =
        OkHttpClient
            .Builder()
            .addInterceptor(loggingInterceptor)
            .addInterceptor(headersInterceptor)
            .build()

    @Singleton
    @Provides
    fun provideRetrofit(client: OkHttpClient, gson: Gson): Retrofit =
        Retrofit
            .Builder()
            .client(client)
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

    @Singleton
    @Provides
    fun provideRetrofitApiService(retrofit: Retrofit): IRetrofitApiService =
        retrofit.create(IRetrofitApiService::class.java)
}