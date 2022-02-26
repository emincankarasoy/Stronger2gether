package com.emincankarasoy.stronger2gether.data.source

import com.emincankarasoy.stronger2gether.data.model.Campaign
import java.util.*
import kotlin.collections.ArrayList

class CampaignDummyDataSource : CampaignDataSource {
    private val completedCampaignList = ArrayList<Campaign>().apply {
        add(Campaign("Abigael Cox", "Help me get a kidney transplant","https://imgyukle.com/f/2022/02/26/EIXKph.webp",2000, 2000))
        add(Campaign("Adrien Marshall", "I need surgery to straighten my spine","https://imgyukle.com/f/2022/02/26/EIXw3s.jpg",11000, 11000))
        add(Campaign("Darrin Young", "Assistance to stroke victim for medical support","https://imgyukle.com/f/2022/02/26/EIcjLU.webp",12000, 12000))
        add(Campaign("Brian Scott", "Help her win the battle for survival","https://imgyukle.com/f/2022/02/26/EIcc0A.webp",8400, 8400))
        add(Campaign("Carl Summers", "Support my dad's chemotherapy treatment!","https://imgyukle.com/f/2022/02/26/EIciGI.jpg",22100, 22100))
        add(Campaign("Arnold Rogers", "My baby needs emergency eye surgery to see!","https://imgyukle.com/f/2022/02/26/EIcoxe.jpg",4000, 4000))
        add(Campaign("Britney Forester", "Support the fight against stage 4 lung cancer","https://imgyukle.com/f/2022/02/26/EIXlHH.jpg",3500, 3500))
        add(Campaign("Kaitlin Gray", "Help me raise money to save my baby's life","https://imgyukle.com/f/2022/02/26/EIcP0R.jpg",7300, 7300))
        add(Campaign("Cristal Hill", "We need your support for leukemia treatment","https://imgyukle.com/f/2022/02/26/EITykM.jpg",2400, 2400))
        add(Campaign("Alena Kelly", "Help me get my robotic prostheses","https://imgyukle.com/f/2022/02/26/EIXt1A.webp",13000, 13000))
    }

    private val campaignList = ArrayList<Campaign>().apply {
        add(Campaign("Katrina Jones", "Triple negative breast cancer stage 3 financial aid!","https://imgyukle.com/f/2022/02/26/EIBw8P.jpg",1705, 2400))
        add(Campaign("Maggie Gardener", "Help for Maggie who is going to have heart surgery!","https://imgyukle.com/f/2022/02/26/EIpL8f.jpg",3190, 5600))
        add(Campaign("Nicole Fox", "Fund for my hospitalized mother","https://imgyukle.com/f/2022/02/26/EIpP0v.jpg",1150, 3900))
        add(Campaign("Devan Wood", "My son has autism spectrum disorder","https://imgyukle.com/f/2022/02/26/EIp55U.jpg",3215, 6500))
        add(Campaign("Emmanuel Reid", "Please help my dad fight Amrotiophic Lateral Sclerosis.","https://imgyukle.com/f/2022/02/26/EIpED6.jpg",1200, 3100))
        add(Campaign("Precious Evans", "My daughter has spinal muscular atrophy 2","https://imgyukle.com/f/2022/02/26/EIpTbA.jpg",4477, 13000))
        add(Campaign("Sage Davies", "Help me on my chemotherapy journey","https://imgyukle.com/f/2022/02/26/EIT9Gj.jpg",9100, 17000))
        add(Campaign("Henry Bishop", "Donation for kidney cell carcinoma","https://imgyukle.com/f/2022/02/26/EIpnry.jpg",2000, 5800))
        add(Campaign("Karl Green", "Pulse generator for my pacemaker","https://imgyukle.com/f/2022/02/26/EIpJgM.jpg",4500, 10000))
        add(Campaign("Marcelo Hunt", "I'm Marcelo, I want to keep seeing!","https://imgyukle.com/f/2022/02/26/EIpu7o.webp",11550, 14000))
        add(Campaign("Scarlett Carter", "For our daughter suffering from brittle bone disease","https://imgyukle.com/f/2022/02/26/EIT7hH.jpg",10742, 12700))
        add(Campaign("Ricky Osborne", "MCDK medical assistance for my baby","https://imgyukle.com/f/2022/02/26/EIpHhI.jpg",3900, 7300))
        add(Campaign("Rachelle Berry", "I need help paying for your kidney transplant surgery.","https://imgyukle.com/f/2022/02/26/EIBALY.jpg",6531, 11500))
        add(Campaign("Michelle Adams", "Help my daughter with medical expenses and therapy.","https://imgyukle.com/f/2022/02/26/EIpjNS.webp",480, 2700))
        add(Campaign("Laurel Bell", "I need a cornea transplant, I need your donations.","https://imgyukle.com/f/2022/02/26/EIBdK0.jpg",13505, 20000))
        add(Campaign("Isaac Wallace", "Help with my bowel transplant surgery!","https://imgyukle.com/f/2022/02/26/EIaUJx.jpg",615, 2300))
        add(Campaign("George Stephens", "Heart surgery that saved my dad's life","https://imgyukle.com/f/2022/02/26/EIalaM.jpg",2255, 3800))
        add(Campaign("Kimberly Reid", "help me stand up!","https://imgyukle.com/f/2022/02/26/EIYpm8.jpg",4118, 9800))
        add(Campaign("Felipe Philips", "Help me get my next overdose","https://imgyukle.com/f/2022/02/26/EIa7k1.jpg",890, 2150))
        add(Campaign("Elvin Stewart", "I need cash donation for my treatment","https://imgyukle.com/f/2022/02/26/EIHoxS.jpg",2000, 2650))

    }


    override fun getCompletedCampaignList(): ArrayList<Campaign> {
       return completedCampaignList
    }

    override fun getCampaignList(): ArrayList<Campaign> {
        return campaignList
    }
}