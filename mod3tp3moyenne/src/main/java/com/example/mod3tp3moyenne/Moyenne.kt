package com.example.mod3tp3moyenne

import java.util.*

class Moyenne {
}

fun main() {

    var moyenneList = mutableListOf<Float>()

    val scanner = Scanner(System.`in`)

    println("Veuillez saisir le nombre de note que vous allez saisir :")

    val nbNotes = scanner.nextInt()

    for (i : Int  in 1..nbNotes){
        println("Veuillez saisir une note :")

        var note =  scanner.nextFloat()

        moyenneList += note

        println("Note : $note")

    }

    var init = 0
    var somme : Float = init.toFloat()
    moyenneList.forEach{
        somme += it
    }

    var moyenne = somme / moyenneList.size


    println("Moyenne des notes : $moyenne")

}