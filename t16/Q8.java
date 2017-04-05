package t16;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number");
		String num = in.nextLine();
		
		char[] digits = num.toCharArray();
		int[] digitsInInt = new int[digits.length];
		
		for (int i = 0; i < digits.length; i++) {
			digitsInInt[i] = Integer.valueOf(String.valueOf(digits[i]));
		}
		
		int sum = 0;
		
		for (int i = 0; i < digitsInInt.length; i++) {
			sum += digitsInInt[i];
		}
		
		if (Integer.valueOf(num) % sum == 0) {
			System.out.println(num + " is a Niven Number");
		} else {
			System.out.println(num + " is not a Niven Number");
		}
		
		in.close();
	}
	
}