package com.example.mod5tpcouleurs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.mod5tpcouleurs.databinding.FragmentPinkBinding

class PinkFragment : Fragment() {

    lateinit var binding: FragmentPinkBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPinkBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonBackPink.setOnClickListener{

                it.findNavController().navigate(R.id.action_pinkFragment2_to_homeFragment)

        }
    }

}