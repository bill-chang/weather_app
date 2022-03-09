package com.bill.weather_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun init(){
        ServiceGenerator
            .retrofitService
            .getWeather(key = "CWB-0CA9A7F3-BF9E-4784-AA98-0A814FDA9D39", city = "臺北市")
            .enqueue(object : retrofit2.Callback<WeatherInfo> {
                override fun onFailure(call: Call<WeatherInfo>, t: Throwable) {
                    Log.e("Get data fail", t.message.toString())

                }

                override fun onResponse(call: Call<WeatherInfo>, response: Response<WeatherInfo>) {
                    Log.d("success", response.toString())

                    if(response.isSuccessful){
                        response.body()?.records?.location?.forEach{
                            Log.d("get data successful", it.toString())
                        }
                    }
                }
            })
    }
}