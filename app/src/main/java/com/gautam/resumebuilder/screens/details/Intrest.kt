package com.gautam.resumebuilder.screens.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gautam.resumebuilder.databinding.FragmentIntrestBinding


class Intrest : Fragment() {
    private lateinit var _binding: FragmentIntrestBinding
    private val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentIntrestBinding.inflate(inflater, container, false)

        return binding.root

    }


}