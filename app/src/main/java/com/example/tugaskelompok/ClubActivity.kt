package com.example.tugaskelompok

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ClubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_club)

        val clubTextView : TextView = findViewById(R.id.clubTextView)

        clubTextView.setText(intent.getStringExtra("Data"))
    }

}