package com.emincankarasoy.stronger2gether.data.model

import java.util.*

data class Campaign(
    var campaignName:String,
    var campaignDescription:String,
    val campaignImageURL:String,
    var campaignTotalDonation:Int,
    var campaignTargetDonation:Int,
)
