package com.kotlinlearning

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

/**
 * 条件控制语句
 */
class ConditionActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_condition)

//        funIf(3, 5)
//        funRange()
        funWhen()
    }


    private fun funIf(a: Int, b: Int) {

        var max = a

        //如果a小于b,那么，将b赋值给max
        if (a < b) {
            max = b
        }


        var max1: Int
        if (a > b) {
            max1 = a
        } else {
            max1 = b
        }

        //作为表达式处理
        val max2 = if (a > b) a else b

        // 把 IF 表达式的结果赋值给一个变量。
        val max3 = if (a > b) {
            a
            Log.e("WY", "a=$a")
        } else {
            b
            Log.e("WY", "$b")
        }


    }


    //使用区间
    private fun funRange() {

//        val x = 4
//
//        if (x in 1..8) {
//            Log.e("WY","$x 在区间内")
//        }


//        val x = "abc"
//        val y = "hvfhvhhjkabcnksbfb"
//        if (x in y) {
//            Log.e("WY", "$x 在区间内")
//        }


        val x = 3.2f
        if (x in 0.5f..5.9f) {
            Log.e("WY", "$x 在区间内")
        }

    }


    private fun funWhen() {

//        val x = 3
//        when (x) {
//            1 -> Log.e("WY", "x == 1")
//            2 -> Log.e("WY", "x == 2")
//            else -> {// 注意这个块
//                Log.e("WY", "x 不是 1 ，也不是 2")
//            }
//            //when 相当于Java里面的switch语法，else 相当于default
//        }


        //多条件放在一起
//        val x = 4
//        when (x) {
//            0, 1, 2 -> {
//                Log.e("WY", "这里的条件是0，1，2中的一个")
//            }
//            else -> {
//                Log.e("WY", "这里的条件不是 0，1，2 中的任意一个")
//            }
//        }


        // 可以检测一个值在不在一个区间内
        val x = 30
        when (x) {
            in 1..10 -> {
                Log.e("WY", "$x 在1到10区间内")
            }
            !in 10..20 -> {
                Log.e("WY", "$x is outside the range")
            }
            else -> {
                Log.e("WY", "都不符合条件")
            }
        }


    }


}