package com.emincankarasoy.stronger2gether.ui

import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.emincankarasoy.stronger2gether.R
import com.emincankarasoy.stronger2gether.module.checkExitRequest
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        Handler().postDelayed(Runnable{goToNextScreen()},5000L)
    }

    private fun goToNextScreen(){

    }

    override fun onBackPressed() {
        checkExitRequest()
    }


}