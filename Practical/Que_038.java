/*	Q-38 : Write a program to read and write content to a file using FileReader and FileWriter.	*/

package LabExercise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Que_038 {
	public static void main(String[] args) {
		String filename = "example.txt";

		// Writing to a file
		try (FileWriter writer = new FileWriter(filename)) {
			writer.write("Hello, this is a test file.\n");
			writer.write("FileWriter and FileReader are used in Java.\n");
			writer.write("This is the third line.");
			System.out.println("Data written to file successfully.");
		} catch (IOException e) {
			System.out.println("Error writing to file: " + e.getMessage());
		}

		// Reading from a file
		try (FileReader reader = new FileReader(filename)) {
			int ch;
			System.out.println("\nReading file content:");
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch); // convert int to character
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}
