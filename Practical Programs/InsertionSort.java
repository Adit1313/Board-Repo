package practical;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("INSERTION SORT");
		System.out.println("==============");

		System.out.println("Enter number of elements");
		int n = in.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter element number " + (i + 1));
			array[i] = in.nextInt();
		}

		System.out.println("Unsorted array: " + Arrays.toString(array));

		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					int tmp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = tmp;
				}
			}
		}

		System.out.println("Sorted array: " + Arrays.toString(array));

		in.close();
	}

}