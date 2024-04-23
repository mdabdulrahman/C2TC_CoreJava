package com.tnsif.c2tc.dayeight;

public class Account 
{
     private int accNo;
     private String Name;
     private double balance;
     private Bank bank;
	/**
	 * @param accNo
	 * @param name
	 * @param balance
	 * @param bank
	 */
	public Account(int accNo, String name, double balance, Bank bank) 
	{
		
		this.accNo = accNo;
		Name = name;
		this.balance = balance;
		this.bank = bank;
	}
	void deposit(double amount)
	{
		bank.deposit(this, amount);
	}
	int getAccNo() {
		return accNo;
	}
	void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	String getName() {
		return Name;
	}
	void setName(String name) {
		Name = name;
	}
	double getBalance() {
		return balance;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", Name=" + Name + ", balance=" + balance + ", bank=" + bank + "]";
	}
     
     
}
