package practical;

import java.util.Scanner;

public class Selection {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("SELECTION SORT");

		System.out.println("Enter array length");
		int n = in.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter element number " + (i + 1));
			arr[i] = in.nextInt();
		}

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

		in.close();
	}

}