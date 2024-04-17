package com.tnsif.c2tc.problems;
import java.util.Scanner;
public class ComputePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int val,rem;
        System.out.println("Enter Value : ");
        val = in.nextInt();
        int price = 1;
        while(val > 0) {
        	rem = val%10;   //to get last digit of integer ex. 45%10 = 5 
        	val = val/10;   
        	price = price*rem;  //multiply each digits
        }
        System.out.println(price);
        in.close();
        
	}

}
