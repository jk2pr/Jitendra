package com.jk.mvvm.viewmodel

import android.arch.lifecycle.ViewModel
import com.jk.mvvm.DataHandler
import com.jk.mvvm.RetrofitLiveData
import com.resume.mvvm.model.Organization

class OrganizationListViewModel : ViewModel() {

    val liveData : RetrofitLiveData<List<Organization>> = DataHandler.INSTANCE.organizationHandler.getOrganizations()

    override fun onCleared() {
        liveData.cancel()
    }
}