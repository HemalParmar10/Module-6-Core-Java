/*	Q-36 : Implement thread synchronization using synchronized blocks or methods.	*/

package LabExercise;

class Table {
	public synchronized void printTable(int num) throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * num);
			Thread.sleep(2000);
		}
	}
}

class MyTable extends Thread {
	Table t;

	MyTable(Table t) {
		this.t = t;
	}

	public void run() {
		try {
			t.printTable(5);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class MyNewTable extends Thread {
	Table t;

	MyNewTable(Table t) {
		this.t = t;
	}

	public void run() {
		try {
			t.printTable(10);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Que_036 {
	public static void main(String[] args) {
		Table t = new Table();

		MyTable t1 = new MyTable(t);
		MyNewTable t2 = new MyNewTable(t);

		t1.start();
		t2.start();
	}
}
