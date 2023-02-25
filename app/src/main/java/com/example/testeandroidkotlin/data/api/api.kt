package com.example.testeandroidkotlin.data.api

import android.graphics.ColorSpace.Model
import retrofit2.Response
import retrofit2.http.GET

interface api {

    @GET("endpoint")
    suspend fun getEndpoint() : Response<Model>

}