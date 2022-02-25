package com.emincankarasoy.stronger2gether.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.emincankarasoy.stronger2gether.R
import com.emincankarasoy.stronger2gether.databinding.ActivityApplicationBinding

class ApplicationActivity : AppCompatActivity() {
    private lateinit var binding : ActivityApplicationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityApplicationBinding>(this,R.layout.activity_application)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.applicationNavHostFragment) as NavHostFragment
        NavigationUI.setupWithNavController(binding.applicationBottomNavView,navHostFragment.navController)

    }
}