package com.example.mod7lifecycle

import androidx.lifecycle.ViewModel

class CompteurViewModel: ViewModel() {


    var compteur = 0

    fun increment(){
        compteur++
    }
}