package core;

public class Assignment31 {
	public String publicName = "Mike Jones";
	protected int protectedAge = 25;
	String defaultCity = "New york";
	private double privateSalary = 50000.0;

	public void showDetails() {
		System.out.println("Inside Assignment31 class:");
		System.out.println("publicName = " + publicName);
		System.out.println("protectedAge = " + protectedAge);
		System.out.println("defaultCity = " + defaultCity);
		System.out.println("privateSalary = " + privateSalary);
	}
	
	public static void main(String[] args) {
		Assignment31 a1= new Assignment31();
		a1.showDetails();
	}
}
