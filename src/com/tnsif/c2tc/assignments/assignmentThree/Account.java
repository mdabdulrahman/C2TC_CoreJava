package com.tnsif.c2tc.assignments.assignmentThree;

public abstract class Account {
   
	public abstract boolean deposit(double amount);
	public abstract double withdraw(double amount);
	public abstract double getBalance();
	

	private final int accNo;
	private String name;
	private short age;
	private long phNo;
	private final String accType;
	/**
	 * @param balance
	 * @param accNo
	 * @param name
	 * @param age
	 * @param phNo
	 */
	public Account(String accType, String name, short age, long phNo) {
		super();
	    Bank.setTotalAccounts();
		accNo = Bank.getTotalAccounts()+690;
		this.accType = accType;
		this.name = name;
		this.age = age;
		this.phNo = phNo;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	short getAge() {
		return age;
	}
	void setAge(short age) {
		this.age = age;
	}
	long getPhNo() {
		return phNo;
	}
	void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	int getAccNo() {
		return accNo;
	}
	String getAccType() {
		return accType;
	}
	
	
	
	
}
