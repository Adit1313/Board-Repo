package practical;

import java.util.Scanner;

public class Linear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("LINEAR SEARCH");
		System.out.println("=============");

		System.out.println("Enter array length");
		int n = in.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter element number " + (i + 1));
			arr[i] = in.nextInt();
		}

		System.out.println("Enter element to search for");
		int doe = in.nextInt();

		System.out.println("PRINTING ARRAY");
		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");

		boolean found = false;

		for (int i = 0; i < n; i++) {
			if (arr[i] == doe) {
				System.out.println(doe + " found at position " + (i + 1) + " and index " + i + ".");
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Element not found");
		}

		in.close();
	}

}