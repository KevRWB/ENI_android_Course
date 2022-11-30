package com.example.mod7tpdes

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mod7tpdes.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), OnClickListener {

    lateinit var viewModel : DicesViewModel
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this)[DicesViewModel::class.java]
        binding.viewmodel = viewModel
        //add liveData
        binding.lifecycleOwner = this

    }

    override fun onClick(view: View?) {
        when(view){
            binding.buttonDice6 -> viewModel.launch(6)
            binding.buttonDice8 -> viewModel.launch(8)
        }
    }
}