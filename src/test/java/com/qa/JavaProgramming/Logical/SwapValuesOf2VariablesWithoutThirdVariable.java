package com.qa.JavaProgramming.Logical;

import org.testng.annotations.Test;

public class SwapValuesOf2VariablesWithoutThirdVariable {

	@Test
	public void swapValuesOf2VariablesWithoutThirdVariable() {
		int a = 10;
		int b = 20;
		System.out.println("Initial value of a is:" + a);
		System.out.println("Initial value of b is:" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Swapped value of a is:" + a);
		System.out.println("Swapped value of b is:" + b);
	}
}