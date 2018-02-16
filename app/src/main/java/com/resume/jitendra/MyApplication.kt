package com.resume.jitendra

import android.app.Application
import com.resume.jitendra.di.component.AppModule
import com.resume.jitendra.di.module.AppComponent
import com.resume.jitendra.di.module.DaggerAppComponent

class MyApplication:Application(){

    companion object {
        lateinit var appComponent: AppComponent
    }
    override fun onCreate() {
        super.onCreate()
        appComponent= DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()



    }
}