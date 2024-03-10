package com.example.snack_mate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.snack_mate.R

class profile : Fragment() {

private lateinit var profilecartRecycleView  :RecyclerView
private lateinit var profilecartRecyclerViewAdapter: profilecartRecyclerViewAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view2 = inflater.inflate(R.layout.fragment_profile, container, false)
        val cartItemsList = ArrayList<cartItems>()
        cartItemsList.add(cartItems(R.drawable.can,"Coca Cola","20","1"))
        cartItemsList.add(cartItems(R.drawable.burger_,"Cheese Burger","20","1"))
        cartItemsList.add(cartItems(R.drawable.frech_fries,"French Fries","20","1"))
        profilecartRecycleView = view2.findViewById(R.id.profilecartRecyclerView)
        profilecartRecycleView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        profilecartRecyclerViewAdapter = profilecartRecyclerViewAdapter(requireContext(),cartItemsList)
        profilecartRecycleView.adapter = profilecartRecyclerViewAdapter
        return view2

    }


}