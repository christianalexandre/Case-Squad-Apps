package com.example.case_squad_apps.fragments.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.case_squad_apps.R
import com.example.case_squad_apps.model.MyDataItem
import com.example.case_squad_apps.model.pais.PaisItem
import kotlinx.android.synthetic.main.pais_item.view.*
import org.w3c.dom.Text

class PaisesAdapter(
    private val context: Context,
    private val paisList: List<PaisItem>
) : RecyclerView.Adapter<PaisesAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var nomePais: TextView
        var regiao: TextView
        var idioma: TextView
        var moeda: TextView

        init {
            nomePais = itemView.nomePais
            regiao = itemView.nomeContinente
            idioma = itemView.idioma
            moeda = itemView.moeda
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.pais_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nomePais.text = paisList[position].nome.abreviado + " (${paisList[position].id.ISO_3166_1_ALPHA_2})"
        holder.regiao.text = paisList[position].localizacao.regiao.nome
        holder.idioma.text = paisList[position].linguas[0].nome
        holder.moeda.text = paisList[position].unidades_monetarias[0].nome
    }

    override fun getItemCount(): Int {
        return paisList.size
    }

}
