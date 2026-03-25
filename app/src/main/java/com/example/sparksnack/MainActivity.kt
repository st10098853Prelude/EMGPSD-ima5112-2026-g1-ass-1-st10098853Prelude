package com.example.sparksnack

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val timeInput = findViewById<EditText>(R.id.timeInput)
        val suggestButton = findViewById<Button>(R.id.suggestButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        suggestButton.setOnClickListener {

            val userInput = timeInput.text.toString().trim().lowercase()

            if (userInput.isEmpty()) {
                resultText.text = "Please enter a time of day so we can spark some connection! "
            }
            else if (userInput == "morning") {
                resultText.text = " Send a 'Good morning' text to a family member."
            }
            else if (userInput == "mid-morning" || userInput == "mid morning") {
                resultText.text = " Reach out to a colleague with a quick 'Thank you.'"
            }
            else if (userInput == "afternoon") {
                resultText.text = "Share a funny meme or interesting link with a friend."
            }
            else if (userInput == "afternoon snack time" || userInput == "snack time") {
                resultText.text = " Send a quick 'Thinking of you' message."
            }
            else if (userInput == "dinner") {
                resultText.text = " Call a friend or relative for a 5-minute catch-up."
            }
            else if (userInput == "after dinner" || userInput == "night") {
                resultText.text = " Leave a thoughtful comment on a friend's post."
            }
            else {
                resultText.text = "Hmm...I don’t recognise that time. Try: Morning, Afternoon, Dinner, Night, etc."
            }
        }

        resetButton.setOnClickListener {
            timeInput.text.clear()
            resultText.text = ""
        }
    }
}
