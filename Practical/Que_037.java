/*	Q-37 : Use inter-thread communication methods like wait(), notify(), and notifyAll().	*/

package LabExercise;

class Message {
	private boolean ready = false;

	// Producer sets message
	public synchronized void produce() {
		System.out.println("Producer: Producing message...");
		ready = true;
		notify(); // tell consumer
	}

	// Consumer waits for message
	public synchronized void consume() {
		while (!ready) {
			try {
				wait(); // wait until producer produces
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumer: Message received!");
	}
}

public class Que_037 {
	public static void main(String[] args) {
		Message msg = new Message();

		Thread producer = new Thread(() -> {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			msg.produce();
		});

		Thread consumer = new Thread(() -> {
			msg.consume();
		});

		consumer.start();
		producer.start();
	}
}
