package com.resume.jitendra.di.module

import com.resume.jitendra.di.component.AppModule
import com.resume.jitendra.view.ProfileActivity
import com.resume.jitendra.viewmodel.ProfileViewModel
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class)])
interface AppComponent {
    fun inject(app: ProfileActivity)
    fun inject(dbref: ProfileViewModel)
}