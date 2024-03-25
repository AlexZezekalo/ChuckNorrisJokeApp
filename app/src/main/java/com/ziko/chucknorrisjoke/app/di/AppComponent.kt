package com.ziko.chucknorrisjoke.app.di

import android.content.Context
import com.ziko.chucknorrisjoke.app.di.module.RetrofitModule
import com.ziko.chucknorrisjoke.app.di.module.RepositoryModule
import com.ziko.chucknorrisjoke.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class, RetrofitModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: MainActivity)
}