package app.main;

import java.util.Scanner;

import app.controller.AppInfo;

public class AppMain {

static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("\n\n\t ------------------------------------------------------");
		System.out.println("\t |                                                    |");
		System.out.println("\t |\t   Welcome To Employee  Manager \t      |");
		System.out.println("\t |                                                    |");
		System.out.println("\t ------------------------------------------------------");
		int ch;
		AppInfo a=new AppInfo();
		do {
		System.out.println("\t\t Make A Choice");
		System.out.println("1. Create New Employee Registration  ");
		System.out.println("2. Display All Employee ");
		System.out.println("3. Sort Employee  ");
		System.out.println("4. Exit ");
		System.out.print("\n Have A Choice :-  ");
		ch=sc.nextInt();
		switch (ch) {
		case 1: {
		 a.CreateEmp();
			
		}
		case 2:
		{
			a.displayall();
		}
		}
		

	
	}while(ch!=4);
}
}
