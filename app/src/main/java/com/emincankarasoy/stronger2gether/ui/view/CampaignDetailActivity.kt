package com.emincankarasoy.stronger2gether.ui.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.emincankarasoy.stronger2gether.R
import com.emincankarasoy.stronger2gether.databinding.ActivityCampaignDetailBinding

class CampaignDetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCampaignDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCampaignDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.activityCampaignToolbar.setNavigationIcon(R.drawable.ic_round_arrow_back)
        binding.activityCampaignToolbar.setNavigationOnClickListener {
            onBackPressed()
        }
        binding.activityCampaignToolbar.inflateMenu(R.menu.menu_campaign_toolbar)


    }
}