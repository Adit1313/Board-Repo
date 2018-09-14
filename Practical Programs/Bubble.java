package practical;

import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("BUBBLE SORT");
		System.out.println("===========");

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
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
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