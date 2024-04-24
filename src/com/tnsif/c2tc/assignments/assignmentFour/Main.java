package com.tnsif.c2tc.assignments.assignmentFour;

import java.util.Scanner;

public class Main
{
      public static void main(String[] args)
      {
    	  Scanner in = new Scanner(System.in);
    	  
    	  System.out.println("1. AirIndia \n2. KingFisher\n3. Indigo");
    	  int option = in.nextInt();
    	  //to ensure the option is between 1 to 3
    	  //because option value is used as index value in the flightsFare[]
    	  while(option > 3 || option <= 0 )
    	  {
    		  System.err.print("Invalid Option\nEnter correct Option Again : ");
    	      option = in.nextInt();
    	  }
    	  
    	  int hours = in.nextInt();  //to get hours
    	  double costPerHour = in.nextDouble();
    	  AirFare[] flightsFare = { new AirIndia(hours,costPerHour),new KingFisher(hours,costPerHour),new Indigo(hours,costPerHour)};
    	  System.out.println( flightsFare[option-1].calculateAmount() );

      }
}
