/*	Q-44 : Write a program to read input from the console using Scanner.	*/

package LabExercise;

import java.util.Scanner;

public class Que_044 {
	public static void main(String[] args) {
		// Create Scanner object to read from console
		Scanner sc = new Scanner(System.in);

		// Reading a string
		System.out.print("Enter your name: ");
		String name = sc.nextLine();

		// Reading an integer
		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		// Reading a double
		System.out.print("Enter your GPA: ");
		double gpa = sc.nextDouble();

		// Display the input
		System.out.println("\n--- User Details ---");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("GPA: " + gpa);

		// Close the scanner
		sc.close();
	}
}
