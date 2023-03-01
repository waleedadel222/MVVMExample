package com.waleed.mvvmexample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.waleed.mvvmexample.viewModel.CalViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var editTextYear: EditText
    private lateinit var getAgeButton: Button
    private lateinit var textViewAge: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextYear = this.findViewById(R.id.editTextYear)
        getAgeButton = this.findViewById(R.id.getAgeButton)
        textViewAge = this.findViewById(R.id.textViewAge)

        val viewModel = ViewModelProvider(this)[CalViewModel::class.java]

        getAgeButton.setOnClickListener {

            viewModel.calcAge(editTextYear.text.toString()).observe(this) {

                textViewAge.text = "Your Age is ${it.age}"

            }
        }


    }
}