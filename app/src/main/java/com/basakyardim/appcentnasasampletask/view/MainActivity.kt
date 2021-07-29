package com.basakyardim.appcentnasasampletask.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.basakyardim.appcentnasasampletask.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private val fragmentList = ArrayList<Fragment>()
    private val fragmentTitleList = ArrayList<String>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        fragmentList.add(CuriosityFragment())
        fragmentList.add(OpportunityFragment())
        fragmentList.add(SpiritFragment())

        val adapter = ViewPagerAdapter(this)
        binding.viewPager.adapter = adapter

        fragmentTitleList.add("Curiosity")
        fragmentTitleList.add("Opportunity")
        fragmentTitleList.add("Spirit")

        TabLayoutMediator(binding.tabLayout,binding.viewPager){tab,position ->
            tab.text = fragmentTitleList[position]

        }.attach()

    }

    inner class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity){
        override fun getItemCount(): Int {
            return fragmentList.size

        }

        override fun createFragment(position: Int): Fragment {
            return fragmentList[position]
        }

    }
}