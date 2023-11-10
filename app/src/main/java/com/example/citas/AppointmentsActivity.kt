package com.example.citas

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AppointmentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointments)
    }

    fun onImageButtonClickBack(view: View) {
        val intent = Intent(this, SingInActivity::class.java)
        startActivity(intent)
    }

    fun onImageButtonClickAdd(view: View) {
        val intent = Intent(this, AppointmentActivity::class.java)
        startActivity(intent)
    }
}