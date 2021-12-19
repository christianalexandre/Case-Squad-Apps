package com.example.case_squad_apps.fragments.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.case_squad_apps.R
import com.example.case_squad_apps.model.Paises

class ListaPaisesAdapter(
    private val context: Context,
    private val paises: List<Paises>
) : RecyclerView.Adapter<ListaPaisesAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(pais: Paises) {
            val nomePais = itemView.findViewById<TextView>(R.id.nomePais)
            nomePais.text = pais.nome
            val nomeContinente = itemView.findViewById<TextView>(R.id.nomeContinente)
            nomeContinente.text = pais.continente
            val idioma = itemView.findViewById<TextView>(R.id.idioma)
            idioma.text = pais.idioma
            val moeda = itemView.findViewById<TextView>(R.id.moeda)
            moeda.text = pais.moeda
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.pais_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pais = paises[position]
        holder.vincula(pais)
    }

    override fun getItemCount(): Int {
        return paises.size
    }

}
