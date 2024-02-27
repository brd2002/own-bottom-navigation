package com.example.bottomnavigationlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigationlearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bottombar = findViewById<View>(R.id.fragmentContainerView)
        val bottomNavigation = binding.bottomNavigationView
        bottomNavigation.setupWithNavController(bottombar.findNavController())

    }
}