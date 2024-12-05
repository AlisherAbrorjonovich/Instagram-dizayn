package com.example.instagram

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.instagram.databinding.ActivityMainBinding
import com.example.instagram.fragments.HomeFragment
import com.example.instagram.fragments.ProfileFragment
import com.example.instagram.fragments.ReelsFragment

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var list: ArrayList<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        list = ArrayList()
        val homeFragment = HomeFragment()
        val profileFragment = ProfileFragment()
        val reelsFragment = ReelsFragment()

        supportFragmentManager.beginTransaction()
            .add(R.id.contener, homeFragment)
            .commit()

        binding.imgHome.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.contener, homeFragment).addToBackStack(null)
                .commit()
        }

            binding.imgProfile.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.contener, profileFragment).addToBackStack(null)
                    .commit()
            }
            binding.imgReels.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.contener, reelsFragment).addToBackStack("d")
                    .commit()
            }

    }
}