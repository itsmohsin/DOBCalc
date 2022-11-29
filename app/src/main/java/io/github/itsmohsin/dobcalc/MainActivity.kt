package io.github.itsmohsin.dobcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker : Button = findViewById(R.id.btnDate)

        btnDatePicker.setOnClickListener {
            Toast.makeText(this, "btnDatePicker Pressed", Toast.LENGTH_LONG).show()
        }
    }
}