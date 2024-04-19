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
	public double withdraw(double amount) {
		if( totTransactions > TransactionLimit) {
			System.out.println("Transaction Limit Exceeded!");
		}
	    if( amount > balance) {
	    	      double linkBal =0;
	    	      double totBal;
	              Account atype = Bank.getAccountType(linkAccountNo);
	              
	              if(atype==null)
	              {
	            	  System.out.println("Insufficient balance and Linked Account is doesn't exist!");
	            	  return balance;
	              }
	              String type = atype.getAccType();
	              Account acc;
	              if(type == "savings") {
	            	  
	            	acc = Bank.getSavingsAccount(linkAccountNo);
	            	 linkBal = acc.getBalance();
	            	 
	              }
	              else {
	            	 acc = Bank.getCheckingAccount(linkAccountNo);
	            	  linkBal = acc.getBalance();
	              }
	              totBal = linkBal+balance;
	          if(totBal > amount) {
	        	  totOverDraft++;
	        	  System.out.println("OverDraft From Linked Account No : "+linkAccountNo);
	        	  amount -= balance;
	        	  balance =0;
	        	  
	        	  acc.withdraw(amount);
	        	  
	          }
	          else
	          {
	        	  System.out.println("Insufficient Balance in Linked Account Also!");
	          }
	    }
	    else 
	    {
	    	balance -= amount;
	    	System.out.println("Withrawal is Successfull !");
	    	totTransactions++;
	    }
	    
		return balance;
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

	boolean checkPin(short pin) {
		return this.pin == pin;
	}


}
