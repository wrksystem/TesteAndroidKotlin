package com.example.testeandroidkotlin.data.api

import android.graphics.ColorSpace.Model
import com.example.testeandroidkotlin.data.model.EstateData
import com.example.testeandroidkotlin.data.model.PopulationDataResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("data")
    suspend fun getCityInformation(@Query("drilldowns")drilldowns : String,
                                   @Query("measures") measures : String,
                                   @Query("year") year : String) : Response<PopulationDataResponse>

}