package com.qa.JavaProgramming.Collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.testng.annotations.Test;

public class ConcurrentHashmap {
	
	@Test
    public void test() {
        ConcurrentHashMap<String, String> employees = new ConcurrentHashMap<>();

        // Add entries to the ConcurrentHashMap
        employees.put("John Doe", "Developer");
        employees.put("Jane Smith", "Designer");
        employees.put("Mike Johnson", "Manager");

        // Retrieve a value based on a key
        String position = employees.get("John Doe");
        System.out.println("John Doe's position: " + position);

        // Iterate over the entries in the ConcurrentHashMap
        System.out.println("Employee List:");
        for (Map.Entry<String, String> entry : employees.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Position: " + entry.getValue());
        }

        // Check if a key exists in the ConcurrentHashMap
        boolean hasMike = employees.containsKey("Mike Johnson");
        System.out.println("Does Mike Johnson exist in the map? " + hasMike);

        // Check if a value exists in the ConcurrentHashMap
        boolean isDesigner = employees.containsValue("Designer");
        System.out.println("Is there a Designer in the map? " + isDesigner);

        // Remove an entry from the ConcurrentHashMap
        employees.remove("Jane Smith");
        System.out.println("Jane Smith removed.");

        // Print the updated ConcurrentHashMap
        System.out.println("Updated Employee List:");
        for (Map.Entry<String, String> entry : employees.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Position: " + entry.getValue());
        }
    }
}