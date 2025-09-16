/*	Q-39 : Implement a program that reads a file line by line using BufferedReader.	*/

package LabExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Que_039 {
	public static void main(String[] args) {
		String filename = "example2.txt";

		// First, write some content to the file
		try (FileWriter writer = new FileWriter(filename)) {
			writer.write("Hello, this is line 1.\n");
			writer.write("This is line 2.\n");
			writer.write("And here is line 3.\n");
			System.out.println("Data written to file successfully.");
		} catch (IOException e) {
			System.out.println("Error writing to file: " + e.getMessage());
		}

		// Now, read the file line by line
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;
			System.out.println("\nReading file content line by line:");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}
