package com.entity;

import java.util.Scanner;

public class Info {
	Scanner sc= new Scanner(System.in);
public Student Acceptdata()
{ int id=104;
	Student s=new Student();
	System.out.println("\t----------- Enter Student Data-------");
	s.Stud_ID=id++;
	System.out.print("Enter Student Name :-  ");
	s.Stud_Name=sc.next();
	System.out.print("Enter Student  Date Of Birth:-  ");
	s.Stud_dob=sc.next();
	return s;
	
}
public Course AcceptCoursdata()
{ int id=100;
	Course c=new Course();
	System.out.println("\t----------- Enter Course Data-------");
	c.course_id=id++;
	System.out.print("Enter Course Name :-  ");
	c.course_name=sc.next();
	System.out.print("Enter Course Fees :-  ");
	c.course_fees=sc.nextInt();
	System.out.print("Enter Course Duration :-  ");
	c.course_duration=sc.next();
	
	return c;
	
}
public void display(Student stud) {
	System.out.println("\t----------- Student Data-------");
	System.out.println("ID :- "+stud.Stud_ID);
	System.out.println("Name :- "+stud.Stud_Name);
	System.out.println("Date Of Birth  :- "+stud.Stud_dob);
	
}
public void display(Course c) {
	System.out.println("\t----------- Course Information-------");
	System.out.println("ID :- "+c.course_id);
	System.out.println("Name :- "+c.course_name);
	System.out.println("Fees  :- "+c.course_fees);
	System.out.println("Duration  :- "+c.course_duration);	
}
}
