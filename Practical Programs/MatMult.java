package practical;

import java.util.Scanner;

public class MatMult {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("MATRIX MULTIPLIER");
		System.out.println("=================");
		
		System.out.print("Enter the number of rows in A: ");
		int rowA = in.nextInt();
		System.out.print("Enter the number of columns in A: ");
		int colA = in.nextInt();
		
		System.out.print("Enter the number of rows in B: ");
		int rowB = in.nextInt();
		
		if (colA != rowB) {
			System.out.println("Error, cannot multpily");
			System.exit(-1);
		}
		
		System.out.print("Enter the number of columns in B: ");
		int colB = in.nextInt();
		
		int[][] a = new int[rowA][colA];
		int[][] b = new int[colA][colB];
		
		System.out.println("Enter matrix A");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.println("Enter element (" + (i + 1) + ", " + (j + 1) + ")");
				a[i][j] = in.nextInt();
			}
		}
		
		System.out.println("Enter matrix B");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.println("Enter element (" + (i + 1) + ", " + (j + 1) + ")");
				b[i][j] = in.nextInt();
			}
		}
		
		int[][] c = multiply(a, b);
		
		System.out.println("Product of A and B is");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		in.close();
	}

	public static int[][] multiply(int[][] a, int[][] b) {
		int rowA = a.length;
		int colA = a[0].length;
		int colB = b[0].length;
		int[][] c = new int[rowA][colB];
		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < colB; j++) {
				for (int k = 0; k < colA; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}	
			}
		}
		return c;
	}
}