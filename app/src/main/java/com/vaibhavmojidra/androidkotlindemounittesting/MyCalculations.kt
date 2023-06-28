package com.vaibhavmojidra.androidkotlindemounittesting

class MyCalculations:Calculations {
    private val PI=3.14

    override fun calculateArea(radius: Double): Double = (PI*radius*radius)

    override fun calculateCircumference(radius: Double): Double =(2*PI*radius)
}