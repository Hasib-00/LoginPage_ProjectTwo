package com.example.loginpage_two

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var signuptv: TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        signuptv = findViewById(R.id.siUpTV)
        signuptv.setOnClickListener {
            val intent = Intent(this@MainActivity, SignUppage::class.java)
            startActivity(intent)
        }



    }
}