package com.example.testeandroidkotlin.data.model

import com.google.gson.annotations.SerializedName


data class PopulationDataResponse(

    val data: List<EstateData>
)

data class EstateData(

    @SerializedName("ID")
    val id : String,

    @SerializedName("ID State")
    val state : String,

    @SerializedName("Population")
    val population : Long,

    @SerializedName("ID Year")
    val year : String,

    @SerializedName("Slug State")
    val slug : String
)