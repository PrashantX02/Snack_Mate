package com.example.snack_mate

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class cart : Fragment() {
private lateinit var addonRecyclerView :RecyclerView
private lateinit var addonRecyclerViewAdapter: CartItemsRecyclerViewAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cart, container, false)
        val addonList = ArrayList<Addons>()

        addonList.add(Addons(R.drawable.can))
        addonList.add(Addons(R.drawable.frech_fries))
        addonRecyclerView= view.findViewById(R.id.addonrecyclerView)
        addonRecyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        addonRecyclerViewAdapter = CartItemsRecyclerViewAdapter(requireContext(),addonList)

        addonRecyclerView.adapter = addonRecyclerViewAdapter
        return view


    }


}