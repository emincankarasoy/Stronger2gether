package com.emincankarasoy.stronger2gether.data.source

import com.emincankarasoy.stronger2gether.data.model.Volunteer

class VolunteerDummyDataSource : VolunteerDataSource{

    private val volunteerList = ArrayList<Volunteer>().apply {
        add(Volunteer("Charles","Tremblay","https://imgyukle.com/f/2022/02/26/E5Av6b.jpg",80))
        add(Volunteer("Thomas","Brown","https://imgyukle.com/f/2022/02/26/E5AsO1.jpg",60))
        add(Volunteer("Mary","Miller","https://imgyukle.com/f/2022/02/26/E5A9V6.jpg",70))
        add(Volunteer("Richard","Li","https://imgyukle.com/f/2022/02/26/E5AZC0.jpg",90))
        add(Volunteer("Barbara","Rodriguez","https://imgyukle.com/f/2022/02/26/E5AmvS.jpg",80))
        add(Volunteer("Emilia","Clarke","https://imgyukle.com/f/2022/02/26/E5Afjp.jpg",90))
    }

    override fun getTopSixVolunteer():ArrayList<Volunteer>{
        return volunteerList
    }

}