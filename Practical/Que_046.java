/*	Q-46 : Create a program that reads from one file and writes the content to another file.	*/

package LabExercise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Que_046 {
	public static void main(String[] args) {
		String sourceFile = "input.txt"; // File to read from
		String destFile = "output.txt"; // File to write into

		try (FileReader reader = new FileReader(sourceFile); 
				FileWriter writer = new FileWriter(destFile)) {

			int character;
			// Read one character at a time and write it
			while ((character = reader.read()) != -1) {
				writer.write(character);
			}

			System.out.println("File content copied successfully from " + sourceFile + " to " + destFile);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
