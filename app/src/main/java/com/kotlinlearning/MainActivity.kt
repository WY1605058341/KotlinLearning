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
    private lateinit var btn4: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //函数声明
        btn1 = findViewById(R.id.btn_1)
        btn1.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, FunActivity::class.java)
            startActivity(intent)
        })

        //条件控制
        btn2 = findViewById(R.id.btn_2)
        btn2.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, ConditionActivity::class.java)
            startActivity(intent)
        })

        //循环控制
        btn3 = findViewById(R.id.btn_3)
        btn3.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, LoopActivity::class.java)
            startActivity(intent)
        })

        //类与对象
        btn4 = findViewById(R.id.btn_4)
        btn4.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, ClassObjectActivity::class.java)
            startActivity(intent)
        })


    }


}