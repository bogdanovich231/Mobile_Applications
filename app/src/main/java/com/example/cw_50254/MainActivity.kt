package com.example.cw_50254

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.editText)
        val iv_click_me = findViewById<ImageView>(R.id.imageView)
        val button = findViewById<Button>(R.id.button)
        iv_click_me.setOnClickListener {
        Toast.makeText(this@MainActivity, "Hello World.", Toast.LENGTH_SHORT).show()
        }
        button.setOnClickListener {
            val displayText = findViewById<TextView>(R.id.textView)
            displayText.text = "Hello ${editText.text}"
        }
    }
}