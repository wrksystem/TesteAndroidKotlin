package com.example.testeandroidkotlin.data.api

import okhttp3.logging.HttpLoggingInterceptor

class RetrofitInstance {

    companion object {

        private val retrofit by lazy {
            val logging = HttpLoggingInterceptor()
            logging.setLevel(HttpLoggingInterceptor.Level)
        }
    }
}