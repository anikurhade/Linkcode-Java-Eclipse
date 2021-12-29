package com.controller;

import java.util.Scanner;

import com.db.DBoperations;
import com.entity.Employee;

public class EmployeeControl {
	static Scanner sc =new Scanner(System.in);
	DBoperations db=new DBoperations();
	int id=0;
	public void introduce()
	{
		int count=0;
		try {
			if(count==0)
			{
				db.CreateTable();
			}
			else
			{
				count++;
			}
		}
		catch(Exception e)
		{
			
		}
	}
 int getlastid()
{
	int id=0;
	id=db.getlastid();
	return id;
	}
public void Acceptdata()
{
	System.out.println("------------------------------------------------------------------");
	System.out.print("\nEnter The Employee Name :- ");
	String name=sc.next();
	System.out.print("\nEnter Employee Salary :- ");
	int sal=sc.nextInt();
	System.out.println("Choose Employee Department :-\n1.HR\n2.Management\n3.Developer\n4.Tester\n5.StakeHolder");
	System.out.print("\nChoice :- ");
	int ch=sc.nextInt();
	System.out.print("\nEnter Employee Designation :- ");
	String design=sc.next();
	id=getlastid();
	id++;
	Employee e=new Employee(id, name, sal, Getdept(ch), design);
	addemployee(e);
	System.out.println("\nYour Employee Auto Generated Is "+id);
	
}

void addemployee(Employee E)  // not public cause it only has work in this class
{
    db.Insertrecord(E);
	}

public String Getdept(int ch)
{
String dept=null;
if(ch==1)
{
	dept="HR";
}
else if(ch==2)
{
	dept="Management";	
}
else if(ch==3)
{
	dept="Developer";	
}
else if(ch==4)
{
	dept="Tester";	
}
else if(ch==5)
{
	dept="StakeHolder";	
}

return dept;
}
public void displayall()
{
db.displayall();	
}
public void deleteemployee()
{
	System.out.println("------------------------------------------------------------------------------");
	System.out.print("Enter The Employee Name To Delete :- ");
	String name=sc.next();
db.deleteemployee(name);	
}

public void updateeemployee()
{
	System.out.println("------------------------------------------------------------------------------");
	System.out.print("Enter The Employee Id To Update :- ");
	int id=sc.nextInt();
	int searchres=db.searchbyid(id,1);
	if(searchres==1)
	{
	System.out.println("-----------------------------------------------------------------------");
	System.out.println("What You Want To Update ");
	System.out.println("1. Name\n2. Salary\n3.Department\n4.Desgination ");
	System.out.println("-----------------------------------------------------------------------");
	System.out.print("Choice :- ");
	int ch=sc.nextInt();
	db.updateId(id,ch);
	}
	else
	{
	System.out.println("Invalid Employee Id "
			+ "");
	}

}
public void searchemp()
{
	System.out.println("------------------------------------------------------------------------------");
	System.out.println("Choose From Below Menu \n1. Search  By Id \n2. Search By Name ");
	System.out.println("------------------------------------------------------------------------------");
	System.out.print("Choice :- ");
	int id=sc.nextInt();
	
}
}

