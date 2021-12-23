package com.example.case_squad_apps.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.case_squad_apps.R
import com.example.case_squad_apps.fragments.adapter.FavouritesAdapter
import com.example.case_squad_apps.model.paisDAO.PaisDAO
import kotlinx.android.synthetic.main.fragment_favourites.*

/*
    Classe responsável por recuperar os paises em lista no arquivo PaisDAO para impressão na tela.
 */
class FavouritesFragment : Fragment() {

    lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var favouritesAdapter: FavouritesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favourites, container, false)
    }

    override fun onResume() {
        super.onResume()

        recViewFavourite.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(activity)
        recViewFavourite.layoutManager = linearLayoutManager

        val FavouritesAdapter = FavouritesAdapter(requireActivity(), PaisDAO().buscarPaises())
        FavouritesAdapter.notifyDataSetChanged()
        recViewFavourite.adapter = FavouritesAdapter
    }

    
}