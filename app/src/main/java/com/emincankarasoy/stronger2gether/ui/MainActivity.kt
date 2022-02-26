package com.emincankarasoy.stronger2gether.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.emincankarasoy.stronger2gether.R
import com.emincankarasoy.stronger2gether.ui.view.ApplicationActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        lifecycleScope.launch(Dispatchers.Default) {
            delay(4000L)
            goToNextScreen()
        }
    }

    private fun goToNextScreen(){
        startActivity(Intent(this,ApplicationActivity::class.java))
        finish()
    }
}