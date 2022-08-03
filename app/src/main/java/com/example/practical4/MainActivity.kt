package com.example.practical4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener()
        {
            var intent = Intent(this, secondActivity::class.java)

            intent.putExtra("personName", "Tiger")

            startActivity(intent)
        }
    }
}