package com.example.learning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settingButton()
    }

    fun settingButton() {
        val subButton = findViewById<Button>(R.id.button_to_subactivity)
        subButton.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }

        val twoColorButton = findViewById<Button>(R.id.button_to_twoColorActivity)
        twoColorButton.setOnClickListener {
            val intent = Intent(this, TwoColorActivity::class.java)
            startActivity(intent)
        }

        val viewButton = findViewById<Button>(R.id.button_to_viewActivity)
        viewButton.setOnClickListener {
            val intent = Intent(this, ViewActivity::class.java)
            startActivity(intent)
        }
    }
}