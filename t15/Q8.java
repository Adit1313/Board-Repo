package t15;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] names = new String[4];

		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter name number " + (i + 1));
			names[i] = in.nextLine();
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4 - i - 1; j++) {
				if (names[j].compareTo(names[j + 1]) < 0) {
					String tmp = names[j];
					names[j] = names[j+1];
					names[j+1] = tmp;
				}
			}
		}
		
		for (int i = 0; i < 4; i++) {
			System.out.println(names[i]);
		}
		
		in.close();
	}

}