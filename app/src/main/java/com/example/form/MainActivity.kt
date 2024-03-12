package com.example.form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup = findViewById<RadioGroup>(R.id.radio1)
        val salaryEditText = findViewById<EditText>(R.id.editTextText8)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.radioButton) {
                salaryEditText.visibility = View.VISIBLE
            } else {
                salaryEditText.visibility = View.INVISIBLE
            }
        }
    }
}