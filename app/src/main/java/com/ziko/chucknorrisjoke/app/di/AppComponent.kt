package com.ziko.chucknorrisjoke.app.di

import com.ziko.chucknorrisjoke.app.di.module.RepositoryModule
import com.ziko.chucknorrisjoke.presentation.MainActivity
import dagger.Component

@Component(modules = [RepositoryModule::class])
interface AppComponent {

//    @Component.Factory
//    interface Factory {
//
//        fun create(@BindsInstance context: Context): AppComponent
//    }

    fun inject(activity: MainActivity)
}