package com.example.snack_mate

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ComplexColorCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.snack_mate.R

class Item_to_RecyclerView_adapter(val context: Context,val list : ArrayList<driver>) :
    RecyclerView.Adapter<Item_to_RecyclerView_adapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val food: ImageView = itemView.findViewById(R.id.food_item)
        private val title: TextView = itemView.findViewById(R.id.food_title)
        private val card : CardView = itemView.findViewById(R.id.cardView)

        fun bind(dataItem: driver) {
            food.setImageResource(dataItem.food)
            title.text = dataItem.text
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return  ViewHolder(LayoutInflater.from(context).inflate(R.layout.top_items,parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val items = list[position]

        holder.bind(items)


    }
}

class driver(val food:Int,val text:String)

