package com.tnsif.c2tc.daysix;

public class Student extends Citizen
{
    private long rollNo;
    private String clgName;
	/**
	 * @param rollNo
	 * @param clgName
	 */
	public Student(String name, long aadharNo, String address, long phNo,long rollNo, String clgName) {
		super(name,aadharNo,address,phNo);
		this.rollNo = rollNo;
		this.clgName = clgName;
	}
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
    
}
