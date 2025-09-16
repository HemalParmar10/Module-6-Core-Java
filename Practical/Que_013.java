/*	Q-13 : Write a program to find the maximum of three numbers using a method.	*/

package LabExercise;

import java.util.Scanner;

class maximum {
	public int findMax(int a, int b, int c) {
		int max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		return max;
	}
}

public class Que_013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first value : ");
		int num1 = sc.nextInt();

		System.out.println("Enter the second value : ");
		int num2 = sc.nextInt();

		System.out.println("Enter the third value : ");
		int num3 = sc.nextInt();

		maximum M = new maximum();
		int max = M.findMax(num1, num2, num3);

		System.out.println("Max value is : " + max);
		sc.close();
	}
}
