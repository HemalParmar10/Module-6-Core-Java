/*	Q-28 : Write a program that implements multiple interfaces in a single class.	*/

package LabExercise;

interface inter1 {
	void interface1();

	public static void interface11() {
		System.out.println("Function of inter1.");
	}
}

interface inter2 {
	void interface2();

	public static void interface22() {
		System.out.println("Function of inter2.");
	}
}

class interCall implements inter1, inter2 {
	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		System.out.println("Interface 1.");
	}

	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		System.out.println("Interface 2.");
	}
}

public class Que_028 {
	public static void main(String[] args) {
		interCall i = new interCall();
		i.interface1();
		i.interface2();

		inter1.interface11();
		inter2.interface22();
	}
}
