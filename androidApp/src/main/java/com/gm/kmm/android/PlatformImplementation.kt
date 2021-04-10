package com.gm.kmm.android

import com.gm.kmm.Platform
import com.gm.kmm.PlatformRepo

class PlatformImplementation : PlatformRepo {
    override fun getPlatform(): String {
        return Platform().platform
    }
}
