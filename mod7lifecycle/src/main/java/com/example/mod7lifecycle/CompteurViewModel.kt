package com.example.mod7lifecycle

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CompteurViewModel: ViewModel() {


    var compteur = MutableLiveData(12)

    fun increment(){
        compteur.value = compteur.value?.plus(1)
    }

    fun decrement(){
        compteur.value = compteur.value?.minus(1)
    }
}