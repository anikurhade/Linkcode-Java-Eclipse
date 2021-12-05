package test.entity;

public class Student {
int enrid;
String name;
String DOB;

public Student(int enrid, String name, String dOB) {
	super();
	this.enrid = enrid;
	this.name = name;
	DOB = dOB;
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
