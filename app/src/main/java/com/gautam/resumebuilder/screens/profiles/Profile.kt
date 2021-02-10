package com.gautam.resumebuilder.screens.profiles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gautam.resumebuilder.databinding.FragmentProfileBinding


class Profile : Fragment() {
    private lateinit var _binding: FragmentProfileBinding
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
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
        TODO("setup Navigation to Detail Screen")
    }


}