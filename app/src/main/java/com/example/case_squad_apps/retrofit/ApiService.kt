package com.example.case_squad_apps.retrofit

import com.example.case_squad_apps.model.MyDataItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    fun getData(): Call<List<MyDataItem>>

}
