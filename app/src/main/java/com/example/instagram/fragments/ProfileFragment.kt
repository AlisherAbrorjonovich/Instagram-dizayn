package com.example.instagram.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.instagram.R
import com.example.instagram.adapters.AktualniAdapter
import com.example.instagram.adapters.ProfileAdapter
import com.example.instagram.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    private val binding by lazy { FragmentProfileBinding.inflate(layoutInflater)}
    lateinit var list: ArrayList<Int>
    lateinit var list1 : ArrayList<Int>
    lateinit var profileAdapter: ProfileAdapter
    lateinit var aktualniAdapter: AktualniAdapter
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       list = ArrayList()
       list.add(R.drawable.img_10)
       list.add(R.drawable.img_11)
       list.add(R.drawable.img_9)
       profileAdapter = ProfileAdapter(list)
       binding.rv.adapter = profileAdapter

       list1 = ArrayList()
       list1.add(R.drawable.img_13)
       list1.add(R.drawable.img_14)
       list1.add(R.drawable.img_15)
       list1.add(R.drawable.img_16)
       list1.add(R.drawable.img_17)
       list1.add(R.drawable.img_18)
       list1.add(R.drawable.img_19)
       aktualniAdapter = AktualniAdapter(list1)
       binding.rv1.adapter = aktualniAdapter

        return binding.root
    }
}