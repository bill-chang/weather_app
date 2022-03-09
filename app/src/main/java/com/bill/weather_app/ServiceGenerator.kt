package com.bill.weather_app

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceGenerator {
    private const val  BASE_URL = "https://opendata.cwb.gov.tw/api/"
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()
    val retrofitService : WeatherApi = retrofit.create(WeatherApi::class.java)
}