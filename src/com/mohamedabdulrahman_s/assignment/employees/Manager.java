package com.mohamedabdulrahman_s.assignment.employees;

public class Manager extends Employee {
   public String teamName;
   protected int performanceRating;
   private int totalProjectsManaged ;
public int getTotalProjectsManaged() {
	return totalProjectsManaged;
}
public void setTotalProjectsManaged(int totalProjectsManaged) {
	this.totalProjectsManaged = totalProjectsManaged;
}
/**
 * @param name
 * @param age
 * @param employeeId
 * @param salary
 * @param teamName
 * @param performanceRating
 * @param totalProjectsManaged
 */
public Manager(String name, int age, int employeeId, double salary, String teamName, int performanceRating,
		int totalProjectsManaged) {
	super(name, age, employeeId, salary);
	this.teamName = teamName;
	this.performanceRating = performanceRating;
	this.totalProjectsManaged = totalProjectsManaged;
}


   
   
}
