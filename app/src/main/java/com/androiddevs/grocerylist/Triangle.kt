package com.androiddevs.grocerylist

import kotlin.math.sqrt

class Triangle(

    val a:Double,
    val b:Double,
    val c:Double
) :Shape("Triangle"){
    init {
        println("$name Triangle create with a=$a,b=$b,c=$c")
        println("$name Triangle area is ${area()}")
        println("$name Triangle perimeter is ${perimeter()}")
    }

    fun area()= sqrt((perimeter()/2)* (perimeter()/2-a) *(perimeter()/2-b)*(perimeter()/2-c))

    fun perimeter()=a+b+c

}