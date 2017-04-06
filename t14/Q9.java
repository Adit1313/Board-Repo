package t14;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter year of graduation");
		int year = in.nextInt();
		
		int[] records = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};
		
		int high = records.length - 1;
		int low = 0;
		int mid = 0;
		boolean found = false;
		
		while(low <= high) {
			mid = (low + high) / 2;
			
			if (year > records[mid]) {
				low = mid + 1;
			} else if (year < records[mid]) {
				high = mid - 1;
			} else {
				found = true;
				break;
			}
		}
		
		if (found) {
			System.out.println("Records exist");
		} else {
			System.out.println("Records do not exist");
		}
		
		in.close();
	}
	
}