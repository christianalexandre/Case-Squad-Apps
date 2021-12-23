package com.example.case_squad_apps.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.case_squad_apps.R
import com.example.case_squad_apps.api.ApiInterface
import com.example.case_squad_apps.fragments.adapter.ListAdapter
import com.example.case_squad_apps.model.pais.PaisItem
import kotlinx.android.synthetic.main.fragment_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/*
    Classe responsável por fazer a requisição no endpoint e manipular o objeto, para depois chamar
    o adapter e imprimir em lista os paises.
    Caso o usuário não insira nada no EditText a requisição é feita no endpoint paises, porém
    se o usuário desejar é possível fazer a requisição e retornar apenas o pais desejado.
 */
class ListFragment : Fragment() {

    lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var listAdapter: ListAdapter

     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recView.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(activity)
        recView.layoutManager = linearLayoutManager

        // botão flutuante responsável pela requisição
        fab.setOnClickListener {
            // checa se o usuário utilizou o EditText
            if(CodigoPais.text.toString().trim().equals("")){
                var BASE_URL = "https://servicodados.ibge.gov.br/api/v1/paises/"
                getData(BASE_URL)
            } else {
                var BASE_URL = "https://servicodados.ibge.gov.br/api/v1/paises/"
                BASE_URL = BASE_URL+CodigoPais.text.toString()+"/"
                getData(BASE_URL)
            }
        }
    }

    // Realiza a requisição e chamar o adapter para impressão em tela
    // Essa função deveria estar externa a esse arquivo
    private fun getData(BASE_URL: String) {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ApiInterface::class.java)

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<List<PaisItem>?> {
            override fun onResponse(
                call: Call<List<PaisItem>?>,
                response: Response<List<PaisItem>?>
            ) {
                if (response.body() == null){
                    Toast.makeText(requireActivity(), "Essa sigla parece não existir.", Toast.LENGTH_LONG)
                        .show()
                } else {
                    val responseBody = response.body()!!
                    val PaisesAdapter = ListAdapter(requireActivity(), responseBody)
                    PaisesAdapter.notifyDataSetChanged()
                    recView.adapter = PaisesAdapter
                }
            }

            override fun onFailure(call: Call<List<PaisItem>?>, t: Throwable) {
                Log.d("MainActivity", "onFail: "+t.message)
                Toast.makeText(requireActivity(), "Ops, algo deu errado.", Toast.LENGTH_LONG)
                    .show()
            }
        })
    }

}