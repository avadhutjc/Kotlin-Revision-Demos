package com.ajc.kotlin_revision_demos

class Person {
    lateinit var name: String
    fun initializeName() {
        println(this::name.isInitialized)
        name = "MindOrks" // initializing name
        println(this::name.isInitialized)
    }

}

fun main() {
    Person().initializeName()
}




/*
'lateinit' modifier is allowed only on mutable properties

    lateinit val name: String

 */