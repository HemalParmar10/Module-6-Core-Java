/*	Q-22 : Create a program to reverse a string and check for palindromes.	*/

package LabExercise;

public class Que_022 {
	public static void main(String[] args) {
		String str = "madam"; // You can change this string
		String reversed = "";

		// Reverse the string
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}

		// Display the reversed string
		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + reversed);

		// Check if palindrome
		if (str.equals(reversed)) {
			System.out.println(str + " is a Palindrome.");
		} else {
			System.out.println(str + " is NOT a Palindrome.");
		}
	}
}
