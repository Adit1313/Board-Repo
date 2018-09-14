import java.util.Scanner;
import java.util.Vector;

/*
 * Q. Write a program to generate prime numbers from a range L to U where 1 <= L < U < 2147483647. Note that U - L < 10^6
 */

public class SegSieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter lower limit");
		int L = in.nextInt();
		System.out.println("Enter upper limit");
		int U = in.nextInt();

		Vector<Integer> primes = getPrimes(U);

		for (int i = L; i <= U; i++) {
			boolean noFactor = true;

			for (int j = 0; j < primes.size(); j++) {
				if (i % primes.get(j) == 0) {
					noFactor = false;
					break;
				}
			}

			if (noFactor) {
				System.out.println(i);
			}
		}

		in.close();
	}

	private static Vector<Integer> getPrimes(int upper) {
		upper = (int) Math.pow(upper, 0.5);

		Vector<Integer> holder = new Vector<>();

		for (int i = 2; i <= upper; i++) {
			if (isPrime(i)) {
				holder.add(i);
			}
		}

		return holder;
	}

	private static boolean isPrime(int num) {
		boolean flag = false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = true;
			}
		}

		return !flag;
	}

}