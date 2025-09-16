/*	Q-19 : Write a program to create and initialize an object using a parameterized constructor.	*/

package LabExercise;

class person {
	String name;
	int age;

	// Parameterized Constructor
	person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Name of person : " + name + ", and Age : " + age);
	}
}

public class Que_019 {
	public static void main(String[] args) {
		person p1 = new person("Hemal", 21);
		person p2 = new person("Mike", 23);

		p1.display();
		p2.display();
	}
}
