package com.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ClassObjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_object)

        //我们可以像使用普通函数那样使用构造函数创建类实例：
        val site = Runoob()
        //使用类属性
        site.city
        site.name


    }


    class Runoob {
        var name: String = "张三"
        var url: String = "https://www.baidu.com"
        var city: String = "常州"
    }


    class Person {

        var lastName: String = "张三"
            get() = field.toUpperCase()
            set


        var no: Int = 100
            get() = field
            set(value) {
                if (value < 10) {
                    field = value
                } else {
                    field = -1
                }
            }

        var height: Float = 145.4f
            private set


    }


}