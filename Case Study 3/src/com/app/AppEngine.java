package com.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

import com.entity.Admin;
import com.entity.Bill;
import com.entity.Course;
import com.entity.Enroll;
import com.entity.Student;

public class AppEngine {
	static Scanner sc=new Scanner(System.in);
	
	
	LinkedList<Student>sarr=new LinkedList<Student>();
	LinkedList<Course>c=new LinkedList<Course>();
	LinkedList<Enroll>eList=new LinkedList<Enroll>();
	ArrayList<Admin> adminlist=new ArrayList<Admin>(5);
	LinkedList<Course>Courseenrollist=new LinkedList<Course>();
	int id=102,temp;
	Date d1=new Date();
	
	 public void introduce()
	 {
       adminlist(); 
       char n='N';
       c.add(new Course(101, "Core Java","3 Months",4000,n));
       c.add(new Course(102, "Advance Java","3 Months",6000,n));
       c.add(new Course(103, "C","2 Months",4000,n));
       sarr.add(new Student(101, "Hermionie Granger",d1.toLocaleString(),"her101"));
       sarr.add(new Student(102, "Harry Potter",d1.toLocaleString(),"harry102"));
       sarr.add(new Student(103, "Ronal Weasely",d1.toLocaleString(),"ronweas"));
	 }
	private void adminlist() {
		
			adminlist.add(new Admin(101, "Anirudha", "Ani200"));
			adminlist.add(new Admin(102, "Admin", "admin"));
			
	
	}
	public void Addnew()
	{
		adminlist.add(regnewAdmin());
		System.out.println("New Admin Added Successfully !!");
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
		int count,idflag=0;
		int id;
		String pass;
		System.out.println("\n-------------------------------------------------------------");
		 System.out.print("Enter Your Admin Id :- ");
		 id=sc.nextInt();
		 
		for (Admin admin : adminlist) {
			
			if(admin.getId()==id)
			{
				count=0;
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
					count=count+1;
					System.out.println("Sorry Wrong Pasword \n Only "+(3-count) +" Chances Left");
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
	public Student checkStudent()
	{
		Student corrstudent = null;
		int count=0,idflag=0;
		int id;
		String pass;
		System.out.println("\n-------------------------------------------------------------");
		 System.out.print("Enter Your Student Id :- ");
		 id=sc.nextInt();
		 
		for (Student stud:sarr) {
			if(stud.getStud_ID()==id)
			{
				idflag=1;
				do {
				System.out.print("Enter Your Passcode :-");
				 pass=sc.next();
				 pass.trim();
				if((stud.getPassword()).equals(pass))
				{
					corrstudent=stud;
					break;
				}
				else
				{
					count++;
					
					System.out.println("Sorry Wrong Pasword \n Only "+(3-count) +" Chances Left");
				}
				}while(count<3);
			}
		   if(stud==null)
			{
				break;
			}
		}
		if(idflag==0)
		{
			System.out.println("Sorry No Student Found !!");
		}
		return corrstudent;
		
		
	}
	public void listOfCourses() {
		
		
		for (Course course : c) {
			
			if(course==null)
			{
				break;
			}
			else
				displayCourses(course);
		}
		
	

    }
	public void  listOfStudents() {
		
	int rept=0;
		for (Student student : sarr) {
			
			if(student==null)
			{
				break;
			}
			else if(rept==0)
			{
				System.out.println("\t----------- Student Data-------");
				System.out.println("Student ID \t Student Name \t\t Student DOB ");
				rept=+1;
			}
				display(student);
		}
		

    }
	public void Creatnewcourse()
	{
		c.add(AcceptCoursdata());
		System.out.println("New Course Added !!");
	
	}
	public void newStudent()
	{
		sarr.add(Acceptdata());
		System.out.println("Registration Successful !!");
	}
	public Student Acceptdata()
	{ int id=104;
		Student s=new Student();
		System.out.println("\t----------- Enter Student Data-------");
		s.Stud_ID=id++;
		System.out.print("Enter Your Name :-  ");
		s.Stud_Name=sc.next();
		System.out.print("Enter Your  Date Of Birth:-  ");
		s.Stud_dob=sc.next();
		System.out.print("Enter A Password :-  ");
		s.password=sc.next();
		
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
		char n='N';
		c.Feespaid=n;
		return c;
		
	}
	public void register(Student S)
	{
		
		int reg=0;
		System.out.println("Enter The Course ID You Want To Enroll :- ");
		int id=sc.nextInt();
	
		for (Course course : c) {
			
			if(course==null)
			{
				
				break;
			}
			else if(course.getCourse_id()==id)
			{
				int alreadyreg=0;
				 for (Enroll enroll : eList) {
					if(enroll.getCourse().getCourse_id()==id)
					{
						System.out.println("Course Already Enrolled");
						alreadyreg=1;
						reg++;
						break;
					}
				}
					if(alreadyreg==0)
					{	
					enroll(S,course,d1.toLocaleString());
					System.out.println("Course Enrolled");
					reg++;
					}
		}
	}
		if(reg==0)
		{
			System.out.println("Course Not Found");
		}
	
}   
	public void enroll(Student student, Course course,String enrdate) {
		 
		
				eList.add(new Enroll(student, course,enrdate));	
			
          
	    }

	   public Enroll[] listOfEnrollments() {
		   int det=0;
		   
		   for (Enroll e : eList) {
			   
			if(eList.isEmpty())
			{
				System.out.println("Currently No Data Available");
				break;
			}
			else
			{
				if(det==0)
				{
					System.out.println("\t----------- Enrollment Information-------");
					System.out.println("Student ID \t Student Name \t\t Student DOB \t\t Course ID \t\t Course Name \t Course Fees \t Course Duration \t Enrollment Date \t Fees Paid ");
					det=1;
				}
				
				displayEnroll(e);
				
				}
		}
		return null;

	    }
	public void display(Student stud) {
		
		System.out.println(stud.Stud_ID+"\t\t"+stud.Stud_Name+"\t\t"+stud.Stud_dob);
		
		
	}
	public void displayallstuddata(Student stud) {
		System.out.println("\t----------- Student Data-------");
		System.out.println("ID :- "+stud.Stud_ID);
		System.out.println("Name :- "+stud.Stud_Name);
		System.out.println("Date Of Birth  :- "+stud.Stud_dob);
		System.out.println("Password :- "+stud.password);
		
		
	}
	
	public Course viewenrollcourse(Student s)
	{
		Course c=null;
		for (Enroll enroll : eList) {
			if((enroll.getStudent().getStud_ID())==s.getStud_ID())
			{
				c= enroll.getCourse();
				Courseenrollist.add(c);
			}
		}
		
		displayllcourses();
		return c;
	}
	public void displayllcourses()
	{
	for (Course course : Courseenrollist) {
		if(course==null)
		{
			break;
		}
		else
		{
		if(temp==0)
			{
			
			System.out.println("\t----------- Courses  Data-------");
			System.out.println("Course ID \t Course Name \t Course Fees \tCourse Duration(In Months)\tFees Paid");
			temp=+1;
			}	
		System.out.println(course.getCourse_id()+"\t\t"+course.getCourse_name()+"\t\t"+course.getCourse_fees()+"\t\t"+course.getCourse_duration()+"\t\t"+course.getFeespaid());
		}
		
	}
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
		System.out.println(s.getStud_ID()+"\t\t"+s.getStud_Name()+"\t\t"+s.getStud_dob()+"\t\t"+c.getCourse_id()+"\t\t"+c.getCourse_name()+"\t\t"+c.getCourse_fees()+"\t\t"+c.getCourse_duration()+"\t\t"+e.getEnrollmentDate()+"\t\t"+c.getFeespaid());
		
	}
	int sum,billid=100,recalc=0;
    public void calculateBill()
    {
    	if(recalc==1)
    	{
    		sum=0;
    	}	
    	
       for (Course course : Courseenrollist) {
		sum=sum+course.getCourse_fees();
	}
       Bill b=new Bill();
       b.setBillid(billid++);
       
       b.setBillamount(sum);
       b.setGst(sum*0.18);
       b.setFintotal(sum+b.getGst()+b.getGst());
       displayBill(b);
    	
       
    }
    public void displayBill(Bill b)
    {
    	System.out.println("---------------- Bill Amount -------------");
    	System.out.println("\tBill Id :- "+b.getBillid());
    	System.out.println("\tBill Final Amount :- "+b.getFintotal());
    	System.out.println("--------------------------------------------");
    	System.out.println("\tBill Intial Ammount:- "+b.getBillamount());
    	System.out.println("\tBill CGST :- "+b.getGst());
    	System.out.println("\tBill SGST :- "+b.getGst());
    	System.out.println("--------------------------------------------");
    	System.out.println("\tBill Total Amount :- "+b.getFintotal());
    	
    	
    	
    }
}
