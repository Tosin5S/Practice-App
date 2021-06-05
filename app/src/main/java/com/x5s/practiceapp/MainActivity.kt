package com.x5s.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Your code goes here
        Toast.makeText(this, "Can you see me?",
        Toast.LENGTH_SHORT).show()

        Log.i("info", "Done creating the app")
    }

    fun topClick(view: View) {
        Toast.makeText(this, "Top button clicked",
           Toast.LENGTH_SHORT).show()

        Log.i("info", "The user clicked the top button")
    }

    fun bottomClick(view: View) {
        Toast.makeText(this, "Bottom button clicked",
           Toast.LENGTH_SHORT).show()

        Log.i("info", "The user clicked the bottom button")
    }
} // This is the end of the class