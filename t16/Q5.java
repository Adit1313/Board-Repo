package t16;

import java.util.Scanner;

public class Q5 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 1 for Floyd's Triangle");
		System.out.println("Enter 2 for \"ICSE\" Pattern");
		
		int opt = in.nextInt();
		
		switch (opt) {
			case 1:
				System.out.println("You have chosen Floyd's Triangle");
				triangle();
				break;
				
			case 2:
				System.out.println("YOu have chosen \"ICSE\" Pattern");
				pattern();
				break;
				
			default:
				System.out.println("Please enter a valid number");
		}
		
		in.close();
	}

	private static void pattern() {
		String ICSE = "ICSE";
		
		for (int i = 0; i <= ICSE.length(); i++) {
			System.out.println(ICSE.substring(0, i));
		}
	}

	private static void triangle() {
		int a = 1;
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
	}
	
}