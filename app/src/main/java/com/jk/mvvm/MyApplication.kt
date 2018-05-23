package com.jk.mvvm

import android.app.Application
import com.resume.mvvm.di.component.AppModule
import com.resume.mvvm.di.module.AppComponent
import com.resume.mvvm.di.module.DaggerAppComponent


class MyApplication:Application(){

    companion object {
        lateinit var appComponent: AppComponent
    }
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()



    }
}