package com.example.newsapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.newsapp.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottomNavigationView)
        val navHostFragment: Fragment? =
            supportFragmentManager.findFragmentById(R.id.newsNavhostFrament)

        bottomNavigationView.setupWithNavController(navHostFragment!!.findNavController())
    }
}