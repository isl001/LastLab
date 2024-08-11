package com.example.lastlab

import android.os.Bundle
import android.widget.Toast
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


const val LOG_TAG = "Github"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        boody()
        ahmed()
        mostafa()
        Log.i("mohamed","Hello,Mohamed")

    }
    
    fun islam(){
        Log.d(LOG_TAG, "Islam commit")

    }
    
    fun mostafa()
    {
        Toast.makeText(this, "My name is mostafa", Toast.LENGTH_SHORT).show()
    }
    fun boody() {
        Log.d(LOG_TAG, "boody commit")
    }
    private fun ahmed() {
        Log.d(LOG_TAG, "Ahmed commit")

    }
    fun mohamed(){
        Log.d(LOG_TAG,"mohamed")
    }
}