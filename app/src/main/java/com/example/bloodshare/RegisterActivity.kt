package com.example.bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

class RegisterActivity : AppCompatActivity(), OnClickListener {

    private lateinit var registerbutt : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        registerbutt = findViewById(R.id.button_register)

        registerbutt.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button_register ->{
                val intentBiasa = Intent(this@RegisterActivity, AlmostActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }

}