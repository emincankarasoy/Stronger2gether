package com.emincankarasoy.stronger2gether.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.emincankarasoy.stronger2gether.R
import com.emincankarasoy.stronger2gether.databinding.ActivityApplicationBinding
import com.emincankarasoy.stronger2gether.module.checkExitRequest
import com.emincankarasoy.stronger2gether.ui.adapter.CompletedCampaignsAdapter
import com.emincankarasoy.stronger2gether.ui.viewmodel.CampaignViewModel

class ApplicationActivity : AppCompatActivity() {
    private lateinit var binding : ActivityApplicationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApplicationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.applicationNavHostFragment) as NavHostFragment
        NavigationUI.setupWithNavController(binding.applicationBottomNavView,navHostFragment.navController)
    }

    override fun onBackPressed() {
        checkExitRequest()
    }
}