package com.example.profileapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.TextView
import android.view.MotionEvent


class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        var chart = findViewById<Button>(R.id.chart)
        chart.setOnClickListener {
           Toast.makeText(this,"Added",Toast.LENGTH_SHORT).show()

        }


        var price = findViewById<Button>(R.id.price)
        price.setOnClickListener {
            val intent = Intent(this, MainActivity13::class.java)
            startActivity(intent)

        }




        var counter = 0
        val MAX_COUNTER_VALUE = 10
        val btnCounter = findViewById<Button>(R.id.btnCounter)
        val txtCounter = findViewById<TextView>(R.id.txtCounter)
        btnCounter.setOnTouchListener { view, event ->
            val action = event.action
            val x = event.x

            when (action) {
                MotionEvent.ACTION_DOWN -> {
                    if (x < view.width / 2 && counter > 0 ) {
                        // Left side of the button touched, decrement the counter
                        counter--
                    } else if (x >= view.width / 2 && counter < MAX_COUNTER_VALUE) {
                        // Right side of the button touched, increment the counter
                        counter++
                    }
                    txtCounter.text = counter.toString()
                }
            }
            true
        }


    }
}