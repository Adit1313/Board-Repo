package t12;

import java.util.Scanner;

public class Q5 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter age");
		double age = in.nextDouble();
		
		System.out.println("Enter gender");
		String gen = in.nextLine();
		
		if (age > 65 && !(gen.equals("female"))) {
			System.out.println("Enter taxable income");
			double ti = in.nextDouble();
			
			double tax = 0;
			
			if (ti <= 1650000) {
				System.out.println("Not taxable");
			} else if (ti <= 500000) {
				tax = (ti - 160000) * 10/100;
			} else if (ti <= 800000) {
				tax = (ti - 500000) * 10/100;
			} else {
				tax = (ti - 800000) * 10/100;
			}
			
			System.out.println("Income tax is: " + tax);
		} else {
			System.out.println("Not appicable");
		}
		
		in.close();
	}
	
}