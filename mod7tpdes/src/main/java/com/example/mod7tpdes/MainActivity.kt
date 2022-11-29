package com.example.mod7tpdes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mod7tpdes.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var viewModel : DicesViewModel
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this)[DicesViewModel::class.java]

        super.onCreate(savedInstanceState)

        binding.buttonDice6.setOnClickListener(){
            viewModel.rand(6)
            binding.textViewDiceValue.text = viewModel.result.toString()
        }

        binding.buttonDice8.setOnClickListener(){
            viewModel.rand(8)
            binding.textViewDiceValue.text = viewModel.result.toString()
        }
    }
}