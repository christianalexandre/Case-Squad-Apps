package com.example.case_squad_apps.http

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONObject

class HttpGet {
    fun getPaises() : Int{
        CoroutineScope(Dispatchers.IO).launch {

            val URL = "https://jsonplaceholder.typicode.com/users"
            val client = OkHttpClient()
            val request = Request.Builder().url(URL).build()
            val response = client.newCall(request).execute()
            val responseBody = response.body;
            if (responseBody != null) {
                val json = responseBody.string()
                println("RESPOSTA =============" + json)
            }
        }
        return 1
    }
}