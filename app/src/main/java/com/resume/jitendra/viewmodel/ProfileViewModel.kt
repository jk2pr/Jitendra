package com.resume.jitendra.viewmodel

import android.arch.lifecycle.ViewModel
import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.resume.jitendra.MyApplication
import javax.inject.Inject
import com.google.firebase.database.DatabaseError




class ProfileViewModel : ViewModel() {
    @Inject
    lateinit var reference: DatabaseReference
    init {
        MyApplication.appComponent.inject(this)
    }

    fun getData(){
        reference.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue(String::class.java)
               // Log.d(TAG, "Value is: " + value!!)
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
              //  Log.w(TAG, "Failed to read value.", error.toException())
            }
        })

    }
   /* fun getUser(): LiveData<User> {
        return null
    }*/
}