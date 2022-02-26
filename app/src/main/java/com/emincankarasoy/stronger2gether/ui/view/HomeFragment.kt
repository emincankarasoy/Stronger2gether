package com.emincankarasoy.stronger2gether.ui.view

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.emincankarasoy.stronger2gether.R
import com.emincankarasoy.stronger2gether.databinding.FragmentHomeBinding
import com.emincankarasoy.stronger2gether.ui.adapter.CompletedCampaignsAdapter
import com.emincankarasoy.stronger2gether.ui.viewmodel.CampaignViewModel

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private val campaignViewModel: CampaignViewModel by lazy {
        ViewModelProvider.NewInstanceFactory().create(CampaignViewModel::class.java)
    }

    private lateinit var completedCampaignsAdapter : CompletedCampaignsAdapter

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

        binding.homeFragmentToolbar.title = "Stronger2gether"
        binding.homeFragmentToolbar.inflateMenu(R.menu.menu_home_toolbar)

        completedCampaignsAdapter = CompletedCampaignsAdapter(ArrayList())
        binding.completedCampaignRecycler.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
        binding.completedCampaignRecycler.adapter = completedCampaignsAdapter
        observeCampaignLiveData()
    }

    private fun observeCampaignLiveData(){
        campaignViewModel.campaignList.observe(viewLifecycleOwner){
            completedCampaignsAdapter.changeCampaignListValues(it)
        }
    }

}