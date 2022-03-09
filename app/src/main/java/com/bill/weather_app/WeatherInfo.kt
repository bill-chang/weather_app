package com.bill.weather_app

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

data class WeatherInfo(
    @SerializedName("records")
    val records: Records = Records(),
    @SerializedName("result")
    val result: Result = Result(),
    @SerializedName("success")
    val success: String = ""
) {
    data class Records(
        @SerializedName("datasetDescription")
        val datasetDescription: String = "",
        @SerializedName("location")
        val location: List<Location> = listOf()
    ) {
        data class Location(
            @SerializedName("locationName")
            val locationName: String = "",
            @SerializedName("weatherElement")
            val weatherElement: List<WeatherElement> = listOf()
        ) {
            data class WeatherElement(
                @SerializedName("elementName")
                val elementName: String = "",
                @SerializedName("time")
                val time: List<Time> = listOf()
            ) {
                data class Time(
                    @SerializedName("endTime")
                    val endTime: String = "" ,
                    @SerializedName("parameter")
                    val parameter: Parameter = Parameter(),
                    @SerializedName("startTime")
                    val startTime: String =""
                ) {
                    data class Parameter(
                        @SerializedName("parameterName")
                        val parameterName: String = "",
                        @SerializedName("parameterUnit")
                        val parameterUnit: String = "",
                        @SerializedName("parameterValue")
                        val parameterValue: String = ""
                    )
                }
            }
        }
    }

    data class Result(
        @SerializedName("fields")
        val fields: List<Field> = listOf(),
        @SerializedName("resource_id")
        val resource_id: String = ""
    ){
        data class Field(
            @SerializedName("id")
            val id: String,
            @SerializedName("type")
            val type: String
        )
    }
}