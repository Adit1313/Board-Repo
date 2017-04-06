package algos;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = in.nextInt();
		
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter element number " + (i + 1));
			array[i] = in.nextInt();
		}
		
		System.out.println("Enter element to search for");
		int search = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			if (array[i] == search) {
				System.out.println("Element found at index " + i + " or position " + (i + 1));
				break;
			}
		}
		
		in.close();
	}
	
}