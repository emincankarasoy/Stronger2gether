package com.emincankarasoy.stronger2gether.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.emincankarasoy.stronger2gether.databinding.FragmentAccountBinding

class AccountFragment : Fragment() {

    private lateinit var binding : FragmentAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAccountBinding.inflate(inflater,container,false)
        return binding.root
    }

}