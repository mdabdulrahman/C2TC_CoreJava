package com.tnsif.c2tc.assignments.assignmentFour;

public class KingFisher implements AirFare {

	@Override
	public double calculateAmount() {
		double  amount = (double) hours * costPerHour;
		return (double)amount*4;
	}
	private int hours;
	private double costPerHour;
	public KingFisher(int hours, double costPerHour) {
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
