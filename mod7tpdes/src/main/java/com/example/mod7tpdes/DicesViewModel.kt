package com.example.mod7tpdes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DicesViewModel: ViewModel() {

    val resultString = MutableLiveData("0/x")

    fun launch(max: Int){
        val rand = (1..max).random()
        resultString.value = "$rand/$max"
    }

}