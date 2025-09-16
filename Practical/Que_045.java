/*	Q-45 : Implement a file copy program using FileInputStream and FileOutputStream.	*/

package LabExercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Que_045 {
	public static void main(String[] args) {
		String sourceFile = "source.txt";
		String destFile = "copy.txt";

		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(destFile)) {

			int byteData;
			// Read each byte and write it to destination
			while ((byteData = fis.read()) != -1) {
				fos.write(byteData);
			}

			System.out.println("File copied successfully from " + sourceFile + " to " + destFile);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
