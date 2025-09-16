/*	Q-27 : Create an abstract class and implement its methods in a subclass.	*/

package LabExercise;

abstract class Vehicle {
	abstract public void Start();

	abstract public void fuelType();

	public void Stop() {
		System.out.println("Vehicle has stopped.");
	}
}

class Car extends Vehicle {
	@Override
	public void Start() {
		// TODO Auto-generated method stub
		System.out.println("Car starts with the key.");
	}

	@Override
	public void fuelType() {
		// TODO Auto-generated method stub
		System.out.println("Car uses petrol.");
	}
}

public class Que_027 {
	public static void main(String[] args) {
		Car c = new Car();
		c.Start();
		c.fuelType();
		c.Stop();
	}
}
