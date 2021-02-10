package com.gautam.resumebuilder.screens.profiles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import androidx.navigation.fragment.findNavController
import com.gautam.resumebuilder.R
import com.gautam.resumebuilder.databinding.FragmentProfileBinding


class Profile : Fragment(R.layout.fragment_profile) {
    private lateinit var _binding: FragmentProfileBinding
    private val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpNavigationToDetailScreen()

    }

    private fun setUpNavigationToDetailScreen() {
        binding.btnPersonal.setOnClickListener { findNavController().navigate(R.id.action_profile_to_personalInfo) }
        binding.btnEduction.setOnClickListener { findNavController().navigate(R.id.action_profile_to_eduction) }
        binding.btnExperience.setOnClickListener { findNavController().navigate(R.id.action_profile_to_experience) }
        binding.btnObjective.setOnClickListener { findNavController().navigate(R.id.action_profile_to_objective) }
        binding.btnInterests.setOnClickListener { findNavController().navigate(R.id.action_profile_to_intrest) }
        binding.btnSkills.setOnClickListener { findNavController().navigate(R.id.action_profile_to_skills) }
        binding.btnProjects.setOnClickListener { findNavController().navigate(R.id.action_profile_to_projects) }


    }
}