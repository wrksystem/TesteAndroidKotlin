package com.example.testeandroidkotlin.database.repository

import com.example.testeandroidkotlin.data.api.RetrofitInstance
import com.example.testeandroidkotlin.data.model.EstateData
import com.example.testeandroidkotlin.data.model.PopulationDataResponse
import com.example.testeandroidkotlin.database.dao.EstateDataDao
import retrofit2.Response

class EstateDataRepository(private val estateDataDao: EstateDataDao) {

    private val api = RetrofitInstance.api

    suspend fun getEstateData(): List<EstateData>?{
        val response = api.getCityInformation("drilldowns", "measures", "year")
        if (response.isSuccessful) {
            return response.body()?.data
        }
        return null
    }

}