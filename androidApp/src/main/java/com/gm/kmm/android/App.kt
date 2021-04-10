package com.gm.kmm.android

import android.app.Application
import com.gm.kmm.initKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
        }
    }
}
