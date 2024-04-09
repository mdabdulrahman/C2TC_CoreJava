package com.tnsif.c2tc.daythree;

public class Person {

	private String name;
	private int income;
	private int age;
	private int tax;
	private String gender;
	@Override
	public String toString() {
		return "Person [name=" + name + ", income=" + income + ", age=" + age + ", tax=" + tax + ", gender=" + gender
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
