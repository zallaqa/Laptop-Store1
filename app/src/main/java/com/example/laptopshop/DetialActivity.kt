package com.example.laptopshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class DetialActivity : AppCompatActivity() {
    lateinit var  Brandname : EditText
    lateinit var  Brandres : EditText
    lateinit var  Brandprice : EditText
    lateinit var  btnSave    : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detial)

        Brandname = findViewById(R.id.brandName)
        Brandres = findViewById(R.id.brandRes)
        Brandprice = findViewById(R.id.brandPrice)
        btnSave = findViewById(R.id.btnbrandSave)

        btnSave.setOnClickListener {
            val brandName = Brandname.text.toString()
            val brandRes = Brandres.text.toString()
            val brandPrice = Brandprice.text.toString()

            val intent = Intent(this, ListActivity::class.java)
            intent.putExtra("brandName", brandName)
            intent.putExtra("brandRes", brandRes)
            intent.putExtra("brandPrice", brandPrice)

            startActivity(intent)
        }
    }
}