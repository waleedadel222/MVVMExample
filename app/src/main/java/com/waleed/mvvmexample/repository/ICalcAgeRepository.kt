package com.waleed.mvvmexample.repository

import androidx.lifecycle.MutableLiveData
import com.waleed.mvvmexample.model.Person

interface ICalcAgeRepository {

    fun calcAge(year: String): MutableLiveData<Person>
}