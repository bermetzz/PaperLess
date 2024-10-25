package com.example.hacathon.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.hacathon.R
import com.example.hacathon.databinding.FragmentWelcomePageBinding


class WelcomePageFragment : Fragment() {

    private lateinit var binding : FragmentWelcomePageBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentWelcomePageBinding.inflate(inflater, container, false)
        return binding.root
    }





    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.anmeldenButtonWelcome.setOnClickListener{
            findNavController().navigate(R.id.action_welcomePageFragment_to_loginFragment)
        }

        binding.registrierenButtonWelcome.setOnClickListener{
            findNavController().navigate(R.id.action_welcomePageFragment_to_registrationFragment)
        }

        // Add a callback for back button press to close the app
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                requireActivity().finishAffinity() // This closes the app
            }
        })
    }

}