package com.resume.jitendra.di.component

import android.app.Application
import android.content.Context
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.resume.jitendra.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val app: MyApplication) {

    @Provides
    @Singleton
    fun provideContext(): Context {
        return app
    }

    @Provides
    @Singleton
    fun provideApplication(): Application = app

    @Provides
    @Singleton
    fun provideFirebaseAnalytics(): FirebaseAnalytics = FirebaseAnalytics.getInstance(app)

    @Provides
    @Singleton
    fun provideFirebaseDatabaseReference(): DatabaseReference
            = FirebaseDatabase.getInstance().getReference("Profile")

}