package com.androiddevs.grocerylist

 open class Shape (

     var name:String
 ){

     init {
         println(" iam super class!")
     }

     fun ChangeName(newName:String){
         name=newName
     }

}