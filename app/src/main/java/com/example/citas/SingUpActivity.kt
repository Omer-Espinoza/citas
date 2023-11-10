package com.example.citas

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SingUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up)
    }

    fun onButtonClickSingIn(view: View) {
        val intent = Intent(this, SingInActivity::class.java)
        startActivity(intent)
    }
}