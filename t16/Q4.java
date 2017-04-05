package t16;

import java.util.Scanner;

public class Q4 {

	String Bname;
	double price;
	
	public static void main(String[] args) {
		Q4 q = new Q4();
		q.input();
		q.calculate();
		q.display();
	}
	
	private void display() {
		System.out.println("FINAL BILL");
		System.out.println("Book name " + Bname);
		System.out.println("Discounted Price: " + price);
	}

	private void calculate() {
		if (price <= 1000) {
			price = price * 2/100;
		} else if (price <= 3000) {
			price = price * 1/10;
		} else {
			price = price * 3/20;
		}
	}

	private void input() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter book name");
		Bname = in.nextLine();
		
		System.out.println("Enter book price");
		price = in.nextDouble();
		
		in.close();
	}

	public Q4() {
		Bname = "";
		price = 0d;
	}
	
}