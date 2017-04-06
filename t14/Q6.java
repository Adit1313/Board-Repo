package t14;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input a directory");
		String dir = in.nextLine();
		
		int posSlash = dir.lastIndexOf("\\");
		int posDot = dir.indexOf(".");
		
		String fileName = dir.substring(posSlash + 1, posDot);
		String ext = dir.substring(posDot + 1);
		
		System.out.println("Path: " + dir);
		System.out.println("File name: " + fileName);
		System.out.println("Extension: " + ext);
		
		in.close();
	}
	
}