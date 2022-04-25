package com.example.bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var register : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        register = findViewById(R.id.register_txt)

        register.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
        R.id.register_txt ->{
            val intentBiasa = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intentBiasa)
        }
    }
}

}