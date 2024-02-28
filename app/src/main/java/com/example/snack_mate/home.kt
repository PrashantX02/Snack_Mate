package com.example.snack_mate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.snack_mate.R
import java.util.ArrayList


class home : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var bottom_rec: RecyclerView
    private lateinit var bottom_adapter: bottomRecyclerViewAdapter
    private lateinit var adapter: Item_to_RecyclerView_adapter



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       val view =  inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = view.findViewById(R.id.top_recyclerView)

        bottom_rec = view.findViewById(R.id.bottom_recyclerView)

        bottom_rec.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

        recyclerView.layoutManager  = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

        val list = ArrayList<driver>()
        val list_bottom = ArrayList<bottom_Driver>()


        list.add(driver(R.drawable.burger_,"Burger"))
        list.add(driver(R.drawable.pizza,"Pizza"))
        list.add(driver(R.drawable.sundae,"Dessert"))
        list.add(driver(R.drawable.chiken,"Non-Veg"))
        list.add(driver(R.drawable.chiken,"All"))
        list.add(driver(R.drawable.chiken,"All"))

        list_bottom.add(bottom_Driver(R.drawable.burger_,"Cheese burger","23$"))
        list_bottom.add(bottom_Driver(R.drawable.sundae,"Sundae","21$"))
        list_bottom.add(bottom_Driver(R.drawable.frech_fries,"fries","19$"))
        list_bottom.add(bottom_Driver(R.drawable.pizza,"Cheese Pizza","13$"))
        list_bottom.add(bottom_Driver(R.drawable.chiken,"leg piece","19$"))

        adapter = Item_to_RecyclerView_adapter(requireContext(),list)

        bottom_adapter = bottomRecyclerViewAdapter(requireContext(),list_bottom)

        bottom_rec.adapter  = bottom_adapter
        recyclerView.adapter = adapter


        return view
    }


}