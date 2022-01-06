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
    print(name?.length) // ok
    name = null
}

