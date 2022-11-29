package com.example.mod4tp1random

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnGenerate).also {
            it?.setOnClickListener {
                val nbMin = findViewById<EditText>(R.id.editTxtNb1).text.toString().toIntOrNull()
                val nbMax = findViewById<EditText>(R.id.editTxtNb2).text.toString().toIntOrNull()

                findViewById<TextView>(R.id.textViewResult).also {

                    if(nbMin != null && nbMax != null  && (nbMin < nbMax)){
                        it?.text = "Resultat :" + (nbMin..nbMax).random().toString()
                    }else{
                        it?.text = "Le nombre max doit être supérieur au nombre min"
                    }



                }
            }


        }


    }
}