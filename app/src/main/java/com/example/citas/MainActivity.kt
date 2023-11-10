package com.example.citas


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in)
    }

    fun onButtonClickSingIn(view: View) {
        val intent = Intent(this, AppointmentsActivity::class.java)
        startActivity(intent)
    }

    fun onButtonClickSingUp(view: View) {
        val intent = Intent(this, SingUpActivity::class.java)
        startActivity(intent)
    }
}