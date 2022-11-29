package com.example.mod4tpvraifaux

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mod4tpvraifaux.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding



    val questionUn = Question(
        "Le cheval d'henry 4 est blanc ?",
        true
    )

    val questionDeux = Question(
        "Howel est awesome ?",
        true
    )

    val questionTrois = Question(
        "Cette appli vaut de l'argent ?",
        false
    )

    val listQuestions = listOf<Question>(questionUn, questionDeux, questionTrois)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var score = 0
        var index = 0
        var currentQuestion = listQuestions.get(index)

        binding.question = currentQuestion
        index++

        binding.textViewScore.text = score.toString()

        binding.buttonTrue.setOnClickListener {

            if(currentQuestion.answer){
                score ++
            }


            binding.textViewScore.text = score.toString()


            if(index < listQuestions.size){
                binding.question = currentQuestion
                index++
            }else {

                binding.buttonTrue.isEnabled = false
                binding.buttonFalse.isEnabled = false
            }
            currentQuestion = listQuestions.get(index)


        }

        binding.buttonFalse.setOnClickListener {
            if(!currentQuestion.answer){
                score ++
            }

            currentQuestion = listQuestions.get(index)
            binding.textViewScore.text = " Score : $score"


            if(index < listQuestions.size){
                binding.question = currentQuestion
                index++
            }else {
                binding.buttonTrue.isEnabled = false
                binding.buttonFalse.isEnabled = false
            }

        }



    }
}