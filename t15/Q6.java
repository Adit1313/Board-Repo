package t15;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of students");
		int n = in.nextInt();
		
		String[] names = new String[n];
		int[] rNum = new int[n];
		int[] sub1 = new int[n];
		int[] sub2 = new int[n];
		int[] sub3 = new int[n];
		
		for (int i = 0; i < n; i++) {
			in.nextLine(); //Ignore this. Apparently some problem with the Scanner class
			
			System.out.println("Enter your name");
			names[i] = in.nextLine();
			
			System.out.println("Enter your roll number");
			rNum[i] = in.nextInt();
			
			System.out.println("Enter marks in subject 1");
			if ((sub1[i] = in.nextInt()) > 100) {
				sub1[i] = 0;
				System.out.println("INVALID. Maximum marks are 100");
			}
			
			System.out.println("Enter marks in subject 2");
			if ((sub2[i] = in.nextInt()) > 100) {
				sub2[i] = 0;
				System.out.println("INVALID. Maximum marks are 100");
			}
			
			System.out.println("Enter marks in subject 3");
			if ((sub3[i] = in.nextInt()) > 100) {
				sub3[i] = 0;
				System.out.println("INVALID. Maximum marks are 100");
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println("Student name: " + names[i]);
			System.out.println("Roll Number: " + rNum[i]);
			
			int avgMarks = (sub1[i] + sub2[i] + sub3[i]) / 3;
			
			System.out.println("Average Marks: " + avgMarks);
			System.out.print("Remark: ");
			if (avgMarks >= 85) {
				System.out.println("Excellent");
			} else if (avgMarks >= 75) {
				System.out.println("Distinction");
			} else if (avgMarks >= 60) {
				System.out.println("First Class");
			} else if (avgMarks >= 40) {
				System.out.println("Pass");
			} else {
				System.out.println("Poor");
			}
		}
		
		in.close();
	}
	
}