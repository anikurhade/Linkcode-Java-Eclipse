package com.main;

import java.util.Scanner;


import com.controller.EmployeeControl;

public class MainApp {
	static Scanner sc =new Scanner(System.in);
public static void main(String[] args) {
	int ch=0;
	EmployeeControl e=new EmployeeControl();
	e.introduce();
			do {
	System.out.println("-------------------------------------------------------------------");
	System.out.println("1.To Create New Employee Profile");
	System.out.println("2.To Display All Profiles");
	System.out.println("3.To Delete Profile");
	System.out.println("4.To Update Employee Profile");
	System.out.println("5.To Search For Employee");
	System.out.println("6.To Exit");
	System.out.println("-------------------------------------------------------------------");
	System.out.print("Your Choice :- ");
	ch=sc.nextInt();
	switch (ch) {
	case 1:
		{
			e.Acceptdata();
		}
	break;
	case 2:
		{
			e.displayall();
		}
	break;
	case 3:
		{
			e.deleteemployee();
		}
		break;
	case 4:
		{
			e.updateeemployee();
		}
		break;
	case 5:
	{
	
	}
		break;
		
	}
			}while(ch!=6);
}
}
