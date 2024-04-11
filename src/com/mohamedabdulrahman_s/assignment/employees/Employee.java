package com.mohamedabdulrahman_s.assignment.employees;

public class Employee {
    public String name;
    private int age;
    /**
	 * @param name
	 * @param age
	 * @param employeeId
	 * @param salary
	 */
	public Employee(String name, int age, int employeeId, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	int employeeId;
    private double salary;
    public static int totalEmployees =  0;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
    
}
