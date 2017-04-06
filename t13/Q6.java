package t13;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter word");
		String w = in.nextLine();
		w = w.toUpperCase();
		char[] letters = w.toCharArray();
		char[] vowels = {'A', 'E', 'I', 'O', 'U'};
		
		int pos = 0;
		boolean found = false;
		
		for (int i = 0; i < letters.length; i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (letters[i] == vowels[j]) {
					pos = i;
					found = true;
					break;
				}
			}
			
			if (found) {
				break;
			}
		}
		
		String former = w.substring(0, pos);
		String latter = w.substring(pos);
		former += "AY";
		
		String pigLatin = latter + former;
		
		System.out.println("Piglating word: " + pigLatin);
		
		in.close();
	}
	
}