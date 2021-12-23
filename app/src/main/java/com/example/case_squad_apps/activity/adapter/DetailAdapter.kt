package com.example.case_squad_apps.activity.adapter

import kotlinx.android.synthetic.main.detail_item.view.*
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.case_squad_apps.R
import com.example.case_squad_apps.model.paisDetalhes.PaisDetalhes

class DetailAdapter(
    private val context: Context,
    private val indicadorList: List<PaisDetalhes>,

) : RecyclerView.Adapter<DetailAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var indicador: TextView
        var resultado: TextView

        init {
            indicador = itemView.infoDetail
            resultado = itemView.indicadorDetail
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.detail_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.indicador.text = indicadorList[position].chave
        holder.resultado.text = indicadorList[position].valor
    }

    override fun getItemCount(): Int {
        return indicadorList.size
    }

}


