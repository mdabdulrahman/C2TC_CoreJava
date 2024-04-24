package com.tnsif.c2tc.assignments.assignmentFour;

public class Indigo implements AirFare{

	@Override
	public double calculateAmount() {
		double amount = (double) hours * costPerHour;
		return (double)amount * 8;
	}
	private int hours;
	private double costPerHour;
	public Indigo(int hours, double costPerHour) {
		super();
		this.hours = hours;
		this.costPerHour = costPerHour;
	}
	
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
	

}
