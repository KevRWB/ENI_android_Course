package com.example.mod7tpdes

import androidx.lifecycle.ViewModel

class DicesViewModel: ViewModel() {

    var result = 0

    fun rand(max: Int){
        result = (1..max).random()
    }


}