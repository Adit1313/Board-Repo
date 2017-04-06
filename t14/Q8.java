package t14;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 1 for Term Deposit");
		System.out.println("Enter 2 for Recurring Deposit");
		int choice = in.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("Enter principal");
				double P1 = in.nextDouble();
				
				System.out.println("Enter rate");
				double r1 = in.nextDouble();
				
				System.out.println("Enter time in months");
				double n1 = in.nextDouble();
				
				double a = P1 * Math.pow(1 + r1/100, n1);
				System.out.println("The maturity amount is: " + a);
				
				break;
				
			case 2:
				System.out.println("Enter principal");
				double P2 = in.nextDouble();
				
				System.out.println("Enter rate");
				double r2 = in.nextDouble();
				
				System.out.println("Enter time in months");
				double n2 = in.nextDouble();
				
				double A = (P2 * n2) + (P2 * ((n2 * (n2 + 1)) / 2) * (r2/100) * (1/12));
				System.out.println("The maturity amount is: " + A);
		}
		
		in.close();
	}
	
}