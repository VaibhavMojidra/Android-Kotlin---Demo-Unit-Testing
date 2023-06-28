package com.vaibhavmojidra.androidkotlindemounittesting

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MyViewModelFactory(private val calculations: Calculations) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MyViewModel::class.java)){
            return MyViewModel(calculations) as T
        }
        throw  IllegalArgumentException("Unknown View Model Class")
    }

}