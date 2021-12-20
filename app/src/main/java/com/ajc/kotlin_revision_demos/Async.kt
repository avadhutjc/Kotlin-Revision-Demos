package com.ajc.kotlin_revision_demos

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    val res1: Deferred<Int> = async {
        return@async num1()
    }

    val res2: Deferred<Int> = async {
        return@async num2()
    }

    println("Accepted Result is ${res1.await() * res2.await()}")
    // println("The addition of $res1 + $res2") //we cannot say this we need to write await()

}

private suspend fun num1(): Int {
    println("num 1 starts")
    println("on which thread num1 is running ${Thread.currentThread().name}")
    delay(300)
    println("num 1 ends")
    return 5
}

private suspend fun num2(): Int {
    println("num 2 starts")
    println("on which thread num1 is running ${Thread.currentThread().name}")
    delay(1000)
    println("num 2 ends")
    return 3
}
/*
num 1 starts
on which thread num1 is running main
num 2 starts
on which thread num1 is running main
num 1 ends
num 2 ends
Accepted Result is 15

Process finished with exit code 0
 */