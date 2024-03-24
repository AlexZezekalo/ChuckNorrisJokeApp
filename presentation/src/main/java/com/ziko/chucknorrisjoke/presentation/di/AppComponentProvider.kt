package com.ziko.chucknorrisjoke.presentation.di

import com.ziko.chucknorrisjoke.presentation.MainActivity

interface AppComponentProvider {

    fun inject(activity: MainActivity)
}