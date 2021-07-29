package com.basakyardim.appcentnasasampletask.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.basakyardim.appcentnasasampletask.R
import com.basakyardim.appcentnasasampletask.model.Photo
import com.basakyardim.appcentnasasampletask.util.downloadFromUrl
import com.basakyardim.appcentnasasampletask.util.placeholderProgressBar

class RoverAdapter(private val roverList:ArrayList<Photo>) : RecyclerView.Adapter<RoverAdapter.RoverItemViewHolder>(){

    class RoverItemViewHolder(var view:View):RecyclerView.ViewHolder(view){
        var roverCardView : CardView = view.findViewById(R.id.roverCardView)
        var roverImage : ImageView = view.findViewById(R.id.roverImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoverItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rover_item_design,parent,false)
        return RoverItemViewHolder(view)

    }

    override fun onBindViewHolder(holder: RoverItemViewHolder, position: Int) {
        val roverItem = roverList[position]
        holder.roverImage.downloadFromUrl(roverItem.img_src, placeholderProgressBar(holder.view.context))
        holder.roverCardView.setOnClickListener {

        }
    }

    override fun getItemCount(): Int {
        return roverList.size
    }

    fun updateList(newRoverList:List<Photo>){
        roverList.clear()
        roverList.addAll(newRoverList)
        notifyDataSetChanged()
    }


}