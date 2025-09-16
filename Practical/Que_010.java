/*	Q-10 : Create a class Student with attributes (name, age) and a method to display the details.*/

package LabExercise;

class Student {
	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Name of student is : " + name);
		System.out.println("Age of student is : " + age);
	}
}

public class Que_010 {
	public static void main(String[] args) {
		Student s = new Student("Mike", 23);
		s.display();
	}
}
