package com.main;

import java.util.Scanner;
import com.app.AppEngine;
import com.entity.Admin;
import com.entity.Student;

public class App {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	int ch,user;
	AppEngine appEngine=new AppEngine();
	appEngine.introduce();
	do {
	System.out.println("\n-------------------------------------------------------------");
	System.out.println(" \n                    Welcome To Linkcode Technology ");
	System.out.println("\n-------------------------------------------------------------");
	System.out.println("\n Choose 1 For Admin");
	System.out.println("\n Choose 2 For Student");
	System.out.print("\n Choose 3 For Exit :-");
	user=sc.nextInt();
	
	switch(user)
	{
	case 1:
	{ 
		int adminlog;
		
		Admin curradm=appEngine.checkadmin();
		if(curradm!=null)
		{	
		int opch;
		System.out.println(" Hey "+curradm.getName()+" , Welcome ");
		do {
		
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("\nSay 1 To View All Courses ");
		System.out.println("Say 2 To Enroll A New Courses ");
		System.out.println("Say 3 To View All Enrolled Student Info ");
		System.out.println("Say 4 To Add New Admin ");
		System.out.println("Say 5 To View All Admin ");
		System.out.println("Say 6 To View All Students Visited ");
		System.out.print("Say 7 To Exit From Admin :- ");
		opch=sc.nextInt();
		switch (opch) {
		case 1: {
		
			appEngine.listOfCourses();
			
		}
		break;
		case 2: {
			appEngine.Creatnewcourse();
			
		}
		break;
		case 3: {
			appEngine.listOfEnrollments();
			
		}
		break;
		case 4: {
			appEngine.Addnew();;
			
		}
		break;
		case 5: {
			appEngine.viewAdminNames();
			
		}
		break;
		case 6: {
			appEngine.listOfStudents();
			
			
		}
		break;
		
		}
		}while(opch!=7);
		}
	}
	break;
	
	case 2:
		{
			int studch;
		do {
			 System.out.println("\n-------------------------------------------------------------");
			 System.out.println("Say 1 For Previous Login ");
			 System.out.println("Say 2 For New Register");
			 System.out.print("Say 3 To Exit From Admin :- ");
			 studch=sc.nextInt();
				switch (studch) {
				case 1: {
				
					Student currs=appEngine.checkStudent();
					if(currs!=null)
					{
						System.out.println("\n Hey Welcome "+currs.getStud_Name());
						do {
						System.out.println("------------------------------------------------------");
						System.out.println("Say 1 To View Your Details ");
						System.out.println("Say 2 To View All Courses ");
						System.out.println("Say 3 To Pay Your Course Fees ");
						System.out.println("Say 4 To Register To A New Course  ");
						System.out.println("Say 5 To View All Enrolled Courses ");
						System.out.println("Say 6 To Edit Profile Data");
						System.out.print("Say 7 To Sign Out  :- ");
						ch=sc.nextInt();
						switch(ch)
						{
						case 1:
						{
							appEngine.displayallstuddata(currs);
						}
						break;
						case 2:
						{
							appEngine.listOfCourses();
						}
						break;
						case 3:
						{
							appEngine.calculateBill();
						}
						break;
						case 4:
						{
							appEngine.register(currs);
						}
						break;
						case 5:
						{
							appEngine.viewenrollcourse(currs);
						}
						break;
						case 6:
						{
							appEngine.viewenrollcourse(currs);
						}
						break;
						}
						}while(ch!=6);
						
					}
					
				}
				break;
				case 2: {
					appEngine.newStudent();
					
				}
				break;
				
				}
			}while(studch!=3);
		}
		break;
	
	}
	
	}while(user!=3);
	
}
}
