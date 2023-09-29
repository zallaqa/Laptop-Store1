package com.example.laptopshop

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var title : TextView = findViewById(R.id.title_name)
        var emailText : EditText = findViewById(R.id.emailText)
        var passText : EditText = findViewById(R.id.passText)
        var btn_login : Button = findViewById(R.id.btn_submit)

        val sharedPreferences =getSharedPreferences("xogta",Context.MODE_PRIVATE)
        val getEmail =sharedPreferences.getString("Email",null)
        val getPassword=sharedPreferences.getString("Passw",null)
        if (getEmail != null && getPassword != null){
            val intent= Intent(this,OnboardingActivity::class.java)
            startActivity(intent)
        }

        btn_login.setOnClickListener {

            val email = emailText.text.toString()
            val password = passText.text.toString()


            val editor =sharedPreferences.edit()
            editor.putString("Email",email)
            editor.putString("Passw", password)
            editor.apply()

            val i = Intent(this,OnboardingActivity::class.java)
            startActivity(i)
        }

    }
}

