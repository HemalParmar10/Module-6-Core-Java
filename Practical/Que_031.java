/*	Q-31 : Demonstrate the use of different access modifiers within the same package and across different packages.	*/

package LabExercise;

import core.Assignment31;

public class Que_031 extends Assignment31 {

	public void display() {
		System.out.println("Accessing from SUBCLASS in different package:");
		System.out.println(publicName); 		// accessible
		System.out.println(protectedAge); 		// accessible (via inheritance)
		// System.out.println(defaultCity); 	// NOT accessible (default)
		// System.out.println(privateSalary); 	// NOT accessible (private)
	}

	public static void main(String[] args) {
		Que_031 Q = new Que_031();
		Q.display();
	}
}
