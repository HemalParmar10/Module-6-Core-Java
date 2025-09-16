/*	Q-26 : Use the super keyword to call the parent class constructor and methods.	*/

package LabExercise;

class Parent {
	Parent() {
		System.out.println("Default constructor of Parent class.");
	}

	public void display() {
		System.out.println("Function of Parent class.");
	}
}

class Child extends Parent {
	Child() {
		super();
		System.out.println("Default constructor of Child class.");
	}

	public void show() {
		super.display();
		System.out.println("Function of Child class.");
	}
}

public class Que_026 {
	public static void main(String[] args) {
		Child c = new Child();
		c.show();
	}
}
