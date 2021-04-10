package com.gm.kmm.android

import com.gm.kmm.PlatformRepo

class PlatformImplementation : PlatformRepo {
    override fun getPlatform(): String {
        return "Android ${android.os.Build.VERSION.SDK_INT}"
    }
}
