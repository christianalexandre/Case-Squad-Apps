package com.example.case_squad_apps.fragments.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.case_squad_apps.R
import com.example.case_squad_apps.activity.DetailActivity
import com.example.case_squad_apps.model.pais.PaisItem
import kotlinx.android.synthetic.main.list_item.view.*
import android.annotation.SuppressLint
import android.util.Log
import android.view.Gravity
import android.widget.Toast
import androidx.recyclerview.widget.ItemTouchHelper
import com.example.case_squad_apps.model.paisDAO.PaisDAO

class FavouritesAdapter(
    private val context: Context,
    private val paisList: List<PaisItem>
) : RecyclerView.Adapter<FavouritesAdapter.ViewHolder>() {

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
        val view = inflater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, @SuppressLint("RecyclerView") position: Int) {
        holder.nomePais.text = paisList[position].nome.abreviado + "(${paisList[position].id.ISO_3166_1_ALPHA_2})"
        holder.regiao.text = paisList[position].localizacao.regiao.nome
        holder.idioma.text = paisList[position].linguas[0].nome
        holder.moeda.text = paisList[position].unidades_monetarias[0].nome
        holder.itemView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Intent(v!!.context, DetailActivity::class.java)
                i.putExtra("pais", paisList[position].nome.abreviado)
                i.putExtra("sigla", paisList[position].id.ISO_3166_1_ALPHA_2)
                i.putExtra("idioma", paisList[position].linguas[0].nome)
                i.putExtra("moeda", paisList[position].unidades_monetarias[0].nome)
                i.putExtra("capital", paisList[position].governo.capital.nome)
                i.putExtra("area", paisList[position].area.total + " ${paisList[position].area.unidade.símbolo}")
                i.putExtra("historico", paisList[position].historico)
                v.context.startActivity(i)
            }
        })
        holder.itemView.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(v: View?): Boolean {
                val dao = PaisDAO()
                dao.adiciona(paisList[position])
                Toast.makeText(context, "Adicionado aos favoritos", Toast.LENGTH_LONG)
                    .show()
                return false
            }
        })
    }

    override fun getItemCount(): Int {
        return paisList.size
    }

}


