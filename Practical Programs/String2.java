package practical;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("FILE PATH EXTRACTOR");
		System.out.println("===================");
		
		System.out.println("Enter a file path");
		String fullPath = in.nextLine();
		
		String path = fullPath.substring(0, fullPath.lastIndexOf('\\') + 1);
		System.out.println("Path: " + path);
		
		String fileName = fullPath.substring(fullPath.lastIndexOf('\\') + 1, fullPath.indexOf('.'));
		System.out.println("File: " + fileName);
		
		String ext = fullPath.substring(fullPath.indexOf('.') + 1);
		System.out.println("Extension: " + ext);
		
		in.close();
	}

}

/*
	FILE PATH EXTRACTOR
	===================
	Enter a file path
	chinki\momo\picture.png
	Path: chinki\momo\
	File: picture
	Extension: png
 */