/*	Q-14 : Implement method overloading by creating methods for different data types.	*/

package LabExercise;

class calc {
	public int add(int i1, int i2) {
		return i1 + i2;
	}

	public double add(double d1, double d2) {
		return d1 + d2;
	}

	public String add(String s1, String s2) {
		return s1 + s2;
	}
}

public class Que_014 {
	public static void main(String[] args) {
		calc c1 = new calc();
		
		System.out.println(c1.add(12, 15));
		System.out.println(c1.add(15.2, 12.13));
		System.out.println(c1.add("Hello ", "JAVA."));
	}
}
