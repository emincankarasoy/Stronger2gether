package com.emincankarasoy.stronger2gether.ui.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.Toolbar
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.emincankarasoy.stronger2gether.R
import com.emincankarasoy.stronger2gether.databinding.ActivityApplicationBinding
import com.emincankarasoy.stronger2gether.module.checkExitRequest
import android.graphics.drawable.Drawable
import com.google.android.material.snackbar.Snackbar

class ApplicationActivity : AppCompatActivity() {
    private lateinit var binding : ActivityApplicationBinding

    @SuppressLint("UseSupportActionBar", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApplicationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        binding.applicationToolbar.inflateMenu(R.menu.menu_home_toolbar)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.applicationNavHostFragment) as NavHostFragment
        NavigationUI.setupWithNavController(binding.applicationBottomNavView,navHostFragment.navController)

        setOnClickListener()
    }


    private fun setOnClickListener(){
        binding.donateFab.setOnClickListener{
            Snackbar.make(binding.root,"You can't use this feature in the demo mode!",Snackbar.LENGTH_INDEFINITE)
                .setAction("Exit"){

                }.show()
        }
    }


    override fun onBackPressed() {
        checkExitRequest()
    }
}