package com.marcobrenes.wickedcool

import android.app.Application

abstract class WickedApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        init()
    }

    abstract fun init()
}
