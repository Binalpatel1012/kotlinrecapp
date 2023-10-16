package com.example.kotlinrecapp.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.kotlinrecapp.CounterState

class MainActivity : AppCompatActivity() {
    private val counterState = CounterState()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.counter_text)
        val incrementButton: Button = findViewById(R.id.increment_button)
        val decrementButton: Button = findViewById(R.id.decrement_button)

        textView.text = counterState.value.toString()

        incrementButton.setOnClickListener {
            counterState.increment()
            textView.text = counterState.value.toString()
        }

        decrementButton.setOnClickListener {
            counterState.decrement()
            textView.text = counterState.value.toString()
        }
    }
}