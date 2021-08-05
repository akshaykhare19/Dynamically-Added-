package com.project.textviewdynamicaddition

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var addTextView: Button
    lateinit var linearLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addTextView = findViewById(R.id.add_text_view)
        linearLayout = findViewById(R.id.linear_layout)

        addTextView.setOnClickListener {
            addToLinearLayout()
        }
    }

    //function to add a new text view to linear layout
    private fun addToLinearLayout() {

        //making a new text view
        val newTextView = TextView(this)

        //setting parameters for text view
        val params = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        params.setMargins(0, 0, 0, 20)
        newTextView.layoutParams = params

        //setting text to text view
//        newTextView.text = "I'm dynamically added here!!"
        for(num in 1 until 10) newTextView.text = num.toString()

        newTextView.gravity = Gravity.CENTER

        newTextView.setPadding(20,20,20,20)

        newTextView.textSize = 25F

        newTextView.setTextColor(Color.BLACK)

        newTextView.setBackgroundColor(Color.YELLOW)



        //adding the new text view to the linear layout
        linearLayout.addView(newTextView)

    }
}