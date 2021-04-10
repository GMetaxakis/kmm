package com.gm.kmm.android

import android.app.Application
import com.gm.kmm.PlatformRepo
import com.gm.kmm.initKoin
import org.koin.dsl.module

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            modules(androidModules)
        }
    }

    private val androidModules
        get() = module {
            factory<PlatformRepo> { PlatformImplementation() }
        }
}
