package com.mohamedabdulrahman_s.assignment.employees;

public class Developer extends Employee{
    public String githubUserName;
    public int currProject;
	/**
	 * @param name
	 * @param age
	 * @param employeeId
	 * @param salary
	 * @param githubUserName
	 * @param currProject
	 */
	public Developer(String name, int age, int employeeId, double salary, String githubUserName, int currProject) {
		super(name, age, employeeId, salary);
		this.githubUserName = githubUserName;
		this.currProject = currProject;
	}
	
}
