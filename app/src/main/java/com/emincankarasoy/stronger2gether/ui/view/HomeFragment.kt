package com.emincankarasoy.stronger2gether.ui.view

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.emincankarasoy.stronger2gether.R
import com.emincankarasoy.stronger2gether.databinding.FragmentHomeBinding
import com.emincankarasoy.stronger2gether.ui.adapter.CompletedCampaignsAdapter
import com.emincankarasoy.stronger2gether.ui.adapter.VolunteersAdapter
import com.emincankarasoy.stronger2gether.ui.viewmodel.CampaignViewModel
import com.emincankarasoy.stronger2gether.ui.viewmodel.VolunteerViewModel

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding


    private val volunteerViewModel: VolunteerViewModel by lazy {
        ViewModelProvider.NewInstanceFactory().create(VolunteerViewModel::class.java)
    }

    private val campaignViewModel: CampaignViewModel by lazy {
        ViewModelProvider.NewInstanceFactory().create(CampaignViewModel::class.java)
    }

    private lateinit var completedCampaignsAdapter : CompletedCampaignsAdapter
    private lateinit var volunteersAdapter: VolunteersAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        completedCampaignsAdapter = CompletedCampaignsAdapter(ArrayList())
        binding.completedCampaignRecycler.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
        binding.completedCampaignRecycler.adapter = completedCampaignsAdapter

        volunteersAdapter = VolunteersAdapter(ArrayList())
        binding.volunteerRecyclerView.layoutManager = GridLayoutManager(activity,2,GridLayoutManager.VERTICAL,false)
        binding.volunteerRecyclerView.adapter = volunteersAdapter

        startObservingLiveDatas()
    }

    private fun startObservingLiveDatas(){
        campaignViewModel.campaignList.observe(viewLifecycleOwner){
            completedCampaignsAdapter.changeCampaignListValues(it)
        }

        volunteerViewModel.volunteerList.observe(viewLifecycleOwner){
            volunteersAdapter.changeVolunteerListValues(it)
        }

    }

}