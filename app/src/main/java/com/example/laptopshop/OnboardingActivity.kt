package com.example.laptopshop


import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class OnboardingActivity : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        sharedPreferences = getSharedPreferences("XogOb",Context.MODE_PRIVATE)

        if (sharedPreferences.getBoolean("Onborad_dhamaad",false)){
            furInst()
            return
        }



        val onboardingButton = findViewById<Button>(R.id.btnOnb)
        val titleOnb = findViewById<TextView>(R.id.titleOnb)
        val descOnb = findViewById<TextView>(R.id.descOnb)

        onboardingButton.setOnClickListener {

            sharedPreferences.edit().putBoolean("Onborad_dhamaad",true).apply()

            furInst()


        }
    }

    private fun furInst() {
        val intent = Intent(this,InstructionActivity::class.java)
        startActivity(intent)
        finish()
    }


}
