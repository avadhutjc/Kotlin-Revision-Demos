package com.ajc.kotlin_revision_demos

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//launch the coroutine on main thread
fun main() = runBlocking {
    launch {
        println("coroutine started")
        delay(1000) // suspend function is called see symbol
        println("coroutine ended")
    }
    GlobalScope.launch {

    }
    println("main program ends here ${Thread.currentThread().name}")
}

//added explicit unit return type
//fun main(): Unit = runBlocking {
//    launch {
//        println("started")
//        delay(1000)
//        println("Coroutine going to end ${Thread.currentThread().name}")
//    }
//}