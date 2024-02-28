package com.example.snack_mate

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.snack_mate.R
import de.hdodenhof.circleimageview.CircleImageView

class bottomRecyclerViewAdapter(val context:Context,val list : List<bottom_Driver>) : RecyclerView.Adapter<bottomRecyclerViewAdapter.bottoom_View_holder>(){
    inner class bottoom_View_holder(itemView:View) : RecyclerView.ViewHolder(itemView){
        private  val img:ImageView = itemView.findViewById(R.id.imageView3)
        private  val name:TextView = itemView.findViewById(R.id.textView3)
        private val price:TextView = itemView.findViewById(R.id.textView5)
        private val add:CircleImageView = itemView.findViewById(R.id.add)

        fun bind(dataItem: bottom_Driver) {
            img.setImageResource(dataItem.food_img)
            name.text = dataItem.food_name
            price.text = dataItem.food_price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): bottoom_View_holder {
         return bottoom_View_holder(LayoutInflater.from(context).inflate(R.layout.bot_items,parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: bottoom_View_holder, position: Int) {
        val item  = list[position]

        holder.bind(item)
    }

}



class bottom_Driver(val food_img:Int,val food_name:String,val food_price:String){}