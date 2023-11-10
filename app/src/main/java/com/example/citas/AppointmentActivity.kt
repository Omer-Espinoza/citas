package com.example.citas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class AppointmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointment)

        val spinnerPerson: Spinner = findViewById(R.id.spinnerPerson)
        val personas = listOf("Person 1", "Person 2", "Person 3")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, personas)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerPerson.adapter = adapter
    }


    fun onImageButtonClickBack(view: View) {
        val intent = Intent(this, AppointmentsActivity::class.java)
        startActivity(intent)
    }

    fun onButtonClickAppointments(view: View) {
        val intent = Intent(this, AppointmentsActivity::class.java)
        startActivity(intent)
    }
}