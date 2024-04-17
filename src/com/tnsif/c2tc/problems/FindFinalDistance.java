package com.tnsif.c2tc.problems;
import java.util.Scanner;
public class FindFinalDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x = 0 , y = 0 , n;                //origin x,y
       int distUnit = 10;       //initially distance unit is 10
       boolean isX = true;     //true means x axis false means y axis
       boolean isPos = true;  //true means right & upwards direction false means left & downwards direction
       Scanner in = new Scanner(System.in);
       System.out.println("Enter N : ");
       n = in.nextInt();
       while(n > 0) 
       {
    	   
    	   if(isX && isPos)         //moving axis x and direction is right
    	   {   //turns right
    		   x = x+distUnit;
    	   }
    	   else if( isX && !isPos)  //moving axis x and direction is left
    	   {    //turns left
    		   x = x-distUnit;
    	   }
    	   else if( !isX && isPos ) //moving axis x and direction is upwards
    	   {    //turns upwards
    		   y = y+distUnit;
    		   isPos = !isPos;
    	   }
    	   else                     //moving axis y and direction is downward
    	   {   //turns downward
    		   y = y-distUnit;
    		   isPos = !isPos;
    	   }
    	   
    	  isX = !isX;        //changing axis after each travel
    	  n--;
    	  distUnit += 10;   //increasing distance unit by 10
       }
       System.out.println(x+" "+y);
       in.close();
	}

}
