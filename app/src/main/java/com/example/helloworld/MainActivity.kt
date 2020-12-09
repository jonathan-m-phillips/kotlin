package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Creating an On Click Listener

        // get reference to button
        val btn_click_me = findViewById(R.id.button) as Button

        // creating val myTextView and importing TextView class
        val myTextView = findViewById(R.id.textView) as TextView

        // creating variable for how many times the button was clicked
        var timesClicked = 0

        // set on-click listener
        btn_click_me.setOnClickListener {
            timesClicked += 1
            myTextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "Hi Jon.", Toast.LENGTH_SHORT).show()
        }

    }

}