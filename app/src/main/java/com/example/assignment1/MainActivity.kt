package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.ResultButton)
        val resultTV: TextView = findViewById(R.id.TextResult)

        var flag: String = "Check-up"
        val spinnerVal: Spinner = findViewById(R.id.spinner1)
        var options = arrayOf("Check-up", "Vaccine", "Dental cleaning", "Bath Services")
        spinnerVal.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)
        button.setOnClickListener { view ->
            if (flag == "Check-up")
                resultTV.text = 50.toString();
            if (flag == "Vaccine")
                resultTV.text = 15.toString();
            if (flag == "Dental cleaning")
                resultTV.text = 70.toString();
            if (flag == "Bath Services")
                resultTV.text = 10.toString();
        }
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}




