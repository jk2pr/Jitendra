package com.jk.mvvm

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.jk.mvvm.retrofit.IOrganizationsService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DataHandler private constructor() {

    companion object Singleton {
        val INSTANCE: DataHandler by lazy { DataHandler() }

        const val BASE_URL = "https://api.github.com"
    }

    val organizationHandler: OrganizationsHandler

    init {
        val gson = GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create()

        val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()


        organizationHandler = OrganizationsHandler(retrofit.create(IOrganizationsService::class.java))
    }
}