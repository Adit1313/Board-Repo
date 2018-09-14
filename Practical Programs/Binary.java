package practical;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("BINARY SEARCH");
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

		System.out.println("SORTING ARRAY");
		for (int i = 0; i < n; i++) {
			int pos = i;

			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[pos]) {
					pos = j;
				}
			}

			int tmp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = tmp;
		}

		System.out.println("PRINTING ARRAY");
		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");

		int lower = 0, mid = 0, upper = n - 1;
		boolean found = false;

		while (lower <= upper) {
			mid = (lower + upper) / 2;

			if (doe > arr[mid]) {
				lower = mid + 1;
			} else if (doe < arr[mid]) {
				upper = mid - 1;
			} else {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println(doe + " found at position " + (mid + 1) + " and index " + mid + ".");
		}

		in.close();
	}

}
