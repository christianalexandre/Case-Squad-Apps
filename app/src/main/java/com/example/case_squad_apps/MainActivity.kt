package com.example.case_squad_apps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.case_squad_apps.fragments.FavouritesFragment
import com.example.case_squad_apps.fragments.ListFragment
import com.example.case_squad_apps.fragments.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(ListFragment(), "Paises")
        adapter.addFragment(FavouritesFragment(), "Favoritos")
        view_pager.adapter = adapter
        tabs.setupWithViewPager(view_pager)
    }
}