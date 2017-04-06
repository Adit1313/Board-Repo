package t12;

import java.util.Scanner;

public class Q8 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 1 for fibonacci series");
		System.out.println("Enter 2 for calculating the sum of the digits of a number");
		int choice = in.nextInt();
		
		switch (choice) {
			case 1:
				System.out.print("0 ");
				
				int a = 0;
				int b = 1;
				int c = 0;
				
				for (int i = 0; i < 10; i++) {
					System.out.print(b + " ");
					c = a + b;
					a = b;
					b = c;
				}
				
				break;
				
			case 2:
				System.out.println("Enter number");
				String num = in.nextLine();
				
				int sum = 0;
				char[] digits = num.toCharArray();
				
				for (int i = 0; i < digits.length; i++) {
					sum += Integer.valueOf(String.valueOf(digits[i]));
				}
				
				System.out.println("Sum of the digits is: " + sum);
				
				break;
				
				default:
					System.out.println("Enter a valid option");
		}
		
		in.close();
	}
	
}