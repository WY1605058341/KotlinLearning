package com.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ClassObjectActivity : AppCompatActivity() {

    lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_object)

        tv = findViewById(R.id.tv)


        //我们可以像使用普通函数那样使用构造函数创建类实例：
        val site = Runoob()
        //使用类属性
        var mycity = site.city
        var myName = site.name

        tv.text = "city=$mycity \n name=$myName" //换行显示城市和名称

//        print("city=$mycity")
//
//        print("name=$myName")


        var person: Person = Person()
        person.lastName = "wang"
        tv.text = tv.text as String + "\n lastName:${person.lastName}"

        person.no = 9
        tv.text = tv.text as String + "\n no:${person.no}"

        person.no = 20
        tv.text = tv.text as String + "\n no:${person.no}"


    }


    class Runoob { //定义Runoob 类
        var name: String = "张三"
        var url: String = "https://www.baidu.com"
        var city: String = "常州"

        fun foo() { //成员函数
            print("Foo 成员函数")
        }


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