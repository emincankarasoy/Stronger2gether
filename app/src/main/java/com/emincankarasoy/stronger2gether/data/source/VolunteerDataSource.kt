package com.emincankarasoy.stronger2gether.data.source

import com.emincankarasoy.stronger2gether.data.model.Volunteer

interface VolunteerDataSource {
    fun getTopSixVolunteer() : ArrayList<Volunteer>
}