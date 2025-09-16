package LabExercise;

import core.Assignment31;

public class TestDiffPackage31 {
	public static void main(String[] args) {
		Assignment31 a = new Assignment31();

        System.out.println("Accessing from DIFFERENT package:");
        System.out.println(a.publicName);     // accessible (public)
        // System.out.println(a.protectedAge); // NOT accessible (only via inheritance)
        // System.out.println(a.defaultCity);  // NOT accessible (default)
        // System.out.println(a.privateSalary);// NOT accessible (private)
	}
}
