package com.example.snack_mate

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class profilecartRecyclerViewAdapter(val context: Context?, private val list: List<cartItems>) :
    RecyclerView.Adapter<profilecartRecyclerViewAdapter.profilecartViewHolder>() {

        inner class profilecartViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
            private  val img1:ImageView = itemView.findViewById(R.id.cartitemimage)
            private val nm: TextView = itemView.findViewById(R.id.cart_item_name)
            private val cost: TextView = itemView.findViewById(R.id.cart_item_price)
            private val qnt: TextView = itemView.findViewById(R.id.cart_item_quantity)

            fun bind(dataItem: cartItems) {

                img1.setImageResource(dataItem.cartItemImg)
                nm.text = dataItem.item_Name
                cost.text = dataItem.price
                qnt.text = dataItem.quantity

            }

        }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): profilecartViewHolder {
        return profilecartViewHolder(LayoutInflater.from(context).inflate(R.layout.cart_items,parent,false))

    }

    override fun onBindViewHolder(
        holder: profilecartViewHolder,
        position: Int
    ) {
        val cartitem = list[position]
        holder.bind(cartitem)

    }

    override fun getItemCount(): Int {
       return list.size
    }
}


class cartItems(val cartItemImg:Int,val item_Name:String, val price:String , val quantity:String){}