package com.example.full_training.common

import android.app.Application
import com.example.full_training.common.di.GlobalDependencyManager

class AppApplication : Application() {

    private lateinit var mGlobalDependencyManager: GlobalDependencyManager

    override fun onCreate() {
        super.onCreate()
        mGlobalDependencyManager = GlobalDependencyManager()
    }

    fun getGlobalDependencyManager() = mGlobalDependencyManager
}
