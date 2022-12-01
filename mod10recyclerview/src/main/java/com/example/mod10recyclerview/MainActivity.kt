package com.example.mod10recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alGateaux = arrayListOf(
            Gateau("Gateau chocolat", false, 4, "chocolaté" ),
            Gateau("Gateau citron", false, 3, "citronné" ),
            Gateau("Gateau vanille", true, 4, "vanillé" ),
            Gateau("Gateau praline", false, 10, "praliné" )
        )

        val adapter = GateauAdapter(alGateaux)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewGateau)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter


    }
}