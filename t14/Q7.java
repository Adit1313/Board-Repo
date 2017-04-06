package t14;

public class Q7 {
	
	@SuppressWarnings("unused") //Ignore
	private double area(double a, double b, double c) {
		double semiperi = (a + b + c) / 2;
		
		return Math.sqrt(semiperi * (semiperi - a) * (semiperi - b) * (semiperi - c));
	}
	
	@SuppressWarnings("unused") //Ignore
	private int area(int a, int b, int height) {
		return (1/2 * height * (a + b));
	}
	
	@SuppressWarnings("unused") //Ignore
	private double area(double diagnol1, double diagnol2) {
		return 1/2 * (diagnol1 * diagnol2);
	}
	
}