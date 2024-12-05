package com.nibm.chatapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChatFragment : Fragment() {

    private val names =  arrayOf("Madhushan", "Gavishka", "Mahish", "Supun", "Ashan", "Samith", "Janitha", "Dilan", "Chamith", "Asanka")
    private val messages = arrayOf("Hi there!", "What's up?", "Good afternoon", "How's it going?", "Have a great day!", "Take care!", "Good evening", "Nice to meet you!", "See you soon!", "Stay safe!")
    private val customAdapter = CustomAdapter(names, messages)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_chat, container, false)


        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = customAdapter

        return view
    }
}
