//HashMap
//🔹 What it is:
//A key-value pair structure.
//
//Backed by a hash table with buckets.
//
//Allows null keys and multiple null values.
//
//🧠 Use When:
//You want fast lookup, insertion, deletion (O(1) average).
//
//You need a dynamic structure to store mappings.
//
//❌ Limitations:
//Not thread-safe.
//
//No guaranteed order of elements.
//
//HashMap is non-synchronized, making it faster than Hashtable
//HashMap lets you have one null key and several null values

package com.qa.JavaProgramming.Collection;

import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;

public class Hashmap {
	
	@Test
	public void hashmap() {
		// Create a HashMap to store employee names and positions
		HashMap<String, String> employees = new HashMap<>();

		// Add entries to the HashMap
		employees.put("John Doe", "Developer");
		employees.put("Jane Smith", "Designer");
		employees.put("Mike Johnson", "Manager");

		// Retrieve a value based on a key
		String position = employees.get("John Doe");
		System.out.println("John Doe's position: " + position);

		// Iterate over the entries in the HashMap
		System.out.println("Employee List:");
		for (Map.Entry<String, String> entry : employees.entrySet()) {
			System.out.println("Name: " + entry.getKey() + ", Position: " + entry.getValue());
		}

		// Check if a key exists in the HashMap
		boolean hasMike = employees.containsKey("Mike Johnson");
		System.out.println("Does Mike Johnson exist in the map? " + hasMike);

		// Check if a value exists in the HashMap
		boolean isDesigner = employees.containsValue("Designer");
		System.out.println("Is there a Designer in the map? " + isDesigner);

		// Remove an entry from the HashMap
		employees.remove("Jane Smith");
		System.out.println("Jane Smith removed.");
		System.out.println("Updated Employee List:");
		for (Map.Entry<String, String> entry : employees.entrySet()) {
			System.out.println("Name: " + entry.getKey() + ", Position: " + entry.getValue());
		}
	}
}