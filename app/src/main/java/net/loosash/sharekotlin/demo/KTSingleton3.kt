package net.loosash.sharekotlin.demo

import android.content.Context

class KTSingleton3 private constructor() {

    companion object {
        val instance: KTSingleton3 by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            KTSingleton3()
        }
    }
}