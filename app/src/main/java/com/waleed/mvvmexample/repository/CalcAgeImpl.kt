package com.waleed.mvvmexample.repository

import androidx.lifecycle.MutableLiveData
import com.waleed.mvvmexample.model.Person
import java.util.Calendar

class CalcAgeImpl : ICalcAgeRepository {

    // ده ال object اللى هاستخدمه عشان ابعت الداتا لل viewModel
    private val ageMutableLiveData = MutableLiveData<Person>()

    override fun calcAge(year: String): MutableLiveData<Person> {

        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val age = currentYear - (year.toInt())
        val person = Person(age)
        ageMutableLiveData.postValue(person)
        return ageMutableLiveData

    }

}