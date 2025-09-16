/*	Q-33 : Implement multiple catch blocks for different types of exceptions.	*/

package LabExercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Que_033 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter first number for division : ");
			int num1 = sc.nextInt();
			System.out.print("Enter second number for division : ");
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println(num1 + "/" + num2 + " = " + result);
		} catch (ArithmeticException e) {
			System.out.println("Division by zero is not allowed.");
		} catch (InputMismatchException e) {
			System.out.println("Division by string/characters is not allowed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
