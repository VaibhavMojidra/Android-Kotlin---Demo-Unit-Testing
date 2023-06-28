package com.vaibhavmojidra.androidkotlindemounittesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.vaibhavmojidra.androidkotlindemounittesting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        val viewModelFactory=MyViewModelFactory(MyCalculations())
        viewModel=ViewModelProvider(this,viewModelFactory).get(MyViewModel::class.java)
        binding.myViewModel=viewModel
        binding.lifecycleOwner=this
    }
}