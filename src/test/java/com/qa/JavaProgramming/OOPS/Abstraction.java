//Abstraction in Java is a fundamental concept of Object-Oriented Programming (OOP)
//It focuses on hiding the implementation details and showing only the essential features of an object. 
//It helps in reducing complexity and allows the programmer to focus on the interactions between objects.

package com.qa.JavaProgramming.OOPS;

import org.testng.annotations.Test;

//Abstract class
abstract class Animal {
	// Abstract method (does not have a body)
	public abstract void sound();

	// Regular method
	public void sleep() {
		System.out.println("This animal is sleeping.");
	}
}

//Subclass (inherits from Animal)
class Dog extends Animal {
	public void sound() {
		System.out.println("The dog barks.");
	}
}

public class Abstraction {
	
	@Test
	public void abstraction() {
		Dog myDog = new Dog(); // Create a Dog object
		myDog.sound(); // Call the abstract method
		myDog.sleep(); // Call the regular method
	}
}