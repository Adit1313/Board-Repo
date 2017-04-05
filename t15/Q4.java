package t15;

import java.util.Scanner;

public class Q4 {

	int vno = 0;
	int hours = 0;
	double bill = 0d;
	
	public static void main(String[] args) {
		Q4 q = new Q4();
		
		q.input();
		q.calculate();
		q.display();
	}

	private void input() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter vehicle number");
		vno = in.nextInt();
		
		System.out.println("Enter time vehicle was parked for");
		hours = in.nextInt();
		
		in.close();
	}

	private void calculate() {
		
	}

	private void display() {
		
	}

}