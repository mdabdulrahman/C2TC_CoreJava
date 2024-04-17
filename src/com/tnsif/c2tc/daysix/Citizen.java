package com.tnsif.c2tc.daysix;

public class Citizen 
{
    private String name;
    private long aadharNo;
   private String address;
    private long phNo;
	/**
	 * @param name
	 * @param aadharNo
	 * @param address
	 * @param phNo
	 */
	public Citizen(String name, long aadharNo, String address, long phNo) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.phNo = phNo;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
}
