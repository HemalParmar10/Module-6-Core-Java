/*	Q-8 : Implement a simple menu-driven program using a switch-case.	*/

package LabExercise;

import java.util.Scanner;

public class Que_008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		double totalBill = 0;

		do {
			System.out.println("--Welcome to Java Cafe--");
			System.out.println("1. Burger    - $5.50" + "\n2. Pizza     - $8.00" + "\n3. Sandwich  - $4.00"
					+ "\n4. Coffee    - $2.50" + "\n5. Checkout & Exit");
			System.out.print("\nEnter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				totalBill += 5.50;
				System.out.println("Burger added to your order.\n");
				break;

			case 2:
				totalBill += 8.00;
				System.out.println("Pizza added to your order.\n");
				break;

			case 3:
				totalBill += 4.00;
				System.out.println("Sandwich added to your order.\n");
				break;

			case 4:
				totalBill += 2.50;
				System.out.println("Coffee added to your order.\n");
				break;

			case 5:
				System.out.println("\n=== Checkout ===");
				System.out.println("Your total bill: $" + totalBill);
				System.out.println("Thank you for visiting Java Cafe!");
				break;

			default:
				System.out.println("Invalid choice! Please choose 1-5.\n");
			}

		} while (choice != 5);
		sc.close();
	}
}
