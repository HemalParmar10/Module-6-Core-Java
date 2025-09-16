/*	Q-15 : Create a class with static variables and methods to demonstrate their use.	*/

package LabExercise;

class ABC {
	static int i = 34;

	public static int add(int num1, int num2) {
		return num1 + num2;
	}
}

public class Que_015 {
	public static void main(String[] args) {
		
		// We can use static variables and methods direct by class name.
		System.out.println("Static int i : " + ABC.i);
		System.out.println("Sum of two integer with static method : " + ABC.add(15, 30));
	}
}
