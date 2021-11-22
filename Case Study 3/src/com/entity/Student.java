package com.entity;

import java.util.Date;

public class Student {
public int Stud_ID;
public String Stud_Name;
public String Stud_dob;
public int getStud_ID() {
	return Stud_ID;
}
public void setStud_ID(int stud_ID) {
	Stud_ID = stud_ID;
}
public String getStud_Name() {
	return Stud_Name;
}
public void setStud_Name(String stud_Name) {
	Stud_Name = stud_Name;
}
public String getOb() {
	return Stud_dob;
}
public void setOb(String ob) {
	this.Stud_dob = ob;
}
public Student(int stud_ID, String stud_Name, String stud_dob) {
	super();
	Stud_ID = stud_ID;
	Stud_Name = stud_Name;
	Stud_dob = stud_dob;
}
public Student() {
	// TODO Auto-generated constructor stub
}


}
