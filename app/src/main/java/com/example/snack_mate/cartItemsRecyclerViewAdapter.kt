package com.example.snack_mate

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class CartItemsRecyclerViewAdapter(val context: Context?, private val list: List<Addons>) :
    RecyclerView.Adapter<CartItemsRecyclerViewAdapter.addonViewHolder>() {

            inner class addonViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
                private  val img:ImageView = itemView.findViewById(R.id.addonimage)

                fun bind(dataItem: Addons) {

                    img.setImageResource(dataItem.addOnImg)

                }

            }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): addonViewHolder {
        return addonViewHolder(LayoutInflater.from(context).inflate(R.layout.addon,parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: addonViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

}



class Addons(val addOnImg:Int){}