package algos;

import java.util.Scanner;

public class SelectionSort {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter number of elements");
		int n = in.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter element number " + (i + 1));
			array[i] = in.nextInt();
		}

		//SELECTION SORT BEGINS HERE - CODE INTENSIFIES

		for (int i = 0; i < n - 1; i++) {
			int pos = i;

			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[pos]) { //For descending order make it array[j] > array[pos]
					pos = j;
				}
			}

			int tmp = array[pos];
			array[pos] = array[i];
			array[i] = tmp;
		}
		
		System.out.println("Sorted Array:");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		
		in.close();
	}
	
}