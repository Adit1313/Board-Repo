package algos;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = in.nextInt();
		
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter element number " + (i + 1));
			array[i] = in.nextInt();
		}
		
		//BUBBLE SORT BEGINS (DRAMATIC MUSIC)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (array[j] > array[j+1]) { //For descending order make it array[j] < array[j+1]
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		
		System.out.println("Sorted elements:");
		
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		
		in.close();
	}
	
}