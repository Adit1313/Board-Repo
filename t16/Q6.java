package t16;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String toCheck = in.nextLine();
		
		boolean palindrome = true;
		boolean special = true;
		
		for (int i = 1; i <= toCheck.length(); i++) {
			if (toCheck.charAt(i - 1) != toCheck.charAt(toCheck.length() - i)) {
				palindrome = false;
			}
		}
		
		if (toCheck.charAt(0) != toCheck.charAt(toCheck.length() - 1)) {
			special = false;
		}
		
		if (palindrome) {
			System.out.println("IT IS A PALINDROME AND A SPECIAL WORD");
		} else if (special) {
			System.out.println("IT IS ONLY A SPECIAL WORD");
		} else {
			System.out.println("IT IS NETIHER PALINDROME NOR SPECIAL");
		}
		
		in.close();
	}
	
}