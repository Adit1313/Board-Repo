package t13;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 1 to check if a number is composite or not");
		System.out.println("Enter 2 to check find the smallest digit in an number");
		int choice = in.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("Enter a number");
				int a = in.nextInt();
				
				int count = 0;
				
				for (int i = 1; i <= a; i++) {
					if (a % i == 0) {
						count++;
					}
				}
				
				if (count > 2) {
					System.out.println(a + " is a composite number");
				}
				
				break;
				
			case 2:
				in.nextLine();
				System.out.println("Enter a number");
				char[] l = in.nextLine().toCharArray();
				String[] m = new String[l.length];
				
				for (int i = 0; i < l.length; i++) {
					m[i] = String.valueOf(l[i]);
				}
				
				for (int i = 0; i < m.length; i++) {
					for (int j = 0; j < m.length - 1 - i; j++) {
						if (m[j].compareTo(m[j + 1]) > 0) {
							String tmp = m[j];
							m[j] = m[j+1];
							m[j+1] = tmp;
						}
					}
				}
				
				System.out.println("Smallest digit is: " + m[0]);
				
				break;

			default:
				break;
		}
		
		in.close();
	}
	
}