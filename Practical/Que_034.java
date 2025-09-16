/*	Q-34 : Create a custom exception class and use it in your program.	*/

package LabExercise;

//Custom Exception Class
class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

class Bank {
	private double balance;

	Bank(double balance) {
		this.balance = balance;
	}

	// Method to withdraw money
	public void withdraw(double amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("Withdrawal failed! Balance is too low.");
		} else {
			balance -= amount;
			System.out.println("Withdrawal successful! Remaining balance = " + balance);
		}
	}
}

public class Que_034 {
	public static void main(String[] args) {
		Bank account = new Bank(1000);
		try {
			account.withdraw(1500);	// Will throw custom exception
			account.withdraw(500);	// Will execute only if no exception
		} catch (InsufficientBalanceException e) {
			System.out.println("Custom Exception caught: " + e.getMessage());
		} finally {
			System.out.println("Transaction complete.");
		}
	}
}
