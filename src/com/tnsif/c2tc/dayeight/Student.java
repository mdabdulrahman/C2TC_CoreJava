package com.tnsif.c2tc.dayeight;
//program to demonstrate the marker class
public class Student implements Registrable
{
	private int stuId;
    private String name;
    private double fees;
    private String Course;
	/**
	 * @param stuId
	 * @param name
	 * @param fees
	 * @param course
	 */
	public Student(int stuId, String name, double fees, String course) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.fees = fees;
		Course = course;
	}
	int getStuId() {
		return stuId;
	}
	void setStuId(int stuId) {
		this.stuId = stuId;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getFees() {
		return fees;
	}
	void setFees(double fees) {
		this.fees = fees;
	}
	String getCourse() {
		return Course;
	}
	void setCourse(String course) {
		Course = course;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + ", fees=" + fees + ", Course=" + Course + "]";
	}
}
