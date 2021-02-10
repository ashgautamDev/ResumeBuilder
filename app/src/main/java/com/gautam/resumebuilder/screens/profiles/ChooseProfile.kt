package com.gautam.resumebuilder.screens.profiles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gautam.resumebuilder.R
import com.gautam.resumebuilder.databinding.FragmentChooseProfileBinding
import com.gautam.resumebuilder.databinding.FragmentHomeBinding

class ChooseProfile : Fragment() {

    private lateinit var _binding: FragmentChooseProfileBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChooseProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fabCreateProfile.setOnClickListener {
            findNavController().navigate(R.id.action_chooseProfile_to_profile)
        }
    }


}