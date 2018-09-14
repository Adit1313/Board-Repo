package practical;

import java.util.Scanner;

public class SpecialNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("SPECIAL NUMBER CHECKER");
		System.out.println("======================");

		System.out.println("Enter a number");
		int num = in.nextInt();

		int sum = 0;
		int copy = num;

		while (copy != 0) {
			sum += getFact(copy % 10);
			copy /= 10;
		}

		if (sum == num) {
			System.out.println(num + " is a special (retarded) number");
		} else {
			System.out.println(num + " is not a special number");
		}

		in.close();
	}

	private static int getFact(int any) {
		int ans = 1;

		for (int i = any; i > 0; i--) {
			ans *= i;
		}

		return ans;
	}

}
/*
SPECIAL NUMBER CHECKER
======================
Enter a number
145
145 is a special (retarded) number

SPECIAL NUMBER CHECKER
======================
Enter a number
23
23 is not a special number
*/