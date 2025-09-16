/*	Q-9 : Write a program to display the Fibonacci series using a loop.	*/

package LabExercise;

import java.util.Scanner;

public class Que_009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of terms: ");
		int n = sc.nextInt();

		int first = 0, second = 1;

		System.out.println("Fibonacci Series up to " + n + " terms:");

		for (int i = 1; i <= n; i++) {
			System.out.print(first + " ");

			// Generate next term
			int next = first + second;
			first = second;
			second = next;
		}
		sc.close();
	}
}
