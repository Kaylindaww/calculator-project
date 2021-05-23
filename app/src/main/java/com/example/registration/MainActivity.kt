package com.example.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvNumber1=findViewById<TextView>(R.id.etNumber1)
        var tvNumber2=findViewById<TextView>(R.id.etNumber2)
        var btnAdd=findViewById<Button>(R.id.btnAdd)
        var btnDivide=findViewById<Button>(R.id.btnDivide)
        var btnSubtract=findViewById<Button>(R.id.btnDivide)
        var btnMultiply=findViewById<Button>(R.id.btnMultiply)
        var tvResult=findViewById<TextView>(R.id.tvResults)

        btnAdd.setOnClickListener {
            var Number1=tvNumber1.text.toString().toInt()
            var Number2=tvNumber2.text.toString().toInt()
            var Result=Number1+Number2
            tvResult.text="Results $Result"

        }

        btnDivide.setOnClickListener {
            var Number1=tvNumber2.text.toString().toInt()
            var Number2=tvNumber2.text.toString().toInt()
            var Result=Number1/Number2
            tvResult.text="Results $Result"
        }
        btnSubtract.setOnClickListener {
            var Number1=tvNumber1.text.toString().toInt()
            var Number2=tvNumber2.text.toString().toInt()
            var Result=Number1-Number2
            tvResult.text="Results $Result"
        }
        btnMultiply.setOnClickListener {
            var Number1=tvNumber1.text.toString().toInt()
            var Number2=tvNumber2.text.toString().toInt()
            var Result=Number1*Number2
            tvResult.text="Results $Result"
        }
    }
}




