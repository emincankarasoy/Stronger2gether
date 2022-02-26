package com.emincankarasoy.stronger2gether.ui.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.emincankarasoy.stronger2gether.R
import com.emincankarasoy.stronger2gether.data.model.Campaign
import com.emincankarasoy.stronger2gether.databinding.ActivityCampaignDetailBinding

class CampaignDetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCampaignDetailBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCampaignDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.activityCampaignToolbar.setNavigationIcon(R.drawable.ic_round_arrow_back)
        binding.activityCampaignToolbar.setNavigationOnClickListener {
            onBackPressed()
        }
        binding.activityCampaignToolbar.inflateMenu(R.menu.menu_campaign_toolbar)

        val intent = intent
        val selectedCampaign : Campaign = intent.getSerializableExtra("campaign") as Campaign
        binding.campaignPatientname.text = selectedCampaign.campaignName
        binding.campaignDescription.text = selectedCampaign.campaignDescription
        binding.campaignDetailProgressBar.progress = selectedCampaign.campaignTotalDonation
        binding.campaignDetailProgressBar.max = selectedCampaign.campaignTargetDonation
        Glide.with(binding.root)
            .load(selectedCampaign.campaignImageURL)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(binding.activityCampaignImage)
        binding.campaignDetailTotalDonate.text = "$"+selectedCampaign.campaignTotalDonation+" / $"+selectedCampaign.campaignTargetDonation
    }
}