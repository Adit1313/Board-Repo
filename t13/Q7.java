package t13;

import java.util.Scanner;

public class Q7 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] a = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter element number " + (i + 1));
			a[i] = in.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 - i - 1; j++) {
				if (a[j] < a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
		
		in.close();
	}
	
}