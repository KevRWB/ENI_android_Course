package com.example.mod4demo1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //récupérer nos vues
        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)

        //Autre manière avec .also sur la rating bar
        findViewById<RatingBar>(R.id.ratingBar)
            .also{
                it?.numStars = 8
                it?.stepSize = 0.5f
                it?.rating = 3.2f
                it?.setIsIndicator(true)
            }

        //Affecter leur nouveau champ
        textView.text = "Coucou"
        editText.setText("Comment ça va ?")

        //Action sur bouton - affichage Snackbar
        findViewById<Button>(R.id.button).also {
            it?.setOnClickListener {
                Snackbar.make(it,
                    "Message snack bar !",
                    Snackbar.LENGTH_LONG)
                    .setAction("Annuler", {})
                    .show()
            }
        }
    }
}