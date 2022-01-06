package com.ajc.kotlin_revision_demos


//fun main() {
//    var name: String = "MindOrks"
//    name = null
//}
/*

Kotlin: Null can not be a value of a non-null type String
 */

fun main() {
    var name: String? = "MindOrks"
    println(name) // MindOrks
    //assigning the variable 1
    name = null
    println(name?.length) //null
    //assigning the variable 2
    name = "Avadhut J"
    print(name.length)//Unnecessary safe call on a non-null receiver of type String?
}
/*
MindOrks
null
9
Process finished with exit code 0
 */

