package practical;

import java.util.Scanner;

public class MatDiag {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("MATRIX DIAGONAL ADDER");
		System.out.println("=====================");
		
		System.out.println("Enter the order of the matrix");
		int n = in.nextInt();
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter value (" + (i + 1) + ", " + (j + 1) + ")");
				matrix[i][j] = in.nextInt();
			}
		}
		
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += matrix[i][i];
			sum += matrix[i][n - i - 1];
		}
		
		if (n % 2 == 1) sum -= matrix[(n % 2) + 1][(n % 2) + 1];
		
		System.out.println("The sum of the diagonals is " + sum);
		
		in.close();
	}
	
}