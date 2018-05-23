package com.jk.mvvm.retrofit

import com.resume.mvvm.model.Organization
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface IOrganizationsService {
    @GET("organizations")
    fun getOrganizations(@Query("since") since : Int? = null) : Call<List<Organization>>
}