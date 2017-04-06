package t13;

import java.util.Scanner;

public class Q5 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter an ISBN number");
		String isbn = in.nextLine();
		
		if (isbn.length() != 10) {
			System.out.println("Illegal ISBN");
			System.exit(0);
		}
		
		char[] digits = isbn.toCharArray();
		
		int sum = 0;
		
		for (int i = 0; i < digits.length; i++) {
			sum += Integer.valueOf(String.valueOf(digits[i])) * (i + 1);
		}
		
		if (sum % 11 == 0) {
			System.out.println("Legal ISBN");
		} else {
			System.out.println("Illegal ISBN");
		}
		
		in.close();
	}
	
}