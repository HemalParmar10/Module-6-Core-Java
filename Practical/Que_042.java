/*	Q-42 : Implement a program using HashSet to remove duplicate elements from a list.	*/

package LabExercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Que_042 {
	public static void main(String[] args) {
		// List with duplicate elements
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Apple"); // duplicate
		fruits.add("Banana"); // duplicate
		fruits.add("Grapes");

		System.out.println("Original List with Duplicates: " + fruits);

		// Use HashSet to remove duplicates
		HashSet<String> uniqueFruits = new HashSet<>(fruits);

		System.out.println("List after removing duplicates (HashSet): " + uniqueFruits);
	}
}
