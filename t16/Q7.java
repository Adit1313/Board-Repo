package t16;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a double");
		double x = in.nextDouble();
		
		System.out.println("Enter how many times to calculate the first series");
		int n = in.nextInt();
		
		sumSeries(n ,x);
		sumSeries();
		
		in.close();
	}

	private static void sumSeries(int n, double x) {
		double s = 0;
		
		for (double i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				s -= x / i;
			} else {
				s += x / i;
			}
		}
		
		System.out.println("Sum of series is: " + s);
	}
	
	private static void sumSeries() {
		int s = 0;
		
		for (int i = 1; i <= 20; i++) {
			
			int factorial = 1;
			for (int j = i; j > 0; j--) {
				factorial *= j;
			}
			
			s += factorial;
			factorial = 0;
		}
		
		System.out.println("Sum of series is " + s);
	}

}