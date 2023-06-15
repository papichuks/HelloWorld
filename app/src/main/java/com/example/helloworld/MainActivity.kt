package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT).show()
            button.setBackgroundColor(getResources().getColor(R.color.purple_200))
        }
    }
}