//Array
//🔹 What it is:
//A fixed-size, ordered collection of elements.
//
//Stored in contiguous memory locations.
//
//Accessed via index.
//
//🧠 Use When:
//You know the exact number of elements ahead of time.
//
//You need fast access via index (O(1)).
//
//❌ Limitations:
//Cannot dynamically grow/shrink.
//
//Not flexible for insertions/deletions.
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
		numbers.add(5);
		numbers.add(6);
		numbers.add(1);

		// Print the elements of the ArrayList
		System.out.println("ArrayList: " + numbers);
		
		// Sort the elements of the ArrayList
		Collections.sort(numbers);
		System.out.println("Ascending Sorted ArrayList: " + numbers);
		
		// Sort the elements of the ArrayList
		Collections.reverse(numbers);
		System.out.println("Descending Sorted ArrayList: " + numbers);

		// Print the size of the ArrayList
		System.out.println("Size of ArrayList: " + numbers.size());

		// Access 1st element
		System.out.println("First element: " + numbers.get(0));

		// Remove an element
		numbers.remove(1); // Removes the element at index 1

		// Print the elements of the ArrayList after removal
		System.out.println("ArrayList after removal: " + numbers);
	}
}