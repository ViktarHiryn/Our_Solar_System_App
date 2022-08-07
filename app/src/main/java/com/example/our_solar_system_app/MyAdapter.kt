package com.example.our_solar_system_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (private val PlanetList : ArrayList<Planets>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_planet, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = PlanetList[position]
        holder.ivPlanetImage.setImageResource(currentItem.PlanetImage)
        holder.tvPlanetName.text = currentItem.PlanetName
        holder.tvPlanetDescription.text = currentItem.PlanetDescription
        holder.tvDistance.text = currentItem.Distance
    }

    override fun getItemCount(): Int {
        return PlanetList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val ivPlanetImage : ImageView = itemView.findViewById(R.id.ivPlanetPicture)
        val tvPlanetName : TextView = itemView.findViewById(R.id.tvPlanetName)
        val tvPlanetDescription : TextView = itemView.findViewById(R.id.tvPlanetDescription)
        val tvDistance : TextView = itemView.findViewById(R.id.tvDistance)
    }
}