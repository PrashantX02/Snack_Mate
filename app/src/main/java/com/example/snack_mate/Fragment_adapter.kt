package com.example.snack_mate

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class Fragment_adapter(fm : FragmentManager,behavior:Int) : FragmentPagerAdapter(fm , behavior) {

    private  val Fragment_Arraylist = ArrayList<Fragment>()
    override fun getCount(): Int {
        return Fragment_Arraylist.size
    }

    override fun getItem(position: Int): Fragment {
        return Fragment_Arraylist[position]
    }

    fun addFragment(fragment: Fragment) {
        Fragment_Arraylist.add(fragment)
    }
}