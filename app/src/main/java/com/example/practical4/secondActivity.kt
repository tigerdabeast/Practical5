package com.example.practical4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var name = intent.getStringExtra("personName")

        var tv = findViewById<TextView>(R.id.textView)
        tv.text = name

    }
}