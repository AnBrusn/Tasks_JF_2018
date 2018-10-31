package brusnitsyna.first;

import java.util.Scanner;

public class FirstTask {
	
	public static void drawMatrix(final int size) {
		int[][] matrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if ((j == i) || (j == size - i - 1)) {
					matrix[i][j] = j + 1;
				} else {
					matrix[i][j] = 0;
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		try {
			System.out.print("Size of matrix: ");
			Scanner scan = new Scanner(System.in);
			int matrixSize = scan.nextInt();
			scan.close();
			if (matrixSize > 0) {
				drawMatrix(matrixSize);
			} else {
				throw new IllegalArgumentException ("Size of matrix must be positive");
			}		
		}
		catch (IllegalArgumentException err) {
			System.out.println(err.getMessage());
		}
	}
	
}
