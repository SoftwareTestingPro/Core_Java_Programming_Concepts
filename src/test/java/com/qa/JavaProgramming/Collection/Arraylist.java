//The ArrayList class is a resizable array
//The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified

package com.qa.JavaProgramming.Collection;

import java.util.*;
import org.testng.annotations.Test;

public class Arraylist{
	
	@Test
	public void arraylist() {
		// Initialize ArrayList with a capacity of 10
		ArrayList<Integer> numbers = new ArrayList<>(10);

		// Add elements to the ArrayList
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		// Print the elements of the ArrayList
		System.out.println("ArrayList: " + numbers);

		// Print the size of the ArrayList
		System.out.println("Size of ArrayList: " + numbers.size());

		// Access elements
		System.out.println("First element: " + numbers.get(0));

		// Remove an element
		numbers.remove(1); // Removes the element at index 1

		// Print the elements of the ArrayList after removal
		System.out.println("ArrayList after removal: " + numbers);
	}
}