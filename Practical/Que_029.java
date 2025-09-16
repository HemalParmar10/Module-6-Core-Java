/*	Q-29 : Implement an interface for a real-world example, such as a payment gateway.	*/

package LabExercise;

interface PaymentGateway {
	void pay(double amount);
}

class CreditCardPayment implements PaymentGateway {
	public void pay(double amount) {
		System.out.println("Paid $" + amount + " using Credit Card.");
	}
}

class UPIPayment implements PaymentGateway {
	public void pay(double amount) {
		System.out.println("Paid $" + amount + " using UPI.");
	}
}

class NetBanking implements PaymentGateway {
	public void pay(double amount) {
		System.out.println("Paid $" + amount + " using NetBanking.");
	}
}

public class Que_029 {
	public static void main(String[] args) {
		PaymentGateway p;

		p = new CreditCardPayment();
		p.pay(250.75);

		p = new UPIPayment();
		p.pay(500.25);

		p = new NetBanking();
		p.pay(1040.50);
	}
}
