package com.ajc.kotlin_revision_demos//Demo of private modifier/ access modifier
/*
Private Modifier
If you are using the private modifier in the declaration then it will be visible inside
that particular class or file containing the declaration.
 */

private const val noOfStudent = 1000

// Visible just inside this file
private class PrivateModifier {
    fun cool() {
        println("Yes Done")
    }

    private val newCount = noOfStudent
    //com.ajc.kotlin_revision_demos.noOfStudent variable can be access only inside class
}

//private val newCount2 = newCount
//We cannot assign newCount variable outside particular block
/// ERROR: newCount is not accessible outside the com.ajc.kotlin_revision_demos.Student class
fun main() {
    PrivateModifier().run {
        println(noOfStudent)
    }
    PrivateModifier().cool()
}