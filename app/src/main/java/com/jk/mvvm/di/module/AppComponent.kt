package com.resume.mvvm.di.module

import com.resume.mvvm.di.component.AppModule
import com.jk.mvvm.view.ProfileActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class)])
interface AppComponent {
    fun inject(app: ProfileActivity)

}