package com.nibm.chatapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter(private val names: Array<String>,private val messages: Array<String>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewName: TextView
        val textViewMessage: TextView


        init {

            textViewName = view.findViewById(R.id.textView)
            textViewMessage = view.findViewById(R.id.textView1)
        }
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.text_row_item, viewGroup, false)

        return ViewHolder(view)
    }


    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {


        viewHolder.textViewName.text = names[position]
        viewHolder.textViewMessage.text = messages[position]
    }


    override fun getItemCount() = names.size

}

