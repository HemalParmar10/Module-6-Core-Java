/*	Q-25 : Implement runtime polymorphism by overriding methods in the child class.	*/

package LabExercise;

class parent {
	public void display() {
		System.out.println("Function of parent class.");
	}
}

class child extends parent {
	public void display() {
		System.out.println("Function of child class.");
	}
}

class child2 extends parent {
	public void display() {
		System.out.println("Function of child2 class.");
	}
}

public class Que_025 {
	public static void main(String[] args) {
		parent p;

		p = new child();
		p.display();

		p = new child2();
		p.display();
	}
}
