package practical;

import java.util.Scanner;

public class MenuNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("NUMBER BASE CONERTOR");
		System.out.println("====================");
		System.out.println("Enter (1) to convert to decimal");
		System.out.println("Enter (2) to convert to octal");
		System.out.println("Enter (3) to convert to hexadecimal base");
		System.out.println("Enter (4) to convert to binary base");
		int opt2 = in.nextInt();

		System.out.println("Enter number");
		int num = in.nextInt();

		decBase(opt2, num);

		in.close();
	}

	private static void decBase(int opt2, int num) {
		int copy = num;
		String ans = "";

		if (opt2 == 2) {
			while (copy > 0) {
				ans += String.valueOf(copy % 8);
				copy /= 8;
			}

			StringBuffer sb = new StringBuffer(ans);
			sb.reverse();
			ans = sb.toString();

			System.out.println(num + " in octal is " + ans);
		} else if (opt2 == 3) {
			while (copy > 0) {
				int rem = copy % 16;
				switch (rem) {
				case 10:
					ans += "A";
					break;

				case 11:
					ans += "B";
					break;

				case 12:
					ans += "C";
					break;

				case 13:
					ans += "D";
					break;

				case 14:
					ans += "E";
					break;

				case 15:
					ans += "F";
					break;

				default:
					ans += String.valueOf(rem);
					break;
				}

				copy /= 16;
			}

			StringBuffer sb = new StringBuffer(ans);
			sb.reverse();
			ans = sb.toString();

			System.out.println(num + " in hexadecimal is " + ans);
		} else {
			while (copy > 0) {
				ans += String.valueOf(copy % 2);
				copy /= 2;
			}

			StringBuffer sb = new StringBuffer(ans);
			sb.reverse();
			ans = sb.toString();

			System.out.println(num + " in binary is " + ans);
		}
	}

}