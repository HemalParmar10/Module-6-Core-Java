/*	Q-17 : Create a class hierarchy and demonstrate multilevel inheritance.	*/

package LabExercise;

class Animal {
	public void eat() {
		System.out.println("Animals eat food.");
	}
}

class Mammal extends Animal {
	public void walk() {
		System.out.println("Mammals can walk.");
	}
}

class Dog extends Mammal {
	public void bark() {
		System.out.println("Dog barks.");
	}
}

public class Que_017 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.walk();
		d.bark();
	}
}
