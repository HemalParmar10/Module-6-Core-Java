/*	Q-18 : Implement method overriding to show polymorphism in action.	*/

package LabExercise;

class Animals {
	public void sound() {
		System.out.println("Animals makes sounds.");
	}
}

class Dogs extends Animals {
	public void sound() {
		System.out.println("Dog barks.");
	}
}

class Cats extends Animals {
	public void sound() {
		System.out.println("Cat meows.");
	}
}

public class Que_018 {
	public static void main(String[] args) {
		// Polymorphism : parent reference → child objects
		Animals a;

		a = new Dogs();
		a.sound();

		a = new Cats();
		a.sound();
	}
}
