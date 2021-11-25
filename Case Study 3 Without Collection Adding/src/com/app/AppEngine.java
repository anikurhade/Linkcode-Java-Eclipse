package com.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

import com.entity.Admin;
import com.entity.Course;
import com.entity.Enroll;
import com.entity.Student;

public class AppEngine {
	static Scanner sc=new Scanner(System.in);
	Course c[]=new Course[10];
	Student sarr[]=new Student[10];

	Enroll eList[]=new  Enroll[10];
	ArrayList<Admin> adminlist=new ArrayList<Admin>(5);
	
	int id=102;
	Date d1=new Date();
	private  int co,eo;
	private  int lo=co=eo=0;
	Admin a1=new Admin(101, "Anirudha", "Ani200");
	Admin a2=new Admin(102, "Admin", "admin");
	 public void introduce()
	 {
       adminlist();
	 }
	private void adminlist() {
		
			adminlist.add(a1);
			adminlist.add(a2);
			
	
	}
	public void Addnew()
	{
		adminlist.add(regnewAdmin());
	}
	
	
	public Admin regnewAdmin()
	{ 
		
		System.out.println("----------------------Enter Your Info --------------------------");
	    id++;
	    System.out.print("Enter Your Name :-  ");
		String name=sc.next();
		System.out.print("Enter Your Password :-  ");
		String password=sc.next();
	    Admin new_admin=new Admin(id, name, password);
		return new_admin;
	}
	public void viewAdminNames()
	{
		System.out.println("\n-------------------------------------------------------------\n");
		System.out.println("Admin Id \t Admin Name");
		for (Admin admin : adminlist) {
			System.out.println(admin.getId()+"\t\t"+admin.getName());
		}
		
	}
	public Admin checkadmin()
	{
		Admin corradm = null;
		int count=0,idflag=0;
		int id;
		String pass;
		System.out.println("\n-------------------------------------------------------------");
		 System.out.print("Enter Your Admin Id :- ");
		 id=sc.nextInt();
		 
		for (Admin admin : adminlist) {
			if(admin.getId()==id)
			{
				idflag=1;
				do {
				System.out.print("Enter Your Passcode :-");
				 pass=sc.next();
				 pass.trim();
				if((admin.getPassword()).equals(pass))
				{
					corradm=admin;
					break;
				}
				else
				{
					count++;
					System.out.println("Sorry Wrong Pasword");
				}
				}while(count<3);
			}
		   if(admin==null)
			{
				break;
			}
		}
		if(idflag==0)
		{
			System.out.println("Sorry No Admin Id Found !!");
		}
		return corradm;
		
	}
	
	public Course[] listOfCourses() {
		c[0]=new Course(101, "Core Java","3 Months",4000);
		c[1]=new Course(102, "Advance Java","3 Months",6000);
		c[2]=new Course(103, "C","2 Months",4000);
		for (Course course : c) {
			co++;
			if(course==null)
			{
				break;
			}
			else
				displayCourses(course);
		}
		co--;
		
		return c;

    }
	public Student[] listOfStudents() {
		
		 sarr[0]=new Student(101, "Hermionie Granger",d1.toLocaleString(),"her101");;
		 sarr[1]=new Student(102, "Harry Potter",d1.toLocaleString(),"harry102");
		 sarr[2]=new Student(103, "Ronal Weasely",d1.toLocaleString(),"ronweas");;
		for (Student student : sarr) {
			lo++;
			if(student==null)
			{
				break;
			}
			else
				display(student);
		}
		return null;

    }
	public void Creatnewcourse()
	{
		c[co]=AcceptCoursdata();
	
		co++;
	}
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
	{ int id=104;
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
	public void register()
	{
		Student s=Acceptdata();
		sarr[lo]=s;
		lo++;
		int reg=0;
		System.out.println("Enter The Course ID You Want To Enroll :- ");
		int id=sc.nextInt();
		Course clist[]=listOfCourses();
		for (Course course : clist) {
			
			if(course==null)
			{
				
				break;
			}
			else  
			if(course.getCourse_id()==id)
			{
				enroll(s,course,d1.toLocaleString());
				System.out.println("Course Enrolled");
				reg++;
				break;
			}


			
		}
		if(reg==0)
		{
			System.out.println("Course Not Found");
		}
	}
	   
	public void enroll(Student student, Course course,String enrdate) {
			
          Enroll e= new Enroll(student, course,enrdate);
         eList[eo]=e;
         eo++;
	    }

	   public Enroll[] listOfEnrollments() {
		   System.out.println("\t----------- Enrollment Information-------");
			System.out.println("Student ID \t Student Name \t Student DOB \t Course ID \t Course Name \t Course Fees \t Course Duration \t Enrollment Date");
			
		   for (Enroll e : eList) {
			if(e==null)
			{
				
				break;
			}
			else
			{
				displayEnroll(e);
				}
		}
		return null;

	    }
	public void display(Student stud) {
		System.out.println("\t----------- Student Data-------");
		System.out.println("ID :- "+stud.Stud_ID);
		System.out.println("Name :- "+stud.Stud_Name);
		System.out.println("Date Of Birth  :- "+stud.Stud_dob);
		
	}
	
	public void displayCourses(Course c) {
		System.out.println("\t----------- Course Information-------");
		System.out.println("ID :- "+c.course_id);
		System.out.println("Name :- "+c.course_name);
		System.out.println("Fees  :- "+c.course_fees);
		System.out.println("Duration  :- "+c.course_duration);	
	}
	public void displayEnroll(Enroll e) {
		Student s=e.getStudent();
		Course c=e.getCourse();
		System.out.println(s.getStud_ID()+"\t\t"+s.getStud_Name()+"\t\t"+s.getOb()+"\t\t"+c.getCourse_id()+"\t\t"+c.getCourse_name()+"\t\t"+c.getCourse_fees()+"\t\t"+c.getCourse_duration()+"\t\t"+e.getEnrollmentDate());
		
	}
}
