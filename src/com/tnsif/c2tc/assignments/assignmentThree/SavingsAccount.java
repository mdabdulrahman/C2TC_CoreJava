package com.tnsif.c2tc.assignments.assignmentThree;

public  class SavingsAccount extends Account
{
      private double interestRate;
      private short pin ;
      private int minBal;
      private int TransactionLimit;
  	  private double balance;
  	  private int totalTransactions;
	@Override
	public boolean deposit(double amount) {
	    balance += amount;
	    
		return true;
	}
	@Override
	public double withdraw(double amount) {
		if(TransactionLimit < totalTransactions) {
			System.out.println("Transaction Limit Exceeded!");
			return balance;
		}
	  if( balance < amount )
		  System.out.println("Insufficient Balance !");
	  
	  else
	  {
		  balance -= amount;
		  System.out.println("Withdrawal  Successfull !");
		   totalTransactions++;
	  }
		  return balance;
	  
	}
	@Override
	public double getBalance() {
		
		return balance;
	}
	double getInterestRate() {
		return interestRate;
	}
	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
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
	int getTransactionLimit() {
		return TransactionLimit;
	}
	void setTransactionLimit(int transactionLimit) {
		TransactionLimit = transactionLimit;
	}
	int getTotalTransactions() {
		return totalTransactions;
	}
	void setTotalTransactions(int totalTransactions) {
		this.totalTransactions = totalTransactions;
	}
	void setBalance(int balance) {
		this.balance = balance;
	}
	boolean checkPin(short pin) {
		return this.pin == pin;
	}
	/**
	 * @param name
	 * @param age
	 * @param phNo
	 * @param interestRate
	 * @param pin
	 * @param minBal
	 * @param transactionLimit
	 * @param balance
	 * @param totalTransactions
	 */
	public SavingsAccount(String accType,String name, short age, long phNo,short pin, double balance) {
		super(accType,name, age, phNo);
		this.interestRate = 2.25;
		this.pin = pin;
		this.minBal = 500;
		TransactionLimit = 5;
		this.balance = balance;
		this.totalTransactions = 0;
	}
	
    
      
}
