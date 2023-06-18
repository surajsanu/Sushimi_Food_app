package com.example.profileapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.view.View
import android.widget.Toast


class MainActivity12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)

        var burger = findViewById<ImageView>(R.id.burger)
        burger.setOnClickListener {
            val intent = Intent(this, MainActivity13::class.java)
            startActivity(intent)

        }

        var aloo = findViewById<ImageView>(R.id.aloo)
        aloo.setOnClickListener {
            val intent = Intent(this, MainActivity13::class.java)
            startActivity(intent)

        }

        var pizza = findViewById<ImageView>(R.id.pizza)
        pizza.setOnClickListener {
            val intent = Intent(this, MainActivity13::class.java)
            startActivity(intent)

        }

        var icecream = findViewById<ImageView>(R.id.icecream)
        icecream.setOnClickListener {
            val intent = Intent(this, MainActivity13::class.java)
            startActivity(intent)

        }

        var img21 = findViewById<ImageView>(R.id.img21)
        img21.setOnClickListener {
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)

        }

        var img22 = findViewById<ImageView>(R.id.img22)
        img22.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)

        }

        var img23 = findViewById<ImageView>(R.id.img23)
        img23.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)

        }

        var img24 = findViewById<ImageView>(R.id.img24)
        img24.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)

        }

        var img25 = findViewById<ImageView>(R.id.img25)
        img25.setOnClickListener {
            val intent = Intent(this, MainActivity9::class.java)
            startActivity(intent)

        }
    }



    fun onSearchButtonClick(view: View) {
        // Handle search button click event
        Toast.makeText(this, "Search button clicked!", Toast.LENGTH_SHORT).show()
        // Add your search logic here
    }
}