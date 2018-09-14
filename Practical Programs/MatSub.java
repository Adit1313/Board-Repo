package practical;

import java.util.Scanner;

public class MatSub {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("MATRIX SUBTRACTOR");
		System.out.println("=================");
		
		System.out.println("Enter the rows of the first matrix");
		int c1 = in.nextInt();
		System.out.println("Enter the columns of the first matrix");
		int r1 = in.nextInt();
		int[][] matrix1 = new int[c1][r1];
		
		System.out.println("Enter the rows of the second matrix");
		int c2 = in.nextInt();
		System.out.println("Enter the columns of the second matrix");
		int r2 = in.nextInt();
		int[][] matrix2 = new int[c2][r2];
		
		if (c2 != c1 || r1 != r2) {
			System.out.println("Error, matrices cannot be subtracted");
			System.exit(-1);
		}
		
		for (int i = 0; i < c1; i++) {
			for (int j = 0; j < r1; j++) {
				System.out.println("Enter value (" + (i+1) + ", " + (j+1) + ") for matrix 1");
				matrix1[i][j] = in.nextInt();
			}
		}
		
		for (int i = 0; i < c2; i++) {
			for (int j = 0; j < r2; j++) {
				System.out.println("Enter value (" + (i+1) + ", " + (j+1) + ") for matrix 2");
				matrix2[i][j] = in.nextInt();
			}
		}
		
		System.out.println("SUBTRACTED");
		
		int[][] sum = new int[c1][r2];
		
		for (int i = 0; i < c1; i++) {
			for (int j = 0; j < r1; j++) {
				sum[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		
		for (int[] cols : sum) {
			for (int element : cols) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		
		in.close();
	}
	
}