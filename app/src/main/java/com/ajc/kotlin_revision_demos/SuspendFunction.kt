package com.ajc.kotlin_revision_demos

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {

    //1
    launch {
        println("The coroutine 1 started and runs inside ${Thread.currentThread().name}")
        delay(5000)
        println("The coroutine 1 ended")
    }

    //2
    launch {
        println("The coroutine 2 started and runs inside ${Thread.currentThread().name}")
        delay(1000)
        println("The coroutine 2 ended")
        SuspendFunction() //we can call below SuspendFunction here in coroutines only
    }
}

private suspend fun SuspendFunction() {
    delay(2000)
    println("Suspend Function called and runs inside ${Thread.currentThread().name}")
}


//private fun NormalFunction() {
//    SuspendFunction() //show error this fn should called from suspend fun only
//    or coroutine otherwise make NormalFunction as suspend function
//}