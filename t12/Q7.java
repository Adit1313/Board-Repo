package t12;

public class Q7 {

	public void polygon(int c, char ch) {
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
	public void polygon(int x, int y) {
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
	
	public void polygon() {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}