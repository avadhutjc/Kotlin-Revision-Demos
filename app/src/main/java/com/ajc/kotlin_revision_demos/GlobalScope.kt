package com.ajc.kotlin_revision_demos

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {
    GlobalScope.launch {
        delay(2000)
        println("Which Thread Global Scope is Launching ${Thread.currentThread().name}")
    }
    delay(3000)
    println("Where Global Scope is launching after delay of 3 sec ${Thread.currentThread().name}")
}