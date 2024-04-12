package com.tnsif.c2tc.assignments.assignmentTwo;
import java.util.Scanner;
public class GetDetails {

	public static void main(String[] args) 
	{
		
		String name;
		long rollNo;
		char grade;
		float percentage;
		System.out.println("Enter Details :");
		Scanner in = new Scanner(System.in);
		name = in.nextLine();
		rollNo = in.nextLong();
		grade = in.next().charAt(0);
		percentage = in.nextFloat();
		System.out.println(name+"\n"+rollNo+"\n"+grade+"\n"+percentage+"%");

	}

}
