package t16;

import java.util.Scanner;

public class Q4 {

	String Bname;
	double price;
	
	public static void main(String[] args) {
		Q4 q = new Q4();
		q.input();
	}
	
	private void input() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("ENter book name");
		Bname = in.nextLine();
		
		System.out.println();
		
		in.close();
	}

	public Q4() {
		Bname = "";
		price = 0d;
	}
	
}