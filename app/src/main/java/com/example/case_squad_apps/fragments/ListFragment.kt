package com.example.case_squad_apps.fragments

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.case_squad_apps.R
import com.example.case_squad_apps.api.ApiInterface
import com.example.case_squad_apps.fragments.adapter.ListaPaisesAdapter
import com.example.case_squad_apps.fragments.adapter.PostsAdapter
import com.example.case_squad_apps.http.HttpGet
import com.example.case_squad_apps.model.MyDataItem
import com.example.case_squad_apps.model.Paises
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.StringBuilder

const val BASE_URL = "https://jsonplaceholder.typicode.com/"

class ListFragment : Fragment() {

    lateinit var postsAdapter: PostsAdapter
    lateinit var linearLayoutManager: LinearLayoutManager

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


        fab.setOnClickListener {
            getMyData()
            Snackbar.make(view, "Ok", 400)
                .show()
        }
    }

    private fun getMyData() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ApiInterface::class.java)

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<List<MyDataItem>?> {
            override fun onResponse(
                call: Call<List<MyDataItem>?>,
                response: Response<List<MyDataItem>?>
            ) {
                val responseBody = response.body()!!

                val PostsAdapter = PostsAdapter(requireActivity(), responseBody)

                PostsAdapter.notifyDataSetChanged()

                recView.adapter = PostsAdapter

            }

            override fun onFailure(call: Call<List<MyDataItem>?>, t: Throwable) {
                Log.d("MainActivity", "onFail: "+t.message)
            }
        })
    }

}