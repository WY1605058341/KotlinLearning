package com.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class FunActivity : AppCompatActivity() {

    //可变变量定义：var 关键字
    //var <标识符> : <类型> = <初始化值>
    var a: Int = 1
    var a1 = 2 //系统判断是Int类型


    //不可变变量定义：val 关键字，只能赋值一次的变量(类似Java中final修饰的变量)
    //val <标识符> : <类型> = <初始化值>
    val b = 1 //系统自动判断变量类型为Int

    //数组
    private val array = arrayOf(1, 2, 3)
    private val arrays = Array(3) { i -> (i * 2) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun)

        var a = 1
        // 模板中的简单名称：
        val s1 = "a is $a"


        a = 2
        // 模板中的任意表达式：
        val s2 = "${s1.replace("is", "was")}, but now is $a"


        //类型后面加?表示可为空
        var age: String? = "23"
//        Log.e("WY","age is $age")

        //抛出空指针异常
//        val ages = age!!.toInt()
//        Log.e("WY","ages is $ages")


        //不做处理返回 null
        val ages1 = age?.toInt()
//        Log.e("WY", "ages1 is $ages1")

//        for (vt in array) {
//            Log.e("WY", "array=$vt")
//        }
//
//
//        for (vt in arrays) {
//            Log.e("WY", "arrays=$vt")
//        }






    }


    private fun sum(a: Int, b: Int): Int { //Int 参数，返回值Int
        return a + b
    }


    public fun sum1(a: Int, b: Int): Int = a + b // public 方法则必须明确写出返回类型


    //无返回值类型
    fun printSum(a: Int, b: Int): Unit {
        println(a + b)
    }

    //无返回值类型。可以省略Unit
    public fun printSum1(a: Int, b: Int) {
        println(a + b)
    }


    //可变参数可以用 vararg表示
    //调用时  vars(1,2,3)
    fun vars(vararg v: Int) {
        for (vt in v) {
            println(vt)
        }
    }


}