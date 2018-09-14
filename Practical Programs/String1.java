package practical;

import java.util.Scanner;

/*
 * Overloading functions + String Program
 */

public class String1 {

	public static void main(String[] args) {
		String1 obj = new String1();
		Scanner in = new Scanner(System.in);

		System.out.println("JOYSTRING");
		System.out.println("=========");

		System.out.println("Enter a string");
		String j1 = in.nextLine();
		System.out.println("Enter a character");
		char j11 = in.nextLine().charAt(0);
		System.out.println("Enter another character");
		char j12 = in.nextLine().charAt(0);
		obj.joystring(j1, j11, j12);

		System.out.println("Enter a sentence");
		String j2 = in.nextLine();
		obj.joystring(j2);

		System.out.println("Enter a string");
		String j31 = in.nextLine();
		System.out.println("Enter another string");
		String j32 = in.nextLine();
		obj.joystring(j31, j32);

		in.close();
	}

	private void joystring(String s, char c1, char c2) {
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c1) {
				result += String.valueOf(c2);
			} else {
				result += String.valueOf(s.charAt(i));
			}
		}

		System.out.println("Replaced word: " + result);
	}

	private void joystring(String s) {
		System.out.println(
				"First space in \"" + s + "\" is at index " + s.indexOf(' ') + " or position " + (s.indexOf(' ') + 1));
		System.out.println("Last space in \"" + s + "\" is at index " + s.lastIndexOf(' ') + " or position "
				+ (s.lastIndexOf(' ') + 1));
	}

	private void joystring(String s1, String s2) {
		System.out.println("Resultant String of \"" + s1 + "\" and \"" + s2 + "\" is:");
		System.out.println(s1 + " " + s2);
	}

	/*
		OUTPUT:

		JOYSTRING
		=========
		Enter a string
		sloggy
		Enter a character
		g
		Enter another character
		p
		Replaced word: sloppy
		Enter a sentence
		I was going to bury you here
		First space in "I was going to bury you here" is at index 1 or position 2
		Last space in "I was going to bury you here" is at index 23 or position 24
		Enter a string
		portait of an artist
		Enter another string
		trapped in his own drawings
		Resultant String of "portait of an artist" and "trapped in his own drawings" is:
		portait of an artist trapped in his own drawings
	 */

}