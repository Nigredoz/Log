package com.example.logging

import timber.log.Timber
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton: Button = findViewById(R.id.button_log)
        val eText: EditText = findViewById(R.id.edit_text)
        myButton.setOnClickListener{
            Log.v("From EditText",eText.text.toString())
        val myButtonT: Button = findViewById(R.id.button_timber)
        myButtonT.setOnClickListener{
            Timber.plant(Timber.DebugTree())
            val eText: EditText = findViewById(R.id.edit_text)
            Timber.v(eText.text.toString())
        }
        }
    }
}