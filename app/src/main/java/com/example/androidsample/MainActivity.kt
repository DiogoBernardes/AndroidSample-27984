package com.example.androidsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View;
import android.widget.EditText
import android.widget.TextView
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun convertCurrency(view: View){
        val dollarText = findViewById<EditText>(R.id.dollarText)
        val textView = findViewById<TextView>(R.id.textView)

        if(!dollarText.getText().toString().equals("")){

            val dollarValue = dollarText.getText().toString().toFloat()
            val euroValue = dollarValue * 0.85F
            textView.setText(String.format(Locale.ENGLISH,"%.2f", euroValue))
        }else{
            textView.setText(R.string.no_value_stirng)
        }
    }
}