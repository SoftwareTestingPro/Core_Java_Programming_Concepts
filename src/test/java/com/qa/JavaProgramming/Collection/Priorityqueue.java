//PriorityQueue doesn’t permit null
//We can’t create a PriorityQueue of Objects that are non-comparable

package com.qa.JavaProgramming.Collection;

import java.util.PriorityQueue;
import org.testng.annotations.Test;

public class Priorityqueue {
	
	@Test
    public void priorityqueue() {
        // Create a PriorityQueue instance
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(5);
        priorityQueue.add(15);

        // Print the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Access the head of the PriorityQueue
        int head = priorityQueue.peek();
        System.out.println("Head of the PriorityQueue: " + head);

        // Remove elements from the PriorityQueue
        int removedElement = priorityQueue.poll();
        System.out.println("Removed element: " + removedElement);

        // Print the PriorityQueue after removal
        System.out.println("PriorityQueue after removal: " + priorityQueue);

        // Iterate through the PriorityQueue
        System.out.println("Iterating through PriorityQueue:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}