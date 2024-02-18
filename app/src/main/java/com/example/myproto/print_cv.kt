package com.example.myproto

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity


class ShowCv : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_cv)
        val back = findViewById<Button>(R.id.home_button)
        val github = findViewById<Button>(R.id.github_button)
        val linkedin = findViewById<Button>(R.id.linkedin_button)
        back.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
        github.setOnClickListener {
            val url = "https://github.com/Omegalpha28"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }

}