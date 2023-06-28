package com.vaibhavmojidra.androidkotlindemounittesting

import android.text.TextUtils
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel(val calculations: Calculations) :ViewModel() {

    var radius=MutableLiveData<String>()

    private var area=MutableLiveData<String?>()
    val areaValue:LiveData<String?>
        get()=area

    private var circumference=MutableLiveData<String?>()
    val circumferenceValue:LiveData<String?>
        get()=circumference


    fun calculate(){

        if(!TextUtils.isEmpty(radius.value)){
            val radiusDoubleValue= radius.value!!.toDouble()
            calculateArea(radiusDoubleValue)
            calculateCircumference(radiusDoubleValue)
        }else{
            area.value=null
            circumference.value=null
        }
    }

    fun calculateArea(radius:Double){
        val calculatedArea=calculations.calculateArea(radius)
        area.value=calculatedArea.toString()
    }

    fun calculateCircumference(radius:Double){
        val calculatedCircumference=calculations.calculateCircumference(radius)
        circumference.value=calculatedCircumference.toString()
    }
}