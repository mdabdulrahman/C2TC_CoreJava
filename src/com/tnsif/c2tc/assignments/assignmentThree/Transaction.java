package com.tnsif.c2tc.assignments.assignmentThree;
import java.util.Scanner;
public final class Transaction {
    final int transFee = 20;
    int transId = Bank.getTotalTransactions()+1;
    Scanner in = new Scanner(System.in);
     boolean deposit()
    {
    	System.out.println("----------- Deposit ----------------");
    	System.out.print("Enter Account Number : ");
    	int accNo = in.nextInt();
    	System.out.print("Enter the amount to deposit : ");
    	double amount = in.nextDouble();
    	Account atype =Bank.getAccountType(accNo);
    	if(atype == null)
    	{
    		System.out.println("Account not Found!");
    		return false;
    	}
    	if( atype.getAccType() == "savings") {
    		if(depositSavings(Bank.getSavingsAccount(accNo),amount)) {
    			return true;
    		}
    		else
    			return false;
    		
    	}
    	else if( atype.getAccType() == "checking")
    	{
    		if(depositChecking(Bank.getCheckingAccount(accNo),amount)) {
    			return true;
    		}
    		else
    			return false;
    	}
    	return false;
    	
    	
    }
    private boolean depositSavings(SavingsAccount acc,double amount) {
    	if (acc.deposit(amount))
    	{
    		System.out.println("Transaction Succesfull! ");
    		System.out.println("Available Balance : "+acc.getBalance());
    		System.out.println("----------- xxxxxxx ----------------");
    		return true;
    	}
    	System.out.println("Transaction Failed !");

    	return false;
    }
    private boolean depositChecking(CheckingAccount acc,double amount) {
    	if(acc.deposit(amount))
    	{
    		System.out.println("Transaction Succesfull! ");
    		System.out.println("Available Balance : "+acc.getBalance());
    		System.out.println("----------- xxxxxxx ----------------");
    		return true;
    	}
    	System.out.println("Transaction Failed !");
   
    	return false;
    }
    private boolean withdraw() 
    {
    	System.out.println("----------- Withdraw ----------------");
    	System.out.print("Enter Account Number : ");
    	int accNo = in.nextInt();
    	System.out.print("Enter the amount to withdraw : ");
    	double amount = in.nextDouble();
    	amount+=transFee;
    	System.out.println("Enter Pin : ");
    	short pin = in.nextShort();
    	Account atype =Bank.getAccountType(accNo);
    	if(atype == null)
    	{
    		System.out.println("Account not Found!");
    		return false;
    	}
    	if( atype.getAccType() == "savings") {
    		if(withdrawSavings(Bank.getSavingsAccount(accNo),amount,pin)) {
    			return true;
    		}
    		else
    			return false;
    		
    	}
    	else if( atype.getAccType() == "checking")
    	{
    		if(withdrawChecking(Bank.getCheckingAccount(accNo),amount,pin)) {
    			return true;
    		}
    		else
    			return false;
    	}
    	return false;
    }
    private boolean withdrawSavings(SavingsAccount acc,double amount,short pin) {
    	if(acc.checkPin(pin)) {
    		System.out.println(acc.withdraw(amount));
    		
    		return true;
    	}
    	else
    	{
    		System.out.println("Incorrect Pin Number !");
   
    		return false;
    	}
    }
    private boolean withdrawChecking(CheckingAccount acc,double amount,short pin) {
    	if(acc.checkPin(pin)) {
    		System.out.println("Available Balance : "+acc.withdraw(amount));
    		
    		return true;
    	}
    	else
    	{
    		System.out.println("Incorrect Pin Number !");
    		
    		return false;
    	}
    }
    private void getBalance()
    {
    	double bal;
    	
    	System.out.print("Enter Account Number : ");
    	int accNo = in.nextInt();
    	Account atype =Bank.getAccountType(accNo);
    	if(atype == null)
    	{
    		System.out.println("Account not Found!");
    		return;
    	}
    	if( atype.getAccType() == "savings") {
    		bal =Bank.getSavingsAccount(accNo).getBalance();
    	
    		System.out.println("Available Balance : "+bal);
    		
    	}
    	else if( atype.getAccType() == "checking")
    	{
    		bal =Bank.getCheckingAccount(accNo).getBalance();
    	
    		System.out.println("Available Balance : "+bal);
    	
    	}
    	
    }
   
	public final boolean performTransaction(String transactionType) {
		Bank.increTransactions();
		switch(transactionType) {
		 
		   case "deposit" : {
			   deposit();
			   
		       break;
		   }
		   case "withdraw" : {
			 withdraw();
			break;   
		   }
		   case "balanceEnquiry" : {
			   getBalance();
			   break;
		   }
		   case "changePin" : {
			   break;
		   }
		   default : {
			   
		   }
		
		}
		return true;
		
	}
	
}
