package com.example.case_squad_apps.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.case_squad_apps.R
import com.example.case_squad_apps.fragments.FavouritesFragment
import com.example.case_squad_apps.fragments.ListFragment
import com.example.case_squad_apps.activity.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

/*
    A MainActivity é composta por dois fragmentos.
    ListFragment: responsável por listar os paises.
    FavouritesFragment: responsável por listar os paises favoritados.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpTabs()

    }

    /*
        Função responsável por chamar o ViewPagerAdapter que fará a transição entre os fragmentos.
     */
    private fun setUpTabs() {

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(ListFragment(), "Paises")
        adapter.addFragment(FavouritesFragment(), "Favoritos")
        view_pager.adapter = adapter
        tabs.setupWithViewPager(view_pager)

    }
}