/*	Q-35 : Write a program to create and run multiple threads using the Thread class.	*/

package LabExercise;

// Thread-1
class task1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Task1 - Count: " + i);
			try {
				Thread.sleep(1000); // pause for 1 second
			} catch (InterruptedException e) {
				System.out.println("Task1 interrupted");
			}
		}
	}
}

// Thread-2
class task2 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Task2 - Count: " + i);
			try {
				Thread.sleep(2000); // pause for 2 seconds
			} catch (InterruptedException e) {
				System.out.println("Task2 interrupted");
			}
		}
	}
}

public class Que_035 {
	public static void main(String[] args) {
		task1 t1 = new task1();
		task2 t2 = new task2();

		// Start threads
		t1.start();
		t2.start();
	}
}
