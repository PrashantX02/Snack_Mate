package com.example.snack_mate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.snack_mate.R
import com.google.android.material.tabs.TabLayout

class MainActivity2 : AppCompatActivity() {

    lateinit var tab : TabLayout
    lateinit var viewPager :ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tab = findViewById(R.id.tablayout)
        viewPager = findViewById(R.id.viewPager)

        tab.setupWithViewPager(viewPager)



        val fragment_Adapter = Fragment_adapter(supportFragmentManager,FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)

        fragment_Adapter.addFragment(home())
        fragment_Adapter.addFragment(cart())
        fragment_Adapter.addFragment(profile())


        viewPager.adapter = fragment_Adapter

        tab.getTabAt(0)?.setIcon(R.drawable.baseline_home_24)
        tab.getTabAt(1)?.setIcon(R.drawable.baseline_shopping_cart_24)
        tab.getTabAt(2)?.setIcon(R.drawable.baseline_manage_accounts_24)

    }
}