package com.emincankarasoy.stronger2gether.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.emincankarasoy.stronger2gether.data.model.Campaign
import com.emincankarasoy.stronger2gether.data.repository.CampaignRepository

class CampaignViewModel:ViewModel() {
    private val campaignRepository = CampaignRepository()

    private val _campaignList = MutableLiveData<ArrayList<Campaign>>()

    val campaignList: LiveData<ArrayList<Campaign>>
        get() = _campaignList

    init {
        val arrayList = campaignRepository.getCompletedCampaign()
        _campaignList.postValue(arrayList)
    }

}