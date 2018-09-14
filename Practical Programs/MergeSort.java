package practical;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		Scanner in = new Scanner(System.in);

		System.out.println("MERGE SORT");
		System.out.println("==========");

		System.out.println("Enter number of elements");
		int n = in.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter element number " + (i + 1));
			array[i] = in.nextInt();
		}

		System.out.println("Unsorted array: " + Arrays.toString(array));
		ms.sort(array, 0, n - 1);
		System.out.println("Sorted array: " + Arrays.toString(array));

		in.close();
	}

	public void sort(int array[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;

			sort(array, l, m);
			sort(array, m + 1, r);

			merge(array, l, m, r);
		}
	}

	public void merge(int[] array, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];

		for (int i = 0; i < n1; i++) {
			arr1[i] = array[l + i];
		}
		for (int j = 0; j < n2; j++) {
			arr2[j] = array[m + 1 + j];
		}

		int i = 0, j = 0, k = 1;

		while (i < n1 && j < n2) {
			if (arr1[i] <= arr2[j]) {
				array[k] = arr1[i];
				i++;
			} else {
				array[k] = arr2[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = arr1[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = arr2[j];
			j++;
			k++;
		}
	}

}