package com.example.case_squad_apps.fragments.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.case_squad_apps.R
import com.example.case_squad_apps.model.MyDataItem
import com.example.case_squad_apps.model.Paises
import kotlinx.android.synthetic.main.pais_item.view.*

class PostsAdapter(
    private val context: Context,
    private val userList: List<MyDataItem>
) : RecyclerView.Adapter<PostsAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var userId: TextView
        var title: TextView

        init {
            userId = itemView.nomePais
            title = itemView.nomeContinente
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.pais_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.userId.text = userList[position].userId.toString()
        holder.title.text = userList[position].title
    }

    override fun getItemCount(): Int {
        return userList.size
    }

}
