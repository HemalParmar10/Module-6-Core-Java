/*	Q-20 : Demonstrate constructor overloading by passing different types of parameters.	*/

package LabExercise;

class Employees {
	String name;
	int age;

	// Default constructor
	Employees() {
		System.out.println("Default constructor is called.");
	}

	// Constructor with one parameter (String)
	Employees(String name) {
		this.name = name;
		System.out.println("Name : " + name);
	}

	// Constructor with one parameter (Integer)
	Employees(int age) {
		this.age = age;
		System.out.println("Age : " + age);
	}

	// Constructor with two parameters (String + Integer)
	Employees(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Name : " + name + ", Age : " + age);
	}
}

public class Que_020 {
	public static void main(String[] args) {
		
		Employees e1 = new Employees();
		Employees e2 = new Employees("Mike");
		Employees e3 = new Employees(23);
		Employees e4 = new Employees("John", 25);
	}
}
