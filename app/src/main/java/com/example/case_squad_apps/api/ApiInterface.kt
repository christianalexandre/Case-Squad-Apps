package com.example.case_squad_apps.api

import com.example.case_squad_apps.model.pais.PaisItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("api/v1/paises/")
    fun getData(): Call<List<PaisItem>>
}