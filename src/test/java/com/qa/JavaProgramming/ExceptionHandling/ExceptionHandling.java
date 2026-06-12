package com.qa.JavaProgramming.ExceptionHandling;

import org.testng.annotations.Test;

public class ExceptionHandling {

	@Test
    public void test() {
        try {
            // Code that might throw an exception
            int[] numbers = {1, 2, 3};
            int result = divideNumbers(numbers, 0); // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle specific exception
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle another specific exception
            System.out.println("Error: Array index out of bounds.");
        } catch (Exception e) {
            // Handle any other exception
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Code that always executes regardless of whether an exception occurred or not
            System.out.println("Execution completed.");
        }
    }

    // Method that might throw an exception
    public static int divideNumbers(int[] numbers, int divisor) {
        // This line may cause an ArithmeticException if divisor is 0
        int divisionResult = 10 / divisor;
        
        // This line may cause an ArrayIndexOutOfBoundsException if index is out of bounds
        int number = numbers[5];
        
        return divisionResult;
    }
}
