package com.tnsif.assignments.assignmentFive;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String[] inputs = in.nextLine().split(",");
		String stageEvent = inputs[0];
		String customer = inputs[1];
		Integer noOfSeats = Integer.valueOf(inputs[2]);
		TicketBooking tb = new TicketBooking(stageEvent,customer,noOfSeats);
		System.out.println("Choose your payment method : \n1.Cash Payment\n2.Wallet Payment\n3.Credit Card Payment");
		int option = in.nextInt();
		double amount;
		switch( option )
		{
	     	case 1:
			 System.out.print("Enter Amount : ");
			 amount = in.nextDouble();
			 tb.makePayment(amount);
			 break;
	     	case 2:
	     	 System.out.print("Enter Wallet Number : ");
	     	 String w = in.next();
	     	 System.out.print("Enter Amount : ");
	     	 amount = in.nextDouble();
	     	 tb.makePayment(w,amount);
	     	 break;
	     	case 3:
	     	 System.out.print("Enter Amount : ");
		     amount = in.nextDouble();
		     System.out.print("Card Name : ");
		     String creditCard = in.next();
		     System.out.print("Enter ccv : ");
		     String ccv = in.next();
		     tb.makePayment(customer,amount,creditCard,ccv);
		     break;
		    default:
		    	System.out.println("Invalid Option !");
	     	  
		}

	}

}
