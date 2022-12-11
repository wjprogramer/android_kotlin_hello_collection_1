package com.wjprogrammer.happybirthday_compose

import android.app.Application
import com.wjprogrammer.happybirthday_compose.features.marsphotos.data.AppContainer
import com.wjprogrammer.happybirthday_compose.features.marsphotos.data.DefaultAppContainer

class MainApplication : Application() {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
