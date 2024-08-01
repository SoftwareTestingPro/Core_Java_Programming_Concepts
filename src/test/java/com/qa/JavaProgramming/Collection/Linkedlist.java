package com.qa.JavaProgramming.Collection;

import java.util.LinkedList;
import org.testng.annotations.Test;

public class Linkedlist {
	
	@Test
	public void linkedlist() {
		// Create a LinkedList instance
		LinkedList<String> linkedList = new LinkedList<>();

		// Add elements to the LinkedList
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");

		// Print the LinkedList
		System.out.println("LinkedList: " + linkedList);

		// Add an element at the beginning
		linkedList.addFirst("First");

		// Add an element at the end
		linkedList.addLast("Last");

		// Print the LinkedList after adding elements at the beginning and end
		System.out.println("LinkedList after adding elements: " + linkedList);

		// Access elements
		String firstElement = linkedList.getFirst();
		String lastElement = linkedList.getLast();
		System.out.println("First element: " + firstElement);
		System.out.println("Last element: " + lastElement);

		// Remove elements
		linkedList.removeFirst(); // Removes the first element
		linkedList.removeLast(); // Removes the last element
		linkedList.remove(2); // Removes the element at index 2

		// Print the LinkedList after removals
		System.out.println("LinkedList after removals: " + linkedList);

		// Iterate through the LinkedList
		System.out.println("Iterating through LinkedList:");
		for (String element : linkedList) {
			System.out.println(element);
		}
	}
}