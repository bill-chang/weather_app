package com.bill.weather_app

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson

class MyAdapter(private val weatherElement: MutableList<WeatherInfo.Records.Location.WeatherElement>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount()=weatherElement.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        return holder.setData(weatherElement[position])
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView_startTime: TextView = itemView.findViewById(R.id.MyTextView)
        private val textView_endTime: TextView = itemView.findViewById(R.id.MyTextView1)
        private val textView_temp: TextView = itemView.findViewById(R.id.MyTextView2)

        fun setData(weatherElement: WeatherInfo.Records.Location.WeatherElement) {
            for(i in weatherElement.elementName){
                Log.d("get data", i.toString())
            }
//            textView_startTime.text = weatherElement.elementName.toString()
//            textView_endTime.text = time.endTime.toString()
//            textView_temp.text = time.parameter.
//            textView.text = WeatherInfo.Records.Location.WeatherElement(data)
        }
    }
}