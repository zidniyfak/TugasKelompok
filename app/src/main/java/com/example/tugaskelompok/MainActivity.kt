package com.example.tugaskelompok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.core.view.get

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val club = arrayOf("Juventus", "Milan","Inter Milan", "PSG", "Manchester City", "Manchester United", "Liverpol", "Barcelona", "Real Madrid")

        val adapter = ArrayAdapter (this, android.R.layout.simple_list_item_1 ,club)
        val listClub : ListView = findViewById(R.id.listClub)
        listClub.adapter = adapter

        listClub.setOnItemClickListener { parent, view, position, id ->
            val element = listClub.getItemAtPosition(position)
            Log.d("Log Tag",element.toString())

            val intent = Intent(this,ClubActivity::class.java)
            intent.putExtra("Data",element.toString())
            startActivity(intent)
        }
    }
}