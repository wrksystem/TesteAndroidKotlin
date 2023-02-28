package com.example.testeandroidkotlin.database.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testeandroidkotlin.data.model.EstateData
import com.example.testeandroidkotlin.database.AppDatabase
import com.example.testeandroidkotlin.database.repository.EstateDataRepository
import kotlinx.coroutines.launch

class EstateDataViewModel(private val repository: EstateDataRepository) : ViewModel() {

    //private var repository: EstateDataRepository

    private val _data = MutableLiveData<List<EstateData>>()

    val dataResponse: MutableLiveData<List<EstateData>>
    get() = _data

    /*init {
        val estateDao = AppDatabase.getAppDatabase(application).EstateDao()
        repository = EstateDataRepository(estateDao)
    }*/
    fun getPopulation(){

        viewModelScope.launch {
            val result = repository.getEstateData()

            _data.value = result
        }

    }


}