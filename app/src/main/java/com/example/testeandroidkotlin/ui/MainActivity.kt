package com.example.testeandroidkotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.testeandroidkotlin.data.api.RetrofitInstance
import com.example.testeandroidkotlin.database.viewmodel.EstateDataViewModel
import com.example.testeandroidkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()

        val estateViewModel = ViewModelProvider(this).get(RetrofitInstance.api.)
        estateViewModel.dataResponse.observe(this, Observer { data ->
            for (item in data){
                Log.i("TAG", "${item.state}: ")
            }

        })


    }
}