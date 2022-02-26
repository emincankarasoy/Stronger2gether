package com.emincankarasoy.stronger2gether.data.source

import com.emincankarasoy.stronger2gether.data.model.Campaign
import java.util.*
import kotlin.collections.ArrayList

class CampaignDummyDataSource : CampaignDataSource {
    private val completedCampaignList = ArrayList<Campaign>().apply {
        add(Campaign("John Clark", "We need help for my dad!","https://r.resimlink.com/b9BO7XmS.jpg",120000, 200000))
        add(Campaign("Oliver Glory", "Let's meet the hospital expenses of our orphan child together.","https://imgyukle.com/f/2022/02/26/E50MHP.jpg",234000, 290000))
        add(Campaign("Oscar Smith", "Please help urgently for my child's medication!","https://imgyukle.com/f/2022/02/26/E50bwY.jpg",92000, 300000))
        add(Campaign("William Bean", "Hope for William, who has been waiting for treatment for 1 year.","https://imgyukle.com/f/2022/02/26/E506u0.jpg",170000, 210000))
        add(Campaign("Amelia Lively", "Help child struggling to get cancer medicine","https://imgyukle.com/f/2022/02/26/E507cp.jpg",298000, 445000))
        add(Campaign("Emily Beck", "Help for Emily who has left her last 2 doses of therapy.","https://imgyukle.com/f/2022/02/26/E57PkM.jpg",259000, 370000))
        add(Campaign("Alexander Sheeran", "little time left for Alexander.","https://imgyukle.com/f/2022/02/26/E57Vxj.jpg",121000, 300000))
        add(Campaign("Poppy Jackson", "I can't afford the treatment fees, help!","https://imgyukle.com/f/2022/02/26/E57C31.jpg",153000, 210000))
        add(Campaign("Jessica Henderson", "I need your donations for my eye surgery.","https://imgyukle.com/f/2022/02/26/E50HXy.jpg",24000, 175000))
        add(Campaign("Sophie Kane", "few days left for my mom!","https://r.resimlink.com/okvzw.jpg",143000, 265000))
    }

    private val campaignList = ArrayList<Campaign>().apply {
        add(Campaign("John Clark", "We need help for my dad!","https://r.resimlink.com/b9BO7XmS.jpg",120000, 200000))
        add(Campaign("Oliver Glory", "Let's meet the hospital expenses of our orphan child together.","https://imgyukle.com/f/2022/02/26/E50MHP.jpg",234000, 290000))
        add(Campaign("Oscar Smith", "Please help urgently for my child's medication!","https://imgyukle.com/f/2022/02/26/E50bwY.jpg",92000, 300000))
        add(Campaign("William Bean", "Hope for William, who has been waiting for treatment for 1 year.","https://imgyukle.com/f/2022/02/26/E506u0.jpg",170000, 210000))
        add(Campaign("Amelia Lively", "Help child struggling to get cancer medicine","https://imgyukle.com/f/2022/02/26/E507cp.jpg",298000, 445000))
        add(Campaign("Emily Beck", "Help for Emily who has left her last 2 doses of therapy.","https://imgyukle.com/f/2022/02/26/E57PkM.jpg",259000, 370000))
        add(Campaign("Alexander Sheeran", "little time left for Alexander.","https://imgyukle.com/f/2022/02/26/E57Vxj.jpg",121000, 300000))
        add(Campaign("Poppy Jackson", "I can't afford the treatment fees, help!","https://imgyukle.com/f/2022/02/26/E57C31.jpg",153000, 210000))
        add(Campaign("Jessica Henderson", "I need your donations for my eye surgery.","https://imgyukle.com/f/2022/02/26/E50HXy.jpg",24000, 175000))
        add(Campaign("Sophie Kane", "few days left for my mom!","https://r.resimlink.com/okvzw.jpg",143000, 265000))
    }


    override fun getCompletedCampaignList(): ArrayList<Campaign> {
       return completedCampaignList
    }

    override fun getCampaignList(): ArrayList<Campaign> {
        return campaignList
    }
}