package com.emincankarasoy.stronger2gether.data.repository

import com.emincankarasoy.stronger2gether.data.model.Campaign
import com.emincankarasoy.stronger2gether.data.source.CampaignDataSource
import com.emincankarasoy.stronger2gether.data.source.CampaignDummyDataSource

class CampaignRepository {
    private val campaignLocalDataSource:CampaignDataSource = CampaignDummyDataSource()

    fun getCompletedCampaign():ArrayList<Campaign>{
        return campaignLocalDataSource.getCompletedCampaignList()
    }

}