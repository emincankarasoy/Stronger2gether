package com.emincankarasoy.stronger2gether.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.emincankarasoy.stronger2gether.data.model.Volunteer
import com.emincankarasoy.stronger2gether.databinding.RecyclerVolunteerBinding

class VolunteersAdapter(private var itemList : ArrayList<Volunteer>) : RecyclerView.Adapter<VolunteersAdapter.ViewHolder>() {

    private lateinit var binding: RecyclerVolunteerBinding


    @SuppressLint("NotifyDataSetChanged")
    fun changeVolunteerListValues(volunteerList:ArrayList<Volunteer>){
        itemList.clear()
        itemList.addAll(volunteerList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = RecyclerVolunteerBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(itemList[position])
    }

    override fun getItemCount(): Int = itemList.size

    class ViewHolder(private val binding:RecyclerVolunteerBinding) : RecyclerView.ViewHolder(binding.root){
        @SuppressLint("SetTextI18n")
        fun bindItem(volunteer: Volunteer){
            binding.volunteerName.text = volunteer.volunteerName +" "+ volunteer.volunteerSurname
            Glide.with(binding.root)
                .load(volunteer.volunteerImageURL)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(binding.volunteerImage)
        }
    }

}