/*	Q-40 : Create a program that demonstrates object serialization and deserialization.	*/

package LabExercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Book class implements Serializable
class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	String title;
	String author;
	double price;

	Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void display() {
		System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
	}
}

public class Que_040 {
	public static void main(String[] args) {
		String filename = "book.ser";

		// Serialize (save object)
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			Book b1 = new Book("Java Programming", "James Gosling", 499.99);
			oos.writeObject(b1);
			System.out.println("Book object has been serialized to " + filename);
		} catch (IOException e) {
			System.out.println("Serialization error: " + e.getMessage());
		}

		// Deserialize (load object)
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			Book b2 = (Book) ois.readObject();
			System.out.println("Book object has been deserialized:");
			b2.display();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Deserialization error: " + e.getMessage());
		}
	}
}
