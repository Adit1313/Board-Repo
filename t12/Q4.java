package t12;

import java.util.Scanner;

public class Q4 {

	int acc_num = 0;
	String title = "", author = "";

	public static void main(String[] args) {
		Q4 q = new Q4();
		q.input();
		q.compute();
		q.display();
	}

	private void input() {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter accession number");
		acc_num = in.nextInt();

		System.out.println("Enter book title");
		title = in.nextLine();

		System.out.println("Enter book author");
		author = in.nextLine();

		in.close();
	}

	private void compute() {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter number of days late");
		int d = in.nextInt();
		
		System.out.println("Fine: " + (d * 2) + " ruppees");
		
		in.close();
	}

	private void display() {
		System.out.println("Accession Number - Title - Author");
		System.out.println(acc_num + " - " + title + " - " + author);
	}

}