package com.ajc.kotlin_revision_demos;

public class Parent {

    public Parent() {
        System.out.println("Parent constructor called");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor called");
    }
}

class classTestDrive {
    public static void main(String[] args) {
        Child child = new Child();  //true when obj of child class is created constructor of parent class is called first.
//        Parent child = new Parent();  //true
//        Child child1 = new Parent(); //error parent cannot extend child
//        Child child2 = new Child(); //true
    }
}
/*
Parent constructor called
Child Constructor called

Process finished with exit code 0
 */