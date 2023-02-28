package com.example.testeandroidkotlin.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.testeandroidkotlin.database.model.EstateDataModelDb

@Dao
interface EstateDataDao {

    /*@Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(estateDataModelDb: EstateDataModelDb)

    @Delete
    suspend fun delete(estateDataModelDb: EstateDataModelDb)

    @Update
    suspend fun  update(estateDataModelDb: EstateDataModelDb)

    @Query("SELECT * FROM estate")
    fun getEstate(): LiveData<EstateDataModelDb>*/

}