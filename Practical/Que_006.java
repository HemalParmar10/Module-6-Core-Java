/*	Q-6 : Demonstrate type casting (explicit and implicit).	*/

package LabExercise;

public class Que_006 {
	public static void main(String[] args) {
		// implicit type-casting
		short s = 1000;
		int i = s;
		System.out.println("int i : " + i);

		// explicit type-cating
		double d = 1542165;
		int i1 = (int) d;
		System.out.println("int i1 : " + i1);
	}
}
