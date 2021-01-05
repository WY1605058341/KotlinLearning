package com.kotlinlearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.btn_1)
        btn1.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, FunActivity::class.java)
            startActivity(intent)
        })

        btn2 = findViewById(R.id.btn_2)
        btn2.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, ConditionActivity::class.java)
            startActivity(intent)
        })

        btn3 = findViewById(R.id.btn_3)
        btn3.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, LoopActivity::class.java)
            startActivity(intent)
        })


    }


}