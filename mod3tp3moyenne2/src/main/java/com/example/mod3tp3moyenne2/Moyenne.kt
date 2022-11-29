package com.example.mod3tp3moyenne2

import java.util.*

class Moyenne {
}

fun main() {

    val stopValue = -1f
    val scanner = Scanner(System.`in`)
    var sum = 0f
    var count = 0

    do{
        println("Veuillez saisir une note ($stopValue pour arreter")
        var userInput = scanner.nextFloat()

        if(userInput != stopValue){
            println("Note : $userInput")
            sum += userInput
            count ++
        }


    }while(userInput != stopValue)

    var moyenne = sum / (count)

    println("Moyenne des notes : $moyenne")

}