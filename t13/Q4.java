package t13;

import java.util.Scanner;

public class Q4 {

	String flavour, pack_type;
	int product_code, pack_size, product_price;
	
	public static void main(String[] args) {
		Q4 q = new Q4();
		q.input();
		q.discount();
		q.display();
	}
	
	private void input() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter flavour");
		flavour = in.nextLine();
		
		System.out.println("Enter pack type");
		pack_type = in.nextLine();
		
		System.out.println("Enter product code");
		product_code = in.nextInt();
		
		System.out.println("Enter pack size");
		pack_size = in.nextInt();
		
		System.out.println("enter product price");
		product_price = in.nextInt();
		
		in.close();
	}

	private void discount() {
		product_price -= 10;
	}

	private void display() {
		System.out.println("Flavour: " + flavour);
		System.out.println("Pack type: " + pack_type);
		System.out.println("Product code: " + product_code);
		System.out.println("Pack size: " + pack_size);
		System.out.println("Product price (discounted): " + product_price);
	}

	public Q4() {
		flavour = "";
		pack_type = "";
		product_code = 0;
		pack_size = 0;
		product_price = 0;
	}

}