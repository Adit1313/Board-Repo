package algos;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = in.nextInt();
		
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter element number " + (i + 1));
			array[i] = in.nextInt();
		}
		
		Arrays.sort(array); //Quick easy (cheap) way of sorting, but no, they won't teach us this
		
		System.out.println("Enter element to search for");
		int ser = in.nextInt();
		
		int low = 0, high = n - 1;
		boolean found = false;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			
			if (array[mid] == ser) {
				System.out.println("Element found at index " + mid + " or position " + (mid + 1));
				found = true;
				break;
			} else if (ser > array[mid]) {
				low = mid + 1;
			} else if (ser < array[mid]) {
				high = mid - 1;
			}
		}
		
		if (!found) {
			System.out.println("Element not found");
		}
		
		in.close();
	}
	
}