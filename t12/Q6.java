package t12;

import java.util.Scanner;

public class Q6 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String sent = in.nextLine();
		
		sent = sent.toUpperCase();
		char[] letters = sent.toCharArray();
		
		int count = 0;
		
		for (int i = 0; i < letters.length - 1; i++) {
			if (letters[i] == letters[i+1]) {
				count++;
			}
		}
		
		System.out.println(sent);
		System.out.println("Number of repeated letters: " + count);
		
		in.close();
	}
	
}