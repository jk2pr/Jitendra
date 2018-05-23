package com.jk.mvvm

import com.jk.mvvm.retrofit.IOrganizationsService
import com.resume.mvvm.model.Organization

class OrganizationsHandler(private val organizationsService: IOrganizationsService) {
    fun getOrganizations() : RetrofitLiveData<List<Organization>> = RetrofitLiveData(organizationsService.getOrganizations())
}