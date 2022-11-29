package com.example.mod5tphistoire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.mod5tphistoire.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonGenerate.setOnClickListener{
            //TODO Get the two fields to make a user
            val story = Story(binding.editTextStoryName.text.toString(),
                binding.editTextStoryColor.text.toString()
            )

            val homeDestination = HomeFragmentDirections.actionHomeFragmentToStoryFragment(story)

            //TODO On se dirige vers Home fragment avec le user comme arg
            it.findNavController().navigate(homeDestination)

            //TODO go to Home fragment
            //it.findNavController().navigate(R.id.actionLoginToHome)
        }
    }

}