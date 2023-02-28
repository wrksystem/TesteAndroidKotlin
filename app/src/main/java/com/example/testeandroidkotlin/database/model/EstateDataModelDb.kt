package com.example.testeandroidkotlin.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testeandroidkotlin.utils.Constants.Companion.ESTATE_DATA

@Entity(tableName = ESTATE_DATA)
data class EstateDataModelDb(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long,

    @ColumnInfo(name = "id_state")
    val idState: String,

    @ColumnInfo(name = "state")
    val state: String,

    @ColumnInfo(name = "population")
    val population: Long,

    @ColumnInfo(name = "year")
    val year: Int,

    @ColumnInfo(name = "slug")
    val slug: String,
    )


