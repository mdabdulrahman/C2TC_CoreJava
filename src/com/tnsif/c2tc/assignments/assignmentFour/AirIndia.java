package com.tnsif.c2tc.assignments.assignmentFour;

public class AirIndia implements AirFare 
{
	private int hours;
	private double costPerHour;
 
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getCostPerHour() {
		return costPerHour;
	}
	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}
	public AirIndia()
	{
	    	
	    }
	public AirIndia(int hours, double costPerHour) {
		super();
		this.hours = hours;
		this.costPerHour = costPerHour;
	}
	@Override
	public double calculateAmount() 
	{
		return hours*costPerHour;
	}
	
 
}
