package com.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LoopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loop)

//        funFor()
//        funWhile()
        funReturn()
    }


    private fun funFor() {
        val items = listOf<String>("apple", "banana", "kiwi")
        for (item in items) {
            Log.e("WY", "$item")
        }


        for (index in items.indices) {
            Log.e("WY", "item at $index is ${items[index]}")
        }


        /** 输出结果
        apple
        banana
        kiwi
        item at 0 is apple
        item at 1 is banana
        item at 2 is kiwi
         */


    }


    private fun funWhile() {

        Log.e("WY", "---------while使用----------")
        var x = 5
        while (x > 0) {
            Log.e("WY", "${x--}")
        }


        Log.e("WY", "--------do....---while使用----------")
        var y = 5
        do {
            Log.e("WY", "${y--}")
        } while (y > 0)


    }


    private fun funReturn() {
        for (i in 1..10) {
            if (i == 3) continue
            Log.e("WY", "$i")
            if (i > 5) {
                break
            }
        }
    }


}