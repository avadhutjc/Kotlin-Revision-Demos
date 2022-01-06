package com.ajc.kotlin_revision_demos// Protected modifier example

// Visible just inside this file
private const val noOfStudents = 1000

// Visible just inside this file
open class Student1() {
    // Visible just inside the com.ajc.kotlin_revision_demos.Student class and its subclass
    protected val newCount = noOfStudents
}

// Visible inside this file
class StudentManager : Student1() {
    // Visible inside the com.ajc.kotlin_revision_demos.StudentManager class
    // newCount is visible because com.ajc.kotlin_revision_demos.StudentManager is a subclass of com.ajc.kotlin_revision_demos.Student
    private val finalCount = newCount
}

/*
// ERROR: protected modifier is not allowed for top level declarations
protected const val com.ajc.kotlin_revision_demos.noOfStudent: Int = 10000 //declare here only private

// ERROR: protected modifier is not allowed for top level declarations
protected class Staff() //declare here private or internal
*/