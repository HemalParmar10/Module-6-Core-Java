/*	Q-43 : Create a HashMap to store and retrieve key-value pairs.	*/

package LabExercise;

import java.util.HashMap;
import java.util.Map;

public class Que_043 {
	public static void main(String[] args) {
		// Create a HashMap to store key-value pairs
		HashMap<Integer, String> students = new HashMap<>();

		// Add key-value pairs
		students.put(101, "Alice");
		students.put(102, "Bob");
		students.put(103, "Charlie");
		students.put(104, "Diana");

		// Retrieve a value using key
		System.out.println("Student with ID 102: " + students.get(102));

		// Display all key-value pairs
		System.out.println("\nAll Students:");
		for (Map.Entry<Integer, String> entry : students.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
		}

		// Remove a key-value pair
		students.remove(103);
		System.out.println("\nAfter removing ID 103: " + students);

		// Check if a key or value exists
		System.out.println("Contains key 101? " + students.containsKey(101));
		System.out.println("Contains value 'Diana'? " + students.containsValue("Diana"));
	}
}
