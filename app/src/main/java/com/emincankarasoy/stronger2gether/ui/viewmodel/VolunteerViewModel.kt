package com.emincankarasoy.stronger2gether.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.emincankarasoy.stronger2gether.data.model.Volunteer
import com.emincankarasoy.stronger2gether.data.repository.VolunteerRepository

class VolunteerViewModel : ViewModel() {
    private val volunteerRepository = VolunteerRepository()

    private val _volunteerList = MutableLiveData<ArrayList<Volunteer>>()

    val volunteerList: LiveData<ArrayList<Volunteer>>
        get() = _volunteerList

    init {
        val arrayList = volunteerRepository.getTopSixVolunteer()
        _volunteerList.postValue(arrayList)
    }

}