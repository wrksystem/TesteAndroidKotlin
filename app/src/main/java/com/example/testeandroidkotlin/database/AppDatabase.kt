package com.example.testeandroidkotlin.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.testeandroidkotlin.database.dao.EstateDataDao
import com.example.testeandroidkotlin.database.model.EstateDataModelDb
import com.example.testeandroidkotlin.utils.Constants.Companion.DATABASE_NAME

@Database(entities = arrayOf(EstateDataModelDb::class), version = 1, exportSchema = false)

abstract class AppDatabase : RoomDatabase() {

 abstract fun EstateDao() : EstateDataDao
 companion object {

  @Volatile
  private var INSTANCE: AppDatabase? = null

  fun getAppDatabase(context: Context): AppDatabase {

   if (INSTANCE != null) return INSTANCE!!

   synchronized(this){
    INSTANCE = Room
     .databaseBuilder(context, AppDatabase::class.java,DATABASE_NAME)
     .fallbackToDestructiveMigration()
     .build()

    return INSTANCE!!
   }
  }
 }
}