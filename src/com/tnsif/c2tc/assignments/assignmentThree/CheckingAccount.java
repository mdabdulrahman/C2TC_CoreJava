package com.tnsif.c2tc.assignments.assignmentThree;

public class CheckingAccount extends Account 
{
	  
      private short pin ;
      private int minBal;
      private int TransactionLimit;
      private int totTransactions;
  	  private double balance;
  	  private int linkAccountNo;
  	  private int overdraftLimit;
  	  private int totOverDraft;
   
	@Override
	public boolean deposit(double amount) {
		balance += amount;
		return true;
	}

	@Override
	public double withdraw(double amount,short pin) {
	 if(checkPin(pin))
	 {
		//checking transaction limit
		if( totTransactions > TransactionLimit) {
			System.out.println("Transaction Limit Exceeded!");
			return balance;
		}
		
		if( amount > balance) {
			
	    	      overDraft(amount);
	    }
	    else 
	    {
	    	balance -= amount;
	    	System.out.println("Withrawal is Successfull !");
	    	totTransactions++;
	    }
	    
		return balance;
	 }

 		System.out.println("Incorrect Pin Number !");
 		return 0;
 
	 
	}
	private boolean checkPin(short pin) {
		return this.pin == pin;
	}
  
   public boolean overDraft(double amount)
   {
	   double linkBal = 0;
	   double totBal;
       Account account = Bank.getAccount(linkAccountNo);
       //if linkAccount doesn't exists
       if(account==null)
       {
     	  System.out.println("Insufficient balance and Linked Account is doesn't exist!");
     	  return false;
       }
      
      linkBal = account.getBalance();  //getting linked account balance
      totBal = linkBal+balance;        //adding this account balance and linked account
      if(totBal > amount)              
      {
 	     totOverDraft++;
 	     System.out.println("OverDraft From Linked Account No : "+linkAccountNo);
 	     amount -= balance;         //subtracting amount from balance
 	     balance = 0;
 	     Transaction trans = new Transaction();
 	     trans.overDraft(account,amount);
 	     return true;
      }
     
 	  System.out.println("Insufficient Balance in Linked Account Also!");
 	  return false;
     
   }
	/**
	 * @param accNo
	 * @param name
	 * @param age
	 * @param phNo
	 * @param pin
	 * @param minBal
	 * @param dailyTransactionLimit
	 * @param balance
	 * @param linkAccountNo
	 * @param overdraftLimit
	 * @param totOverDraft
	 */
	public CheckingAccount(String accType,String name, short age, long phNo, short pin,double balance, int linkAccountNo) {
		super(accType,name, age, phNo);
		this.pin = pin;
		this.minBal = 2000;
		this.TransactionLimit = 10;
		this.balance = balance;
		this.linkAccountNo = linkAccountNo;
		this.overdraftLimit = 15;
		this.totOverDraft = 0;
		totTransactions=0;
	}

	@Override
	public double getBalance() {
		
		return balance;
	}

	short getPin() {
		return pin;
	}

	void setPin(short pin) {
		this.pin = pin;
	}

	int getMinBal() {
		return minBal;
	}

	void setMinBal(int minBal) {
		this.minBal = minBal;
	}

	int getLinkAccountNo() {
		return linkAccountNo;
	}

	void setLinkAccountNo(int linkAccountNo) {
		this.linkAccountNo = linkAccountNo;
	}

	int getOverdraftLimit() {
		return overdraftLimit;
	}

	void setOverdraftLimit(int overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	int getTotOverDraft() {
		return totOverDraft;
	}

	void setTotOverDraft(int totOverDraft) {
		this.totOverDraft = totOverDraft;
	}

	


}
