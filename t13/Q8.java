package t13;

public class Q8 {
	
	public double series (double n) {
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += 1.0d/(double)i;
		}
		
		return sum;
	}
	
	public double series (double a, double n) {
		double sum = 0;
		double num = 1;
		double den = 2;
		
		for (int i = 0; i < n; i++) {
			sum += num/(Math.pow(a, den));
			num += 3;
			den += 3;
		}
		
		return sum;
	}
	
}