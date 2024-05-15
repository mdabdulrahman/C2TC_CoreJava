package com.tnsif.dayTen;

public class ArrayOperations 
{
	//print in array 
	static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		System.out.println();		
	}
	
	
	//count  no .of.odd elements
	public  static int getOddCount(int b[])
	{
		int count = 0;
		for( int i =0; i < b.length;i++)
		{
		  if( b[i]%2!=0)
		   count++;
		}
		return count;
		
	}	
	//count  no .of.odd elements
	public  static int getEvenCount(int b[])
	{
		int count = 0;
		for( int i =0; i < b.length;i++)
		{
		  if( b[i]%2==0)
		   count++;
		}
		return count;
		
	}	
	
	public static void printOddElement(int b[])
	{
		for( int i = 0; i < b.length; i++)
		{
			if( b[i]%2 != 0 )
				System.out.print(b[i]+"\t");
		}
	}
	public static void printEvenElement(int b[])
	{
		for( int i = 0; i < b.length; i++)
		{
			if( b[i]%2 == 0 )
				System.out.print(b[i]+"\t");
		}
	}
	
	}
