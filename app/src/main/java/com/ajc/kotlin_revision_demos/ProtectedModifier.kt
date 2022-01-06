package com.ajc.kotlin_revision_demos

private val noOfStudent1 = 100;

private open class ProtectedModifier {
    protected val store = noOfStudent1

}

private class Student : ProtectedModifier() {
    protected val StoreFromProtected = noOfStudent1
    fun Ac(int: Int) {
        print("Yes")
    }
}

private abstract class Over {
    protected abstract fun OverridingProtected()
}

private open class StudentOver : Over() {
    override fun OverridingProtected() {
        TODO("Not yet implemented")
    }
}
/*
When we are overriding a protected method then the visibility of
the overridden method is also protected and it will be visible inside that
particular file.
 */

private class Abc : StudentOver() {
    override fun OverridingProtected() {
        super.OverridingProtected()
    }
}


fun main() {
    Student().Ac(123)
}

interface FirstTime {
    fun Ac(int: Int) {
        print("Yes")
    }

    fun CoolNot(int: Int)
}

interface dj : FirstTime

private class Teacher : FirstTime {
    override fun Ac(int: Int) {
        super.Ac(int)
    }

    override fun CoolNot(int: Int) {

    }

}

//see class com.ajc.kotlin_revision_demos.Student.kt for more understanding in deep
/*
// Protected modifier example

// Visible just inside this file
private const val com.ajc.kotlin_revision_demos.noOfStudents = 1000

// Visible just inside this file
open private class com.ajc.kotlin_revision_demos.Student() {

    // Visible just inside the com.ajc.kotlin_revision_demos.Student class and its subclass
    protected val newCount = com.ajc.kotlin_revision_demos.noOfStudents
}

// Visible inside this file
private class com.ajc.kotlin_revision_demos.StudentManager : com.ajc.kotlin_revision_demos.Student() {
    // Visible inside the com.ajc.kotlin_revision_demos.StudentManager class
    // newCount is visible because com.ajc.kotlin_revision_demos.StudentManager is a subclass of com.ajc.kotlin_revision_demos.Student
    private val finalCount = newCount
}

// ERROR: protected modifier is not allowed for top level declarations
protected const val com.ajc.kotlin_revision_demos.noOfStudent = 10000

// ERROR: protected modifier is not allowed for top level declarations
protected class Staff()*/


