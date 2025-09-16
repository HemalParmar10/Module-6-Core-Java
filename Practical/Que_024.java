/*	Q-24 : Write a program that demonstrates inheritance using extends keyword.	*/

package LabExercise;
class abc{
	public void display() {
		System.out.println("Function of abc class.");
	}
}
class pqr extends abc{
	public void show() {
		System.out.println("Function of pqr class.");
	}
}
public class Que_024 {
	public static void main(String[] args) {
		pqr p = new pqr();
		p.display();
		p.show();
	}
}
