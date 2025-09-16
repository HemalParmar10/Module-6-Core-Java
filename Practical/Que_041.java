/*	Q-41 : Write a program that demonstrates the use of an ArrayList and LinkedList.	*/

package LabExercise;

import java.util.ArrayList;
import java.util.LinkedList;

public class Que_041 {
	public static void main(String[] args) {
		// ----------------- ArrayList Example -----------------
		ArrayList<String> arrayList = new ArrayList<>();

		// Adding elements
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");

		// Accessing elements
		System.out.println("ArrayList Elements:");
		for (String fruit : arrayList) {
			System.out.println(fruit);
		}

		// Removing element
		arrayList.remove("Banana");
		System.out.println("After removing Banana: " + arrayList);

		// ----------------- LinkedList Example -----------------
		LinkedList<String> linkedList = new LinkedList<>();

		// Adding elements
		linkedList.add("Dog");
		linkedList.add("Cat");
		linkedList.add("Elephant");

		// Adding at first and last
		linkedList.addFirst("Tiger");
		linkedList.addLast("Lion");

		// Accessing elements
		System.out.println("\nLinkedList Elements:");
		for (String animal : linkedList) {
			System.out.println(animal);
		}

		// Removing elements
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println("After removing first and last: " + linkedList);
	}
}
