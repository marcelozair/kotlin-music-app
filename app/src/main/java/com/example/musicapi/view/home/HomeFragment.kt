package com.example.musicapi.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.musicapi.R
import com.example.musicapi.adapters.MusicAdapter
import com.example.musicapi.databinding.FragmentHomeBinding
import com.example.musicapi.models.music.MusicProvider
import com.example.musicapi.view.profile.ProfileFragment

class HomeFragment : Fragment() {
    private val binding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstancesState: Bundle?
    ): View? {
        println("loading component, ready????");
        println(MusicProvider.musicList.size);
        binding.musicList.layoutManager = LinearLayoutManager(requireContext());
        binding.musicList.adapter = MusicAdapter(MusicProvider.musicList);

        return binding.root;
    }

}