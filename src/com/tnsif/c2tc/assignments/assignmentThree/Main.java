package com.tnsif.c2tc.assignments.assignmentThree;
import java.util.*;

public class Main {
	 static Scanner in = new Scanner(System.in);
	public static void createNewAccount(String accType) {
		String name;
    	long phNo;
    	short age;
    	double balance;
    	short pin;
    	System.out.print("Enter Name : ");
    	name = in.nextLine();
    	in.nextLine();
    	System.out.print("Enter Phone Number : ");
    	phNo = in.nextLong();
    	System.out.print("Enter Age : ");
    	age = in.nextShort();
    	System.out.print("Deposit Amount : ");
    	balance = in.nextDouble();
    	System.out.print("Enter Four Digit Pin : ");
    	pin = in.nextShort();
    	if(accType == "savings")
    	Bank.newSavingsAccount(accType, name, age, phNo, pin, balance);
    	else {
    		int linkAccountNo ;
    		System.out.println("Enter your another bank account No : ");
    		linkAccountNo = in.nextInt();
    		Bank.newCheckingAccount(accType, name, age, phNo, pin, balance, linkAccountNo);
    		
    	}
    	
	}
	public static void main(String[] args)
	{
	  
		boolean loop = true;
		int option;
	   System.out.println("-------- Welcome to Our Bank --------");
		while(loop)
		{
		    System.out.println("--- Choose a Transaction ---");
		    System.out.println(" 1. Create New Account ");
		    System.out.println(" 2. Deposit ");
		    System.out.println(" 3. Withdraw ");
		    System.out.println(" 4. Balance Enquiry ");
		    System.out.println(" 5. Exit");
		    option = in.nextInt();
		    switch(option) {
		    case 1:{
		    	System.out.println("---- New Account ----");
		    	System.out.println("Choose Your Account Type : \n"+"1.Savings\n2.Current");
		    	int op = in.nextInt();
		    	
		    	String accType;
		    	
		    	if( op == 1) {
		    		accType = "savings";
		    		createNewAccount(accType);
		    		
		    	}
		    	else if( op == 2) {
		    		accType = "checking";
		    		createNewAccount(accType);
		    	}
		    	else {
		    		System.out.println("Account Type is Invalid!");
		    		
		    	}
		    	
		    break;
		    }
		    case 2:
		    {
		    
		    	Transaction trans = new Transaction();
		    	trans.performTransaction("deposit");
		    	System.out.println("Transaction Id : "+trans.transId);
		    	break;
		    }
		    case 3:
		    {
		   
		    	Transaction trans = new Transaction();
		    	trans.performTransaction("withdraw");
		    	System.out.println("Transaction Id : "+trans.transId);
		    	break;
		    }
		    case 4:
		    {
		    	Transaction trans = new Transaction();
		    	trans.performTransaction("balanceEnquiry");
		    	System.out.println("Transaction Id : "+trans.transId);
		    	break;
		    	
		    }
		    case 5:
		    {
		    	loop = false;
		    	System.out.println("--- Thank You ---");
		    	break;
		    }
		    default :{
		    	System.out.println(" Enter a Valid Option !");
		    	break;
		    }}
		    System.out.println("xxxx\n");
		    
		    
		    
		    
		    }
		
	}

}
