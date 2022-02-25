package com.emincankarasoy.stronger2gether.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.emincankarasoy.stronger2gether.R
import com.emincankarasoy.stronger2gether.ui.view.ApplicationActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        Handler().postDelayed({goToNextScreen()},5000L)
    }

    private fun goToNextScreen(){
        startActivity(Intent(this,ApplicationActivity::class.java))
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        finish()
    }
}