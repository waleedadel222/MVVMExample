package com.waleed.mvvmexample.viewModel

import com.waleed.mvvmexample.model.Person
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.waleed.mvvmexample.repository.CalcAgeImpl

class CalViewModel : ViewModel() {

    private val calcRepo = CalcAgeImpl()

    fun calcAge(year: String): LiveData<Person> {

        return (calcRepo.calcAge(year))
    }

}