/*	Q-5 : Create a calculator using arithmetic and relational operators.	*/

package LabExercise;

import java.util.Scanner;

public class Que_005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;

		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();

		System.out.print("Enter operator (+,-,*,/,%) : ");
		char c = sc.next().charAt(0);

		System.out.print("Enter the second number : ");
		int num2 = sc.nextInt();

		if (c == '+') {
			result = num1 + num2;
			System.out.println(num1 + " " + c + " " + num2 + " = " + result);
		} else if (c == '-') {
			result = num1 - num2;
			System.out.println(num1 + " " + c + " " + num2 + " = " + result);
		} else if (c == '*') {
			result = num1 * num2;
			System.out.println(num1 + " " + c + " " + num2 + " = " + result);
		} else if (c == '/') {
			if (num2 == 0) {
				System.out.println("Division by zero is not possible.");
			} else {
				result = num1 / num2;
				System.out.println(num1 + " " + c + " " + num2 + " = " + result);
			}
		} else if (c == '%') {
			if (num2 == 0) {
				System.out.println("Modulus by zero is not possible.");
			} else {
				result = num1 % num2;
				System.out.println(num1 + " " + c + " " + num2 + " = " + result);
			}
		} else {
			System.out.println("Enter valid operator.");
		}
		
		sc.close();
	}
}
