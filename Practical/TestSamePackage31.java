package core;

public class TestSamePackage31 {
	public static void main(String[] args) {
		Assignment31 a = new Assignment31();

		System.out.println("Accessing from SAME package:");
		System.out.println(a.publicName); 		// accessible
		System.out.println(a.protectedAge); 	// accessible (same package)
		System.out.println(a.defaultCity); 		// accessible (default)
		// System.out.println(a.privateSalary); // NOT accessible
	}
}
