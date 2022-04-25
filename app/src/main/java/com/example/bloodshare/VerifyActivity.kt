package com.example.bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class VerifyActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var login : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        login = findViewById(R.id.button_login)

        login.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
        R.id.button_login ->{
            val intentBiasa = Intent(this@VerifyActivity, HomeActivity::class.java)
            startActivity(intentBiasa)
        }
    }
}

}