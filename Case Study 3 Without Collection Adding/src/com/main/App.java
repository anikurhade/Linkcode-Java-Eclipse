package com.main;

import java.util.Scanner;
import com.app.AppEngine;
import com.entity.Admin;

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
		do {
		System.out.println(" Hey "+curradm.getName()+" , Welcome ");
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("\nSay 1 To View All Courses ");
		System.out.println("Say 2 To Enroll A New Courses ");
		System.out.println("Say 3 To View All Enrolled Student Info ");
		System.out.println("Say 4 To Add New Admin ");
		System.out.println("Say 5 To View All Admin ");
		System.out.print("Say 6 To Exit From Admin :- ");
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
			appEngine.register();
			
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
		
		
		}
		}while(opch!=6);
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
				
					appEngine.listOfCourses();
					
				}
				break;
				case 2: {
					appEngine.register();
					
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
