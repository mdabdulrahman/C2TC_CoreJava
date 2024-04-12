package com.tnsif.c2tc.assignments.assignmentTwo;
import java.util.Scanner;
public class Commission 
{
     String name;
     String address;
     long phone;
     float salesAmount;
     Scanner in = new Scanner(System.in);
	/**
	 * @param name
	 * @param address
	 * @param phone
	 * @param salesAmount
	 */
     //To accept details of the sales employee
	public void enterDetails() {
		System.out.println("Enter Sales Employee Details : ");
		System.out.print("Name : ");
		this.name = in.nextLine();
		System.out.print("Address : ");
		this.address = in.nextLine();
		System.out.print("Phone No : ");
		this.phone = in.nextLong();
		System.out.print("Sales Amount : ");
		this.salesAmount = in.nextFloat();
	}
	
	
    public float calculateCommission() 
    {
    	if(salesAmount >= 100000 ) 
    	{
    		return salesAmount*0.1f;
    	}
    	else if( 50000 <= salesAmount && salesAmount<100000) 
    	{
    		return salesAmount*0.05f;
    	}
    	else if(30000 <= salesAmount && salesAmount<50000)
    	{
    		return salesAmount*0.03f;
    	}
    	
    	return 0;
    	
    }   
	
     
     
}
