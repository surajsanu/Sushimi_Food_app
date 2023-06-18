package com.example.profileapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        var slidebutton = findViewById<Button>(R.id.slidebutton)
        slidebutton.setOnClickListener {
            val intent = Intent(this, MainActivity12::class.java)
            startActivity(intent)

        }
    }
}