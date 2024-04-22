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
    	Account account =Bank.getAccount(accNo);
    	if(account == null)
    	  System.out.println("Account is Not found !");
    	
    	if(account != null && account.deposit(amount))
    	{
    		System.out.println("Transaction Succesfull! ");
    		System.out.println("Available Balance : "+account.getBalance());
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
    	Account account=Bank.getAccount(accNo);
    	System.out.println("Available Balance : "+account.withdraw(amount,pin));
    	return true;
    
    }

    private void getBalance()
    {
    	double bal;
    	
    	System.out.print("Enter Account Number : ");
    	int accNo = in.nextInt();
    	Account account =Bank.getAccount(accNo);
        bal = account.getBalance();
        System.out.println("Available Balance: "+bal);
        
    	
    }
   final boolean overDraft(Account account,double amount) {
	   System.out.println("Enter linked account's Pin : ");
   	   short pin = in.nextShort();
   	   
   	  System.out.println("Available balance in linked account :"+account.withdraw(amount, pin)); 
   	   return true;
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
