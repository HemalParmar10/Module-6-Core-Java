/*	Q-11 : Create multiple constructors in a class and demonstrate constructor overloading.	*/

package LabExercise;

class Students {
	String name;
	int age;

	Students() {
		System.out.println("Default constructor.");
	}

	Students(String name) {
		this.name = name;
		System.out.println("Student name = " + name);
	}

	Students(int age) {
		this.age = age;
		System.out.println("Student age = " + age);
	}

	Students(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Name = " + name + ", Age = " + age);
	}
}

public class Que_011 {
	public static void main(String[] args) {
		Students s1 = new Students();
		Students s2 = new Students("Hemal");
		Students s3 = new Students(21);
		Students s4 = new Students("Mike", 23);
	}
}
