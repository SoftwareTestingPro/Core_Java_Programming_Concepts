//Advantages of Using Encapsulation
//Security: Sensitive data is hidden from the outside world.
//Flexibility: The internal implementation of the class can be changed without affecting other parts of the code that use the class.
//Reusability: Encapsulated code can be easily reused across different parts of an application or in different applications.
//Simplification: Encapsulation simplifies complex systems by reducing the complexity of the interaction between objects.

package com.qa.JavaProgramming.OOPS;

import org.testng.annotations.Test;

public class Encapsulation {
    // Private variables
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize Employee object
    public Encapsulation(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for id
    public int getId() {
        return id;
    }

    // Public setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Public getter for salary
    public double getSalary() {
        return salary;
    }

    // Public setter for salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
    }

    @Test
    public void encapsulation() {
        // Create an Employee object
        Encapsulation emp = new Encapsulation("Alice", 101, 50000);

        // Display initial employee details
        emp.displayEmployeeDetails();

        // Update employee details using setter methods
        emp.setName("Alice Johnson");
        emp.setSalary(55000);

        // Display updated employee details
        System.out.println("\nUpdated Employee Details:");
        emp.displayEmployeeDetails();

        // Attempt to set an invalid salary
        emp.setSalary(-1000); // Output: Salary must be positive.
    }
}