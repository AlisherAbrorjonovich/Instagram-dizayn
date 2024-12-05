package com.example.instagram.fragments

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.instagram.R
import com.example.instagram.databinding.FragmentReelsBinding

class ReelsFragment : Fragment() {

    private val binding by lazy { FragmentReelsBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // VideoView komponentasini topish

        val rootView = binding.root

        // Initialize the VideoView from the binding object
        val videoView = binding.videoView  // Assuming you have a VideoView in your layout file

        // Get the video URI from the raw folder
        val videoUri = Uri.parse("android.resource://" + requireActivity().packageName + "/" + R.raw.jas)

        // Set the URI to the VideoView
        videoView.setVideoURI(videoUri)

        // Start playing the video
        videoView.start()


        return binding.root


    }
}