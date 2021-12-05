package col.controller;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


import col.model.Account;

public class Accountinfo {
	 List<Account> lst=new ArrayList<Account>();
	 int empid=100;
	 static Scanner sc=new Scanner(System.in);
public List<Account> CreateEmp()
{

 
		lst.add(Acceptempdata());
  return lst;
}
public void display(List <Account> lst)
{
	for (Account l : lst) {
		System.out.println("------------------------------Employee Info-------------------------------");
		l.toString();
	}
}

public Account Acceptempdata()
{
	System.out.println("------------------------------------------------------");
	System.out.print("Enter Your Name :- ");
	String name=sc.next();
	System.out.print("Enter Your Salary :- ");
	int sal=sc.nextInt();
	System.out.println("Enter Your Department \n1.HR\n2.Developer\n3.Testing\n4.Other :-");
	int dept=sc.nextInt();
	System.out.println("Enter Your Job Role :-");
	String Role=sc.next();
	Account a=new Account(empid, name, sal,dept, Role);
	return a;
	
}


}
