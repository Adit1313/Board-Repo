package t14;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.println("Enter a number to check if it is a special number");
		 int a = in.nextInt();
		 
		 String b = String.valueOf(a);
		 char[] digits = b.toCharArray();
		 
		 int sum = 0;
		 int product = 1;
		 
		 for (int i = 0; i < digits.length; i++) {
			 sum += Integer.valueOf(String.valueOf(digits[i]));
			 product *= Integer.valueOf(String.valueOf(digits[i]));
		 }
		 
		 if (sum + product == a) {
			 System.out.println(a + " is a special number");
		 } else {
			 System.out.println(a + " is not a special number");
		 }
		 
		 in.close();
	}

} 