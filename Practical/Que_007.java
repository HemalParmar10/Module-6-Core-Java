/*	Q-7 : Write a program to find if a number is even or odd using an if-else statement.	*/

package LabExercise;

import java.util.Scanner;

public class Que_007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Number is even.");
		} else {
			System.out.println("Number is odd.");
		}
		sc.close();
	}
}
