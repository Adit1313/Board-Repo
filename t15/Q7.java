package t15;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Q7 q = new Q7();

		System.out.println("Input string");
		String s1 = in.nextLine();
		
		System.out.println("Input char to replace");
		char c1 = in.nextLine().charAt(0);
		
		System.out.println("Input char to replace with");
		char c2 = in.nextLine().charAt(0);
		
		q.joystring(s1, c1, c2);
		
		System.out.println("Enter string to find position of first and last space");
		String s2 = in.nextLine();
		
		q.joystring(s2);
		
		System.out.println("Enter first string to combine");
		String s3 = in.nextLine();
		
		System.out.println("Enter second string to combine");
		String s4 = in.nextLine();
		
		q.joystring(s3, s4);

		in.close();
	}

	private void joystring(String s, char c1, char c2) {
		System.out.println("Replaced string: " + s.replace(c1, c2));
	}
	
	private void joystring(String s) {
		int firstSpace = s.indexOf(' ');
		int lastSpace = s.lastIndexOf(' ');
		
		System.out.println("First space is at index " + firstSpace + " or position number " + (firstSpace + 1));
		System.out.println("Last space is at index " + lastSpace + " or position number " + (lastSpace + 1));
	}
	
	private void joystring(String s1, String s2) {
		String combined = s1 + " " + s2;
		System.out.println("Combined string: \"" + combined + "\"");
 	}

}