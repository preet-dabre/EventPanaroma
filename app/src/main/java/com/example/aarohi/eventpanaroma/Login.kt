package com.example.aarohi.eventpanaroma

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var login:Button = findViewById(R.id.login)
        login.setOnClickListener{
            val intent= Intent(this, Login::class.java)
            startActivity(intent)

        }

    }
}
