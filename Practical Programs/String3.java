package practical;

import java.util.Scanner;

public class String3 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("VOWEL MORPHER");
		System.out.println("=============");
		
		System.out.println("Enter a string");
		String s = in.nextLine();
		
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		String result = "";
		
		for (int i = 0; i < s.length(); i++) {
			boolean added = false;
			
			for (int j = 0; j < vowels.length; j++) {
				if (s.charAt(i) == vowels[j]) {
					result += String.valueOf((char) (vowels[j] + 1));
					added = true;
					break;
				}
			}
			
			if (!added) {
				result += String.valueOf(s.charAt(i));
			}
		}
		
		System.out.println("Output: " + result);
		
		in.close();
	}
	
}

/*
	VOWEL MORPHER
	=============
	Enter a string
	computers is soo easy
	Output: cpmpvtfrs js spp fbsy
*/