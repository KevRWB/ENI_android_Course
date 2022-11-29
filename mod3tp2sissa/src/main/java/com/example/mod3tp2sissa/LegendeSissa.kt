package com.example.mod3tp2sissa

import java.math.BigInteger

class LegendeSissa {
}

fun main() {

    var nbGrainsTotal = BigInteger.ONE
    val nbCases = 64
    var nbGrainsRiz = BigInteger.ONE

    for (case  in 2..nbCases){
        nbGrainsRiz = nbGrainsRiz.multiply(BigInteger.TWO)
        nbGrainsTotal += nbGrainsRiz
    }

    println("Nombre de grains de riz : $nbGrainsTotal")

}