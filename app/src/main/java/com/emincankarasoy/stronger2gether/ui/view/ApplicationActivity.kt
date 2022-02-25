package com.emincankarasoy.stronger2gether.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.emincankarasoy.stronger2gether.R
import com.emincankarasoy.stronger2gether.databinding.ActivityApplicationBinding

class ApplicationActivity : AppCompatActivity() {
    private lateinit var binding : ActivityApplicationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityApplicationBinding>(this,R.layout.activity_application)
    }
}