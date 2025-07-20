package com.qa.JavaProgramming.Arrays;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.Collections;

public class Array{

	@Test
	public void NumberArrayExample() {
		// Declare and initialize an array of integers
		Integer[] numbers = { 1, 2, 3, 4, 5 };

		// Print the array elements
		System.out.println("Array elements:");
		for (int number : numbers) {
			System.out.println(number);
		}
		
		Arrays.sort(numbers);
        System.out.println("Ascending Sorted Array: " + Arrays.toString(numbers));
        
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Sorted Array: " + Arrays.toString(numbers));

		// Calculate the sum of array elements
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		System.out.println("Sum of array elements: " + sum);

		// Find the maximum element in the array
		int max = numbers[0];
		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
		}
		System.out.println("Maximum element: " + max);

		// Find the minimum element in the array
		int min = numbers[0];
		for (int number : numbers) {
			if (number < min) {
				min = number;
			}
		}
		System.out.println("Minimum element: " + min);

		// Modify an element in the array
		numbers[2] = 10; // Changing the third element (index 2) to 10
		System.out.println("Array after modification:");
		for (int number : numbers) {
			System.out.println(number);
		}
	}

	@Test
	public void StringArrayExample() {
		// Declare and initialize an array of strings
		String[] names = { "Diana", "Bob", "Charlie", "Eve", "Alice" };

		// Print the array elements
		System.out.println("Array elements:");
		for (String name : names) {
			System.out.println(name);
		}
		
		Arrays.sort(names);
        System.out.println("Ascending Sorted Array: " + Arrays.toString(names));
        
        Arrays.sort(names, Collections.reverseOrder());
        System.out.println("Descending Sorted Array: " + Arrays.toString(names));

		// Find the longest string in the array
		String longestName = names[0];
		for (String name : names) {
			if (name.length() > longestName.length()) {
				longestName = name;
			}
		}
		System.out.println("Longest name: " + longestName);

		// Find the shortest string in the array
		String shortestName = names[0];
		for (String name : names) {
			if (name.length() < shortestName.length()) {
				shortestName = name;
			}
		}
		System.out.println("Shortest name: " + shortestName);

		// Concatenate all strings in the array
		StringBuilder concatenatedNames = new StringBuilder();
		for (String name : names) {
			concatenatedNames.append(name).append(" ");
		}
		System.out.println("Concatenated names: " + concatenatedNames.toString().trim());

		// Modify an element in the array
		names[2] = "Chuck"; // Changing the third element (index 2) to "Chuck"
		System.out.println("Array after modification:");
		for (String name : names) {
			System.out.println(name);
		}
	}
	
	@Test
	public void CharArrayExample() {
	        // Declare and initialize an array of characters
	        char[] letters = {'A', 'B', 'C', 'D', 'E'};

	        // Print the array elements
	        System.out.println("Array elements:");
	        for (char letter : letters) {
	            System.out.println(letter);
	        }

	        // Convert all characters to lowercase
	        System.out.println("Array elements in lowercase:");
	        for (char letter : letters) {
	            System.out.println(Character.toLowerCase(letter));
	        }

	        // Find if the array contains a specific character
	        char searchChar = 'C';
	        boolean found = false;
	        for (char letter : letters) {
	            if (letter == searchChar) {
	                found = true;
	                break;
	            }
	        }
	        System.out.println("Array contains '" + searchChar + "': " + found);

	        // Count the number of vowels in the array
	        int vowelCount = 0;
	        for (char letter : letters) {
	            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' ||
	                letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
	                vowelCount++;
	            }
	        }
	        System.out.println("Number of vowels: " + vowelCount);

	        // Modify an element in the array
	        letters[2] = 'Z'; // Changing the third element (index 2) to 'Z'
	        System.out.println("Array after modification:");
	        for (char letter : letters) {
	            System.out.println(letter);
	        }
	    }
	}
