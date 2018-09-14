package practical;

import java.util.Scanner;

public class String4 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("STRING REVERSOR");
		System.out.println("===============");
		
		System.out.println("retnE a gnirts (Enter a string)");
		String s = in.nextLine();
		s = s.toUpperCase();
		
		System.out.println("Number of characters: " + s.length());
		
		char[] vowels = { 'A', 'E', 'I', 'O', 'U' };
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (s.charAt(i) == vowels[j]) {
					count++;
					break;
				}
			}
		}
		
		System.out.println("Number of vowels: " + count);
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String reverse = sb.toString();
		
		System.out.println("Reversed String: " + reverse);
		
		in.close();
	}
	
}

/*
	STRING REVERSOR
	===============
	retnE a gnirts (Enter a string)
	WHY SO SERIOUS
	Number of characters: 14
	Number of vowels: 5
	Reversed String: SUOIRES OS YHW
*/