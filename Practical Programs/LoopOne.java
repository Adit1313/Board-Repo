package practical;

import java.util.Scanner;

public class LoopOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("PATTERN MAESTRO");
		System.out.println("===============");

		System.out.println("Enter a number");
		int unit = in.nextInt();

		for (int i = unit; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		int k = 2 * unit - 2;

		for (int i = 0; i < unit; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			k = k - 2;
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		k = 2 * unit - 2;

		for (int i = 0; i < unit; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			k = k - 1;
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		in.close();
	}

}