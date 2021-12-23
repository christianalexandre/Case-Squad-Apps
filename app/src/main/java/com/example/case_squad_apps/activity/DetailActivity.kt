package com.example.case_squad_apps.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.case_squad_apps.R
import com.example.case_squad_apps.activity.adapter.DetailAdapter
import com.example.case_squad_apps.model.paisDetalhes.PaisDetalhes
import kotlinx.android.synthetic.main.activity_detail.*

/*
    Essa classe é chamada a partir da Main quando o usuário clica em cima de um dos paises da lista.
    A main por sua vez envia junto com a Intent os parâmetros do pais para que essa Activity chame
    o adapter com esses valores.
 */
class DetailActivity : AppCompatActivity() {

    lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var detailAdapter: DetailAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val nomePaisD = intent.getStringExtra("pais")
        nomePaisDetalhes.text = nomePaisD
        val siglaD = intent.getStringExtra("sigla")
        val idiomaD = intent.getStringExtra("idioma")
        val moedaD = intent.getStringExtra("moeda")
        val capitalD = intent.getStringExtra("capital")
        val areaD = intent.getStringExtra("area")
        val historicoD = intent.getStringExtra("historico")

        recViewDetalhes.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(applicationContext)
        recViewDetalhes.layoutManager = linearLayoutManager

        recViewDetalhes.adapter = DetailAdapter(this, indicadorList = listOf(
            PaisDetalhes(chave = "Sigla", valor = siglaD.toString()),
            PaisDetalhes(chave = "Idioma", valor = idiomaD.toString()),
            PaisDetalhes(chave = "Moeda", valor = moedaD.toString()),
            PaisDetalhes(chave = "Capital", valor = capitalD.toString()),
            PaisDetalhes(chave = "Área", valor = areaD.toString()),
            PaisDetalhes(chave = "Histórico", valor = historicoD.toString())
            ))

    }
}