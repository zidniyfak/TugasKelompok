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
        }else if(intent.getStringExtra("Data") == "Barcelona"){
            imgClub.setImageResource(R.drawable.barcelona)
        }else if(intent.getStringExtra("Data") == "Real Madrid"){
            imgClub.setImageResource(R.drawable.real_madrid)
        }else if(intent.getStringExtra("Data") == "Milan"){
            imgClub.setImageResource(R.drawable.ac_milan)
        }else if(intent.getStringExtra("Data") == "Inter Milan"){
            imgClub.setImageResource(R.drawable.inter_milan)
        }else if(intent.getStringExtra("Data") == "Manchester United"){
            imgClub.setImageResource(R.drawable.manchester_united)
        }else if(intent.getStringExtra("Data") == "Manchester City"){
            imgClub.setImageResource(R.drawable.manchester_city)
        }else if(intent.getStringExtra("Data") == "Liverpool"){
            imgClub.setImageResource(R.drawable.liverpool)}


        clubTextView.setText(intent.getStringExtra("Data"))
    }
}