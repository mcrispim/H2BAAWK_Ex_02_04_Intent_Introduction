package com.example.h2baawk_ex_02_04_myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        //Get the intent which started this activity
        intent?.let {
            //Set the welcome message
            val fullName = it.getStringExtra(FULL_NAME_KEY)
            findViewById<TextView>(R.id.header_text).text =
                getString(R.string.welcome_text, fullName)
        }
    }
}