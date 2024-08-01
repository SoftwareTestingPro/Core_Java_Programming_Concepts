package com.qa.JavaProgramming.Logical;

import java.util.Random;

import org.testng.annotations.Test;

public class GenerateRandomNumbers {
	
	@Test
	public void generateRandomNumbers() {
		// Define the range
        int min = 10; // Minimum value (inclusive)
        int max = 50; // Maximum value (inclusive)

        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random integer within the specified range
        int randomNumber = random.nextInt((max - min) + 1) + min;

        // Print the random number
        System.out.println("Random Integer between " + min + " and " + max + ": " + randomNumber);
	}
}