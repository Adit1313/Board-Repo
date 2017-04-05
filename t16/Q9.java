package t16;

import java.util.Scanner;

public class Q9 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] w = {"CHICHEN ITZA", "CHRIST THE REDEEMER", "TAJMAHAL", "GREAT WALL OF CHINA", "MACHU PICCHU", "PETRA", "COLOSSEUM"};
		String[] l = {"MEXICO", "BRAZIL", "INDIA", "CHINA", "PERU", "JORDAN", "ITALY"};
		
		System.out.println("Enter country to search for:");
		String con = in.nextLine();
		
		boolean found = false;
		
		for (int i = 0; i < l.length; i++) {
			if (l[i].equals(con)) {
				System.out.println(l[i] + " - " + w[i]);
				found = true;
				break;
			}
		}
		
		if (!found) {
			System.out.println("Sorry not found");
		}
		
		in.close();
	}
	
}