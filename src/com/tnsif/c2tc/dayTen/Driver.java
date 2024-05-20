package com.tnsif.c2tc.dayTen;

public class Driver {

	public static void main(String[] args) 
	{
		int n=10;
		int a[]; //declaration
		a= new int[n];//Instantiation

		ArrayOperations.printArray(a); //Displaying the array
		
		
		//assigning the values of A 
		for(int i=0;i<a.length;i++)
			a[i]=5*i;
		
		ArrayOperations.printArray(a); //Displaying the array
		
		int b[]= {10,2,3,4,50}; //Initialization
		ArrayOperations.printArray(b); //Displaying the array
		System.out.println("Odd Count : "+ArrayOperations.getOddCount(b));
		System.out.println("Even Count : "+(b.length - ArrayOperations.getOddCount(b)) );
      
		System.out.println("Odd Elements ");
		ArrayOperations.printOddElement(b);
		System.out.println("\nEven Elements ");
		ArrayOperations.printEvenElement(b);
	}
	}