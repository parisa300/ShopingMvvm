package com.androiddevs.grocerylist

fun main (){
/*    val list= listOf(1,2,3,4,56,6)
    println("the list look like following :$list")
    println("search for this number:")
    val input= readLine()?.toInt()

    if(input != null){
        println("the index of $input is ${indexOf(list,input)}")
    }*/


  /*  println("please enter number:")
    val input = readLine()?.toInt()

    if(input !=null){

        if (input.isprime()){
            println("$input is prime number")
        }else{
            println("$input is not prime number")
        }
    }*/


   /* val myTriangle=Triangle(3.0,4.5,6.0)
    myTriangle.ChangeName("parisa")
    println("${myTriangle.name}")*/

    var list =(1..20).toList()
    println(list)
   /* list=list.filter { it %2==0 }

    println(list)*/

    list= list.filter { it > 8 }
    println(list)
}

// عدد تقسیم بر 2 بشه باقیماندش بشه صفر فالز بر میگرده و در مین گفتم اگه true بود بیاد بگه is prime number
fun Int.isprime():Boolean{
    for (i in 2 until this-1){

        if(this % i==0){
            return false
        }
    }
    return true
}


fun indexOf(list: List<Int>,value:Int):Int{

    for (i in 0..list.size-1){
        if(list [i]== value){
            return i
        }
    }
    return -1
}