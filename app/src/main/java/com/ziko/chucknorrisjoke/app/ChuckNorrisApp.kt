package com.ziko.chucknorrisjoke.app

import android.app.Application
import com.ziko.chucknorrisjoke.app.logger.AndroidLoggingHandler
import com.ziko.common.extensions.logI


class ChuckNorrisApp : Application() {

    override fun onCreate() {
        super.onCreate()

        AndroidLoggingHandler.setup(globalTag = GLOBAL_TAG)
        logI("Application is started!")
    }

    companion object {

        private const val GLOBAL_TAG = "TAG"
    }
}