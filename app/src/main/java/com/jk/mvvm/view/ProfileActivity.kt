package com.jk.mvvm.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.jk.mvvm.R
import com.jk.mvvm.viewmodel.OrganizationListViewModel



class ProfileActivity : AppCompatActivity() {

    private lateinit var viewModel: OrganizationListViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        viewModel = ViewModelProviders.of(this).get(OrganizationListViewModel::class.java)

        viewModel.liveData.observe(this, Observer
        { response ->
            response?.size
        })
        /* viewModel.getUser().observe(this, { user ->
             //update UI
         })*/

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.menu_profile, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
