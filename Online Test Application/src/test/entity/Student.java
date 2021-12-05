package test.entity;

public class Student {
int enrid;
String name;
String DOB;
int dept;
String Pass;
public Student(int enrid, String name, String dOB, int dept, String pass) {
	super();
	this.enrid = enrid;
	this.name = name;
	DOB = dOB;
	this.dept = dept;
	Pass = pass;
}

public Student() {
	// TODO Auto-generated constructor stub
}

public String getPass() {
	return Pass;
}

public void setPass(String pass) {
	Pass = pass;
}

public int getDept() {
	return dept;
}

public void setDept(int dept) {
	
	this.dept = dept;
}

public int getEnrid() {
	return enrid;
}
public void setEnrid(int enrid) {
	this.enrid = enrid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB = dOB;
}

}
