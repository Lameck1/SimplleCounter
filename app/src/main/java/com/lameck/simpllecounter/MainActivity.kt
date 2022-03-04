package com.lameck.simpllecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var countTxt: TextView
    private lateinit var decrementBtn: Button
    private lateinit var resetBtn: Button
    private lateinit var incrementBtn: Button

    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countTxt = findViewById(R.id.countTxt)
        incrementBtn = findViewById(R.id.incrementBtn)
        decrementBtn = findViewById(R.id.decrementBtn)
        resetBtn = findViewById(R.id.resetBtn)

        incrementBtn.setOnClickListener(clickListener)
        decrementBtn.setOnClickListener(clickListener)
        resetBtn.setOnClickListener(clickListener)
    }

    private val clickListener = View.OnClickListener { view ->
        when (view.id) {
            R.id.incrementBtn -> increment()
            R.id.decrementBtn -> decrement()
            R.id.resetBtn -> reset()
        }
    }

    private fun increment() {
        count += 1
        countTxt.text = count.toString()
    }

    private fun decrement() {
        count -= 1
        countTxt.text = count.toString()
    }

    private fun reset() {
        count = 0
        countTxt.text = count.toString()
    }
}