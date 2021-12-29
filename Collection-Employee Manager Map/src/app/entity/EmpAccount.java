package app.entity;

public class EmpAccount {
String Name;
int Salary;
String Department;
String Designation;
public EmpAccount(String name, int salary, String department, String designation) {
	super();
	Name = name;
	Salary = salary;
	Department = department;
	Designation = designation;
}
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
