package com.example.instagram.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.instagram.R
import com.example.instagram.adapters.ReelsAdapter
import com.example.instagram.adapters.StoryAdapter
import com.example.instagram.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    lateinit var list: ArrayList<Int>
    lateinit var list1: ArrayList<Int>
    lateinit var storyAdapter: StoryAdapter
    lateinit var reelsAdapter: ReelsAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        list = ArrayList()
        list.add(R.drawable.img_20)
        list.add(R.drawable.img_21)
        list.add(R.drawable.img_22)
        list.add(R.drawable.img_23)
        list.add(R.drawable.img_24)
        list.add(R.drawable.img_25)
        list.add(R.drawable.img_26)
        list.add(R.drawable.img_27)
        storyAdapter = StoryAdapter(list)
        binding.rvStories.adapter = storyAdapter



        list1 = ArrayList()
        list1.add(R.drawable.img_10)
        list1.add(R.drawable.img_11)
        list1.add(R.drawable.img_9)
        reelsAdapter = ReelsAdapter(list1)
        binding.rvReels.adapter = reelsAdapter

        return binding.root
    }
}