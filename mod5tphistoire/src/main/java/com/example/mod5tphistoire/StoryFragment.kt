package com.example.mod5tphistoire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.mod5tphistoire.databinding.FragmentStoryBinding

class StoryFragment : Fragment() {

    lateinit var binding: FragmentStoryBinding

    val args : StoryFragmentArgs by navArgs()

    val name by lazy {args.story.name}
    val color by lazy {args.story.color}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStoryBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val storyContent = "Hello, je suis $name et j'adore le $color"

        binding.textViewStoryContent.text = storyContent

    }

}