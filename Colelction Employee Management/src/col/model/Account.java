package col.model;

public class Account {
int empid;
String empname;
int empsal;
int dept;
String role;

public int getDept() {
	return dept;
}
public void setDept(int dept) {
	this.dept = dept;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Account(int empid, String empname, int empsal, int dept, String role) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.empsal = empsal;
	this.dept = dept;
	this.role = role;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public int getEmpsal() {
	return empsal;
}
public void setEmpsal(int empsal) {
	this.empsal = empsal;
}

public String getDeptname(int dept)
{
	if(dept==1)
	{
		return "HR Dept";
	}
	else if(dept==2)
	{
		return "Developer Dept";
	}	
	else if(dept==3)
	{
		return "Q/A Dept";
	}	
	else
	{
		return "Other";
	}
	
	}
@Override
	public String toString() {

		System.out.println(""+empid+"\t"+empname+"\t"+empsal+"\t"+getDeptname(dept) +role);
		return "----------------------------------------------------------------------------";
	}

}
