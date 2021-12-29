package app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

import app.entity.EmpAccount;

public class AppInfo {
static Scanner sc=new Scanner(System.in);
int count=100;
Map<Integer, EmpAccount> emplist=new HashMap<Integer, EmpAccount>();

	public void CreateEmp() {
	emplist.put(count++, Acceptemp());
}
public EmpAccount Acceptemp()
{
	System.out.println("----------------------------Entre Employee Details -----------------------------------");
	System.out.print("Enter Emp Name :- ");
	String name=sc.next();
	System.out.print("Enter Emp Salary :- ");
	int salary=sc.nextInt();
	System.out.print("Enter Emp Department :- ");
    String department=sc.next();
	System.out.print("Enter Emp Designation :- ");
 String designation=sc.next();
EmpAccount e=new EmpAccount(name, salary, department, designation);

return e;
}
public void displayall()
{
displaydata(emplist);	
}
public void displaydata(Map<Integer, EmpAccount> emp) {
	ArrayList<Integer> akey=new ArrayList<Integer>(emp.keySet());
	Iterator<Integer> a=akey.iterator();
	System.out.println("Key\t\tName");
	while (a.hasNext()) {
	Integer key=(Integer)a.next();
	EmpAccount e=emp.get(key);
	System.out.println(key +"\t"+e.getName()+"\t"+e.getSalary()+"\t"+e.getDepartment()+"\t"+e.getDesignation());
		
	}
}

public void Sortemp(Map<Integer, EmpAccount> emp)
{
	ArrayList<Integer> akey=new ArrayList<Integer>(emp.keySet());
	Iterator<Integer> a=akey.iterator();
	for (Integer integer : akey) {
		EmpAccount e= emp.get(integer);
		while (a.hasNext()) {
			Integer key=(Integer)a.next();
			EmpAccount enext=emp.get(key);
			if(e.getSalary()>enext.getSalary())
			{
				EmpAccount temp=enext;
				enext=e;
				e=temp;
			}
			}
	}
	displayall();
}


}
