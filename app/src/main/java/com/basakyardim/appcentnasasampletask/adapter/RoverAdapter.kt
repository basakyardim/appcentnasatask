package com.basakyardim.appcentnasasampletask.adapter

import android.app.Dialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
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

            val dialog = Dialog(holder.view.context)
            dialog.setContentView(R.layout.custom_popup)

            val popupImage : ImageView = dialog.findViewById(R.id.popupImage)
            val popupDate : TextView = dialog.findViewById(R.id.popupDate)
            val popupRoverName : TextView = dialog.findViewById(R.id.popupRoverName)
            val popupCamera : TextView = dialog.findViewById(R.id.popupCamera)
            val popupState : TextView = dialog.findViewById(R.id.popupState)
            val popupLaunch : TextView = dialog.findViewById(R.id.popupLaunch)
            val popupLand : TextView = dialog.findViewById(R.id.popupLand)
            val popupCancelButton : ImageButton = dialog.findViewById(R.id.popupCancelButton)

            popupImage.downloadFromUrl(roverItem.img_src, placeholderProgressBar(holder.view.context))
            popupDate.text = holder.view.context.getString(R.string.date).plus(roverItem.earth_date)
            popupRoverName.text = holder.view.context.getString(R.string.rover_name).plus(roverItem.rover.name)
            popupCamera.text = holder.view.context.getString(R.string.camera).plus(roverItem.camera.full_name)
            popupState.text = holder.view.context.getString(R.string.state).plus(roverItem.rover.status)
            popupLaunch.text = holder.view.context.getString(R.string.launch).plus(roverItem.rover.launch_date)
            popupLand.text = holder.view.context.getString(R.string.land).plus(roverItem.rover.landing_date)

            popupCancelButton.setOnClickListener {
                dialog.dismiss()
            }
            dialog.show()

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