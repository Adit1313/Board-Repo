package t14;

import java.util.Scanner;

public class Q4 {
	
	int year;
	String title;
	float rating;

	public static void main(String[] args) {
		Q4 q = new Q4();
		q.accept();
		q.display();
	}
	
	private void display() {
		System.out.println("Movie title: " + title);
		System.out.println("Movie release year: " + year);
		System.out.println("Movie rating: " + rating);
		System.out.print("Remarks: ");
		
		if (rating >= 4.6) {
			System.out.println("Super hit");
		} else if (rating >= 3.5) {
			System.out.println("Hit");
		} else if (rating >= 2.1) {
			System.out.println("Semi-hit");
		} else {
			System.out.println("Flop");
		}
	}

	private void accept() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter movie title");
		title = in.nextLine();
		
		System.out.println("Enter movie release year");
		year = in.nextInt();
		
		System.out.println("Enter movie rating");
		rating = in.nextFloat();
		
		in.close();
	}

	public Q4() {
		year = 0;
		title = "";
		rating = 0;
	}
	
}