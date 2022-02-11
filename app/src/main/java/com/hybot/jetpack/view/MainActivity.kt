package com.hybot.jetpack.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hybot.jetpack.R
import com.hybot.jetpack.viewmodel.PersonagensViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personagensViewModel = ViewModelProvider(this).get(PersonagensViewModel::class.java)

        val personagens = personagensViewModel.personagens

        personagens.observe(this){


        val rvPersonagens = findViewById<RecyclerView>(R.id.rvPersonagens)
        rvPersonagens.layoutManager = LinearLayoutManager(this)
        rvPersonagens.adapter = PersonagensAdapter(it)

        }

    }
}
