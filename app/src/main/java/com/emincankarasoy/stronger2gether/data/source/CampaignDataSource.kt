package com.emincankarasoy.stronger2gether.data.source

import com.emincankarasoy.stronger2gether.data.model.Campaign

interface CampaignDataSource {
    fun getCompletedCampaignList():ArrayList<Campaign>
    fun getCampaignList():ArrayList<Campaign>
}