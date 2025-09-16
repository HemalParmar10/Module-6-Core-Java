/*	Q-16 : Write a program demonstrating single inheritance.	*/

package LabExercise;

class base {
	public void display() {
		System.out.println("Function of Base class.");
	}
}

class derived extends base {
	public void show() {
		System.out.println("Function of Derived class.");
	}
}

public class Que_016 {
	public static void main(String[] args) {
		derived d1 = new derived();
		d1.display();
		d1.show();
	}
}
