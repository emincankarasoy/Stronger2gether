package com.emincankarasoy.stronger2gether.ui.adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.emincankarasoy.stronger2gether.data.model.Campaign
import com.emincankarasoy.stronger2gether.databinding.RecyclerCompletedCampaignBinding
import com.emincankarasoy.stronger2gether.ui.view.CampaignDetailActivity

class CompletedCampaignsAdapter(private var itemList : ArrayList<Campaign>) : RecyclerView.Adapter<CompletedCampaignsAdapter.ViewHolder>() {

    private lateinit var binding: RecyclerCompletedCampaignBinding


    @SuppressLint("NotifyDataSetChanged")
    fun changeCampaignListValues(campaignList:ArrayList<Campaign>){
        itemList.clear()
        itemList.addAll(campaignList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = RecyclerCompletedCampaignBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(itemList[position])
    }

    override fun getItemCount(): Int = itemList.size

    class ViewHolder(private val binding: RecyclerCompletedCampaignBinding) : RecyclerView.ViewHolder(binding.root){
        fun bindItem(campaign: Campaign){
            binding.campaignName.text = campaign.campaignName
            binding.campaignDescription.text = campaign.campaignDescription
            binding.campaignProgressBar.max = campaign.campaignTargetDonation
            binding.campaignProgressBar.progress = campaign.campaignTotalDonation
            Glide.with(binding.root)
                .load(campaign.campaignImageURL)
                .into(binding.campaignBackground)
        }
    }
}