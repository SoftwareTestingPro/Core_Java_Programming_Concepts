//HashTable is inherently synchronized, slower than Hashmap
//HashTable doesn't allow any null keys or values

package com.qa.JavaProgramming.Collection;

import java.util.Hashtable;
import org.testng.annotations.Test;

public class HashTable {

	@Test
	public void hashtable() {
		// Create a Hashtable instance
		Hashtable<String, Integer> hashtable = new Hashtable<>();

		// Add key-value pairs to the Hashtable
		hashtable.put("One", 1);
		hashtable.put("Two", 2);
		hashtable.put("Three", 3);

		// Print the Hashtable
		System.out.println("Hashtable: " + hashtable);

		// Access a value using a key
		int value = hashtable.get("Two");
		System.out.println("Value for key 'Two': " + value);

		// Check if a key exists
		boolean containsKey = hashtable.containsKey("Three");
		System.out.println("Hashtable contains key 'Three': " + containsKey);

		// Check if a value exists
		boolean containsValue = hashtable.containsValue(4);
		System.out.println("Hashtable contains value 4: " + containsValue);

		// Remove a key-value pair
		hashtable.remove("One");
		System.out.println("Hashtable after removing key 'One': " + hashtable);

		// Iterate through the Hashtable
		System.out.println("Iterating through Hashtable:");
		for (String key : hashtable.keySet()) {
			System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
		}
	}
}