package t12;

import java.util.Scanner;

public class Q9 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] country = new String[10];
		int[] std = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter country name");
			country[i] = in.nextLine();
			System.out.println("Enter STD");
			std[i] = in.nextInt();
		}
		
		System.out.println("Enter city to search for");
		String ser = in.nextLine();
		boolean found = false;
		
		for (int i = 0; i < 10; i++) {
			if (country[i].equals(ser)) {
				found = true;
				System.out.println("Search successful");
				System.out.println("STD of " + ser + " is " + std[i]);
			}
		}
		
		if (!found) {
			System.out.println("Search unsuccessful");
		}
		
		in.close();
	}
	
}