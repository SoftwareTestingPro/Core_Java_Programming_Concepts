//Constructors in Java are special methods used to initialize objects. 
//They have the same name as the class and do not have a return type.
//Constructors are called when an object of a class is created.
//There are two types of constructors in Java: Default Constructor | Parameterized Constructor
//You can have multiple constructors in a class with different parameter lists. This is known as constructor overloading.
//Constructors do not have a return type.
//The name of the constructor must be the same as the class name.
//Constructors can be overloaded.
//If no constructor is defined, the Java compiler provides a default constructor.

package com.qa.JavaProgramming.OOPS;

import org.testng.annotations.Test;

public class Constructor {
    int x;
    int y;
    String name;

    // Default constructor
    public Constructor() {
        x = 0;
        y = 0;
        name = "Unknown";
    }

    // Parameterized constructor with two parameters
    public Constructor(int x, int y) {
        this.x = x;
        this.y = y;
        name = "Unknown";
    }

    // Parameterized constructor with three parameters
    public Constructor(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    @Test
    public void constructorWithOverloading() {
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor(10, 20);
        Constructor obj3 = new Constructor(30, 40, "Example");

        System.out.println("obj1 -> x: " + obj1.x + ", y: " + obj1.y + ", name: " + obj1.name);
        // Output: obj1 -> x: 0, y: 0, name: Unknown

        System.out.println("obj2 -> x: " + obj2.x + ", y: " + obj2.y + ", name: " + obj2.name);
        // Output: obj2 -> x: 10, y: 20, name: Unknown

        System.out.println("obj3 -> x: " + obj3.x + ", y: " + obj3.y + ", name: " + obj3.name);
        // Output: obj3 -> x: 30, y: 40, name: Example
    }
}
