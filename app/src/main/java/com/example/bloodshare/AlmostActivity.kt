package com.example.bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class AlmostActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttverif: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost)

        buttverif = findViewById(R.id.button_verif)

        buttverif.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
        R.id.button_verif ->{
            val intentBiasa = Intent(this@AlmostActivity, VerifyActivity::class.java)
            startActivity(intentBiasa)
        }
    }
}

}