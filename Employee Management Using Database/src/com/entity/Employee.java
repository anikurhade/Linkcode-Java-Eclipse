package com.entity;

public class Employee {
	int id;
	public Employee(int id, String name, int salary, String department, String designation) {
		super();
		this.id = id;
		Name = name;
		Salary = salary;
		Department = department;
		Designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String Name;
	int Salary;
	String Department;
	String Designation;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}

}
