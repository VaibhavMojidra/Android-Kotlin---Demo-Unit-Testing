package com.vaibhavmojidra.androidkotlindemounittesting

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito

class MyViewModelTest{

    private lateinit var myViewModel: MyViewModel
    private lateinit var calculations: Calculations


    @get:Rule
    var instantTaskExecutorRule=InstantTaskExecutorRule()

    @Before
    fun setUp(){
        calculations=Mockito.mock(Calculations::class.java)
        Mockito.`when`(calculations.calculateArea(2.1)).thenReturn(13.8474)
        Mockito.`when`(calculations.calculateCircumference(2.1)).thenReturn(13.188)
        myViewModel= MyViewModel(calculations)
    }

    @Test
    fun calculateArea_radiusSent_updateLiveData(){
        myViewModel.calculateArea(2.1)
        val result =myViewModel.areaValue.value
        assertThat(result).isEqualTo("13.8474")
    }

    @Test
    fun calculateCircumference_radiusSent_updateLiveData(){
        myViewModel.calculateCircumference(2.1)
        val result =myViewModel.circumferenceValue.value
        assertThat(result).isEqualTo("13.188")
    }
}