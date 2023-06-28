package com.vaibhavmojidra.androidkotlindemounittesting



import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class MyCalculationsTest{

    private lateinit var calculations: MyCalculations

    @Before
    fun setUp(){
        calculations= MyCalculations()
    }

    @Test
    fun calculateArea_radiusGiven_returnsCorrectResult(){
        val result =calculations.calculateArea(2.1)
        assertThat(result).isEqualTo(13.8474)
    }

    @Test
    fun calculateArea_zeroRadius_returnsCorrectResult(){
        val result =calculations.calculateArea(0.0)
        assertThat(result).isZero()
    }

    @Test
    fun calculateCircumference_radiusGiven_returnsCorrectResult(){
        val result =calculations.calculateCircumference(2.1)
        assertThat(result).isEqualTo(13.188)
    }

    @Test
    fun calculateCircumference_zeroRadius_returnsCorrectResult(){
        val result =calculations.calculateCircumference(0.0)
        assertThat(result).isZero()
    }
}