package com.emincankarasoy.stronger2gether.ui.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.emincankarasoy.stronger2gether.R
import com.emincankarasoy.stronger2gether.module.checkExitRequest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        checkExitRequest()
    }


}