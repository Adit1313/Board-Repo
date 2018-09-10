package algos;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticSorting {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = in.nextInt();
		
		String[] array = new String[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter element number " + (i + 1));
			array[i] = in.nextLine();
		}
		
		//This can be done by both bubble and selection sort
		//BUBBLE SORT
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (array[j].compareTo(array[j+1]) > 0) { // This is for A -> Z. For Z -> A, make it '< 0'
					String tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		
		//SELECTION SORT
		for (int i = 0; i < n - 1; i++) {
			int pos = i;
			
			for (int j = i + 1; j < n; j++) {
				if (array[j].compareTo(array[pos]) < 0) { // This is for A -> Z. For Z -> A, make it '> 0'
					pos = j;
				}
			}
			
			String tmp = array[pos];
			array[pos] = array[i];
			array[i] = tmp;
		}
		
		System.out.println(Arrays.toString(array));
		
		in.close();
	}
	
}