package practical;

import java.util.Scanner;

public class MagicNum {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("MAGIC NUMBER");
		System.out.println("============");
		
		System.out.println();
		System.out.println("Enter a number");
		int num = in.nextInt();
		
		magic(num);
		
		in.close();
	}
	
	private static void magic(int num) {
		try {
			if (sum(num) == 1) {
				System.out.println(num + " is a MAGIC NUMBER!");
			}
		} catch (StackOverflowError e) {
			System.out.println("Looks like " + num + " is not a magic number");
		}
	}
	
	private static int sum(int n) {
		int copy = n;
		int sum = 0;
		
		while (copy > 0) {
			sum += copy % 10;
			copy /= 10;
		}
		
		if (sum == 1) {
			return sum;
		} else {
			return sum(sum);
		}
	}
	
}