package com.emincankarasoy.stronger2gether.data.repository

import com.emincankarasoy.stronger2gether.data.source.VolunteerDummyDataSource


class VolunteerRepository {
    private val volunteerDataSource = VolunteerDummyDataSource()

    fun getTopSixVolunteer() = volunteerDataSource.getTopSixVolunteer()
}