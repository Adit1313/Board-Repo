package practical;

import java.util.Scanner;

public class LoopTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("SERIES SUM CALCULATOR");
		System.out.println("======================");

		System.out.println("The series is: (2^n)/(n!)");
		System.out.println("Enter number of terms to calculate till");
		int n = in.nextInt();

		double ans = 0;

		for (int i = 1; i <= n; i++) {
			double denom = getFactorial(i);
			double numerator = Math.pow(2, i);

			double fraction = numerator / denom;
			ans += fraction;
		}

		System.out.println("The sum is " + ans);

		in.close();
	}

	private static double getFactorial(int num) {
		double ans = 1;

		for (int i = num; i > 0; i--) {
			ans *= i;
		}

		return ans;
	}

}