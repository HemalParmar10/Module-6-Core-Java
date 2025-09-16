/*	Q-21 : Write a program to perform matrix addition and subtraction using 2D arrays.	*/

package LabExercise;

public class Que_021 {
	public static void main(String[] args) {
		// Define two 2D arrays (matrices)
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] B = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		int rows = A.length;
		int cols = A[0].length;

		int[][] sum = new int[rows][cols];
		int[][] diff = new int[rows][cols];

		// Perform addition and subtraction
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum[i][j] = A[i][j] + B[i][j];
				diff[i][j] = A[i][j] - B[i][j];
			}
		}

		// Display results
		System.out.println("Matrix A:");
		printMatrix(A);

		System.out.println("Matrix B:");
		printMatrix(B);

		System.out.println("Sum of Matrices (A + B):");
		printMatrix(sum);

		System.out.println("Difference of Matrices (A - B):");
		printMatrix(diff);
	}

	// Utility method to print 2D array
	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
