package com.emincankarasoy.stronger2gether.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.emincankarasoy.stronger2gether.data.model.Campaign
import com.emincankarasoy.stronger2gether.databinding.RecyclerCampaignBinding

class CampaignsAdapter (private var itemList : ArrayList<Campaign>)  : RecyclerView.Adapter<CampaignsAdapter.ViewHolder>() {


    private lateinit var binding: RecyclerCampaignBinding

    @SuppressLint("NotifyDataSetChanged")
    fun changeCampaignListValues(campaignList:ArrayList<Campaign>){
        itemList.clear()
        itemList.addAll(campaignList)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = RecyclerCampaignBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(itemList[position])
    }

    override fun getItemCount(): Int = itemList.size

    class ViewHolder(private val binding: RecyclerCampaignBinding) : RecyclerView.ViewHolder(binding.root){
        @SuppressLint("SetTextI18n")
        fun bindItem(campaign: Campaign){
            binding.campaignName.text = campaign.campaignName
            binding.campaignDescription.text = campaign.campaignDescription
            binding.totalDonateText.text = "$"+campaign.campaignTotalDonation.toString() + " / $" + campaign.campaignTargetDonation.toString()
            Glide.with(binding.root)
                .load(campaign.campaignImageURL)
                .into(binding.campaignBackground)
            binding.campaignProgressBar.max = campaign.campaignTargetDonation
            binding.campaignProgressBar.progress = campaign.campaignTotalDonation
        }
    }
}