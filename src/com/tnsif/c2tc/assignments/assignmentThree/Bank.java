package com.tnsif.c2tc.assignments.assignmentThree;
import java.util.*;

public class Bank {
   
	private static int totalAccounts;
	private static int totalTransactions =0;
	private static Map<Integer,SavingsAccount>  savings = new HashMap<>();
	private static Map<Integer,CheckingAccount> checking = new HashMap<>();
	static int getTotalAccounts()
	{
		return totalAccounts;
	}
	static void setTotalAccounts() {
		totalAccounts++;
	}
	static SavingsAccount getSavingsAccount(int accNo) {
		return savings.get(accNo);
	}
	static CheckingAccount getCheckingAccount(int accNo) {
		return checking.get(accNo);
	}
	static Account getAccountType(int accNo)
	{
		if(getSavingsAccount(accNo) == null ) {
			if(getCheckingAccount(accNo) == null) {
				return null;
			}
			else {
				return getCheckingAccount(accNo);
			}
		}
		else {
			return getSavingsAccount(accNo);
		}
	}
	static void newSavingsAccount(String accType,String name, short age, long phNo,short pin, double balance)
	{
		SavingsAccount acc = new SavingsAccount(accType,name,age,phNo,pin,balance);
		savings.put(acc.getAccNo(), acc);
		System.out.println("----------------------------------------");
		System.out.println(" Savings Account Created Successfully ! ");
		System.out.println(" Account Number : "+acc.getAccNo());
		System.out.println("----------------------------------------");
	}
	static void newCheckingAccount(String accType,String name, short age, long phNo,short pin, double balance,int linkAccountNo)
	{
		CheckingAccount acc = new CheckingAccount(accType,name,age,phNo,pin,balance,linkAccountNo);
		checking.put(acc.getAccNo(), acc);
		System.out.println("----------------------------------------");
		System.out.println(" Checking Account is created Successfully ! ");
		System.out.println(" Account Number : "+acc.getAccNo());
		System.out.println("----------------------------------------");
		
	}
	public static int getTotalTransactions() {
		return totalTransactions;
	}
	public static void increTransactions() {
		totalTransactions++;
	}
	
	
	
}
