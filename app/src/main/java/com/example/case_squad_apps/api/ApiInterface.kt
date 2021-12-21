package com.example.case_squad_apps.api

import com.example.case_squad_apps.model.indicadores.IndicadoresItem
import com.example.case_squad_apps.model.pais.PaisItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET(" ")
    fun getData(): Call<List<PaisItem>>

    @GET("indicadores")
    fun getDataD(): Call<List<IndicadoresItem>>
}