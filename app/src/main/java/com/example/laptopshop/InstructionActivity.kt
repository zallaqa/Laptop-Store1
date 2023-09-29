package com.example.laptopshop

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InstructionActivity : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instruction)

        sharedPreferences = getSharedPreferences("XogInst",Context.MODE_PRIVATE)


        if (sharedPreferences.getBoolean("Inst_dhamaad",false)){
            furList()
            return
        }


        val btninstr = findViewById<Button>(R.id.instruction_btn)

        btninstr.setOnClickListener {
            sharedPreferences.edit().putBoolean("Inst_dhamaad",true).apply()
            furList()
        }
    }

    private fun furList() {
        val intent = Intent(this,ListActivity::class.java)
        startActivity(intent)
        finish()
    }


}