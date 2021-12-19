package com.example.case_squad_apps.retrofit

import retrofit2.http.GET

interface ApiService {

    @GET("users/")
    fun getData() = 1

}
