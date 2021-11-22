package com.main;

import java.util.Scanner;

import com.app.AppEngine;

public class App {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	int ch;
	AppEngine appEngine=new AppEngine();
	do {
	System.out.println("\n-------------------------------------------------------------");
	System.out.println(" \n                    Welcome To Linkcode Technology ");
	System.out.println("\n-------------------------------------------------------------");
	System.out.println("\nSay 1 To View All Courses ");
	System.out.println("Say 2 To Enroll A New Courses ");
	System.out.println("Say 3 To Register To A  Courses ");
	System.out.println("Say 4 To View All Enrolled Student Info ");
	System.out.print("Say 5 To Exit :- ");
	ch=sc.nextInt();
	switch (ch) {
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
		appEngine.listOfEnrollments();
		
	}
	break;
	
	}
	}while(ch!=5);
	
}
}
