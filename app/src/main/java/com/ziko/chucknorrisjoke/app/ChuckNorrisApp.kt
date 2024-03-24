package com.ziko.chucknorrisjoke.app

import android.app.Application
import com.ziko.chucknorrisjoke.app.di.DaggerAppComponent
import com.ziko.chucknorrisjoke.app.logger.AndroidLoggingHandler
import com.ziko.chucknorrisjoke.presentation.MainActivity
import com.ziko.chucknorrisjoke.presentation.di.AppComponentProvider
import com.ziko.common.extensions.logI


class ChuckNorrisApp : Application(), AppComponentProvider {

    private val appComponent = DaggerAppComponent.create()

    override fun onCreate() {
        super.onCreate()

        AndroidLoggingHandler.setup(globalTag = GLOBAL_TAG)
        logI("Application is started!")
    }

    companion object {

        private const val GLOBAL_TAG = "TAG"
    }

    override fun inject(activity: MainActivity) {
        appComponent.inject(activity)
    }
}