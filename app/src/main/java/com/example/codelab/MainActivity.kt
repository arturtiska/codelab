package com.example.codelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countUpButton: Button = findViewById(R.id.count_button)
        countUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice(){
        val randon = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randon.toString()

    }

    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        if (resultText.text == "Hello World!"){
            resultText.text = "1"
        }else{
            var resultInt = resultText.text.toString().toInt()
            if (resultInt < 6){
                resultInt++
                resultText.text = resultInt.toString()
            }
        }

    }
}