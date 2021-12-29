package com.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.controller.EmployeeControl;
import com.entity.Employee;
import com.utility.GetConnection;

public class DBoperations {
	GetConnection g=new GetConnection();
Connection c=g.Getconnection();
Statement s=null;
static Scanner sc =new Scanner(System.in);

public void CreateTable() throws Exception
{
 s=c.createStatement();
 String Create="create Table SalEmployee\r\n"
 		+ "(\r\n"
 		+ "    empid Number(5),\r\n"
 		+ "    empname varchar2(30),\r\n"
 		+ "    empsal  Number(7),\r\n"
 		+ "    empdept varchar2(20),\r\n"
 		+ "    empdegsin varchar2(30),\r\n"
 		+ "    Constraint empdept_chkeck Check (empdept='HR' OR empdept='Management' OR empdept='Developer' OR empdept='Tester' OR empdept='StakeHolder')\r\n"
 		+ ")";
 int r=s.executeUpdate(Create);
 
}

public int Insertrecord(Employee E)
{
int r=0;
try {
	
	PreparedStatement s=c.prepareStatement("insert into SalEmployee Values(?,?,?,?,?)");
	
s.setInt(1, E.getId());
s.setString(2, E.getName());
s.setInt(3, E.getSalary());
s.setString(4, E.getDepartment());
s.setString(5 , E.getDesignation());
r=s.executeUpdate();
if(r>0)
{
System.out.println("Employee Profile Created");	
}



} catch (SQLException e) {
	e.printStackTrace();
	
}
return r;
}
public void displayall()
{
	try {
		ResultSet r1=s.executeQuery("Select * from Salemployee");
		ResultSetMetaData d=r1.getMetaData();
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("| "+d.getColumnName(1)+" | "+d.getColumnName(2)+" | "+d.getColumnName(3)+" | "+d.getColumnName(4)+" | "+d.getColumnName(5)+" |");
		System.out.println("-------------------------------------------------------------------------------------------");
		while(r1.next())
		{
			System.out.println("| "+r1.getInt(1)+" | "+r1.getString(2)+" | "+r1.getInt(3)+" | "+r1.getString(4)+" | "+r1.getString(5)+" | ");
		}
		System.out.println("-------------------------------------------------------------------------------------------");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public int deleteemployee(String name)
{
int r=0;
try {
	PreparedStatement s=c.prepareStatement("delete from SalEmployee where empname=?");
	s.setString(1, name);
	r=s.executeUpdate();
	if(r>0)
	{
		System.out.println("Employee Record Deleted !!!! ");
	}	
	else
	{
		System.out.println("No Record Deleted As Record Not Found Or Wrong Name Entered ");
		
	}
}
catch(Exception e)
{
	System.out.println("No Record Deleted As Record Not Found Or Wrong Name Entered ");
	}
return r;
}

public int getlastid()
{
int id=0;
try {
	ResultSet r1=s.executeQuery("Select * from Salemployee");
	while(r1.next())
	{
		id=r1.getInt(1);
	}
} catch (SQLException e) {
	
	e.printStackTrace();
}

return id;
}

public void updateId(int id,int ch)
{
	PreparedStatement s=null;
			
	try {
		
		System.out.println("-----------------------------------------------------------------------");
		
		
		if(ch==1)
		{
			System.out.println("Enter Your Updated Name :- ");
			String str=sc.next();
			 s=c.prepareStatement("Update SalEmployee Set empname=? where empid=?");
			s.setInt(2, id);
			s.setString(1, str);
			
		}
		else if(ch==2)
		{
			System.out.println("Enter Your Updated Salary :- ");
			int sal=sc.nextInt();
			s=c.prepareStatement("Update SalEmployee Set empdegsin=? where empid=?");
			s.setInt(2, id);
			s.setInt(1, sal);
		}
		else if(ch==3)
		{
			System.out.println("Choose Updated Employee Department :-\n1.HR\n2.Management\n3.Developer\n4.Tester\n5.StakeHolder");
			System.out.print("\nChoice :- ");
			int dep=sc.nextInt();
			EmployeeControl e=new EmployeeControl();
			String str=e.Getdept(ch);
			 s=c.prepareStatement("Update SalEmployee Set empdept=? where empid=?");
			s.setInt(2, id);
			s.setString(1, str);
			
		}
		else if(ch==4)
		{
			System.out.println("Enter Your Updated Designation :- ");
			String str=sc.next();
			s=c.prepareStatement("Update SalEmployee Set empdegsin=? where empid=?");
			s.setInt(2, id);
			s.setString(1, str);
		}
		int r=s.executeUpdate();
		if(r>0)
		{
			System.out.println("Employee Record Updated !!!! ");
		}	
		else
		{
			System.out.println("Error Occurred ");
			
		}
	} catch (Exception e) {
		
	System.out.println("Something Unwanted Happend Please Retry");
	}
	
	
}

public int searchbyid(int id,int ch)
{
	boolean b;
	try {
		 PreparedStatement s=c.prepareStatement("Select * From Salemployee");
		 ResultSet r1=s.executeQuery();
		
		 while(r1.next())
		 {
			
			 if(r1.getInt(1)==id)
				{
				 return 1;
				}
						 
		 }
		 return 0;
	} 
	catch (Exception e) {
		e.printStackTrace();
		
	}
	return 0;
}
}
