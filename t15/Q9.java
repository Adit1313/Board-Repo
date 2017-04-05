package t15;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 1 for displaying factors of a number");
		System.out.println("Enter 2 for calculating factorial of a number");
		int choice = in.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("Enter number to display factors of");
				factors(in.nextInt());
				break;
				
			case 2:
				System.out.println("Enter number to calculate factorial of");
				int a = in.nextInt();
				if (a > 0) {
					factorial(a);
				} else if (a == 0) {
					System.out.println("Factorial of 0 is 0");
				} else {
					System.out.println("Cannot calculate factorial of negative number");
				}
				break;
				
			default:
				System.out.println("Please enter either one or two");
		}
		
		in.close();
	}

	private static void factorial(int a) {
		int fact = 1;
		
		for (int i = 1; i <= a; i++) {
			fact *= i;
		}
		
		System.out.println("Factorial of " + a + " is " + fact);
	}

	private static void factors(int a) {
		System.out.print("Factors: ");
		
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
}