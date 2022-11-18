package com.example.tugaskelompok

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ClubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_club)

        val clubTextView : TextView = findViewById(R.id.clubTextView)
        val imgClub : ImageView = findViewById(R.id.imgClub)

        if (intent.getStringExtra("Data") == "Juventus") {
            imgClub.setImageResource(R.drawable.juventus)
        }else if(intent.getStringExtra("Data") == "PSG"){
            imgClub.setImageResource(R.drawable.psg)
        }
        clubTextView.setText(intent.getStringExtra("Data"))
    }
}