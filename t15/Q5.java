package t15;

public class Q5 {

	public static void main(String[] args) {
		//The question asks for 2 classes but I'll just make 2 methods
		Q5 q = new Q5();
		q.pattern1();
		q.pattern2();
	}
	
	private void pattern1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("#");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	private void pattern2() {
		for (int i = 5; i > 0; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
}