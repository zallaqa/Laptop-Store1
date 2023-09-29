package com.example.laptopshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.TextView

class ListActivity : AppCompatActivity() {
    lateinit var listbraName : TextView
    lateinit var listbraRes : TextView
    lateinit var listbraprice : TextView
    lateinit var listbtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        listbraName = findViewById(R.id.listBrand_name)
        listbraRes = findViewById(R.id.listBrand_res)
        listbraprice = findViewById(R.id.listBrand_res)
        listbtn = findViewById(R.id.btnList)


        val brandName = intent.getStringExtra("brandName")
        val brandRes = intent.getStringExtra("brandRes")
        val brandPrice = intent.getStringExtra("brandPrice")


        listbraName.text = "Brand Name: $brandName"
        listbraRes.text = "Brand Resource: $brandRes"
        listbraprice.text = "Brand Price: $brandPrice"


        listbtn.setOnClickListener {
            val intent = Intent(this, DetialActivity::class.java)
            startActivity(intent)

        }
    }
}




