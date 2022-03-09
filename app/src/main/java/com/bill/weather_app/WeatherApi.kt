package com.bill.weather_app

import retrofit2.http.GET
import retrofit2.Call
import retrofit2.http.Query

interface WeatherApi {

    @GET("v1/rest/datastore/F-C0032-001")
    fun getWeather(
        @Query("Authorization") key : String,
        @Query("locationName") city : String? = null
    ): Call<WeatherInfo>
}