package test.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.print.attribute.standard.QueuedJobCount;

import test.entity.*;

public class AppBrain {
	questions comp[]=new questions[10];
	questions it[]=new questions[10];
	questions entc[]=new questions[10];
	Marks m[]=new Marks[10];
	Student sarr[]=new Student[10]; 
	userAnswers user[]=new userAnswers[10];
	ArrayList<Admin> adminlist=new ArrayList<Admin>(5);
	int stud,qucont, userans;
	static Scanner sc=new Scanner(System.in);

	Date d1=new Date();
    int id=102;
	int comque=stud=qucont=userans=0;
	int entcque;
	int itque=entcque=0;
	
	int quid=106;
	private int marcount=0;
	
 public void introduce()
 {
	comp[0]=new questions(101, "What Is IDS?", "1.Intrusion Detection System", "2.Interospective Data-Analysis System ",1);
	comp[1]=new questions(102, "What Is The Type Of Hard Disk Formatting Creates FAT", "1. High Level", "2.Low Level ",1);
	comp[2]=new questions(103, "In the function malloc(), each byte of allocated space is initialized to zero. ", "1. True", "2.False ",1);
	comp[3]=new questions(104, "A condition where in memory is reserved dynamically but not accessible to any of the programs is called ----- ", "1. Memmory Leak", "2.Pointer leak ",1);
	comp[4]=new questions(105, "What is the time complexity to count the number of elements in the linked list? ", "1.O(1)", "2.O(n) ",2);
	
	it[0]=new questions(201, "Which of the following header files must necessarily be included to use dynamic memory allocation functions?", "1.stdlib.h","2.stdio.h ",1);
	it[1]=new questions(202, "What is the main function of the command interpreter?", "1. object-oriented Programming", "2. to get and execute the next user-specified command ",2);
	it[2]=new questions(203, "In Operating Systems, which of the following is/are CPU scheduling algorithms ?", "1.Round Robin", "2.Simple Path First ",1);
	it[3]=new questions(204, "To access the services of the operating system, the interface is provided by the ", "1. API", "2.System Call ",2);
	it[4]=new questions(205, "Which of the following is an example for non linear data type?", "1. Queue", "2.Tree ",2);
	
	entc[0]=new questions(301, "Which memory storage is widely used in PCs and Embedded Systems?", "1.EPROM", "2.DRAM ",2);
	entc[1]=new questions(302, "Which circuit is called as regenerative repeaters? ", "1. Digital circuits", "2.Analog circuits ",1);
	entc[2]=new questions(303, "What is the code rate?", "1. k/n", "2.n/k ",1);
	entc[3]=new questions(304, "What is the ASCII value of space? ", "1.78", "2.32 ",2);
	entc[4]=new questions(305, "How many bytes does a gigabyte have? ", "1. One Billion", "2.One Million ",1);
	
	
	sarr[0]=new Student(101, "Hermionie Granger",d1.toLocaleString(),1,"her101");
       sarr[1]=new Student(102, "Harry Potter",d1.toLocaleString(),2,"harry102");
       sarr[2]=new Student(103, "Ronal Weasely",d1.toLocaleString(),3,"ronweas");
	
	for (questions questions : comp) {
		if(questions==null)
		break;
		else
		{
			comque++;
		}
		
	}
	comque--;
	for (questions questions : it) {
		if(questions==null)
		break;
		else
		{
			itque++;
		}
		
	}
	itque--;
	for (questions questions : entc) {
		if(questions==null)
		break;
		else
		{
			entcque++;
		}
		
	}
	entcque--;
	examinerlist();
 }
 public void Addnewquestion(int brch)
 {
	 if(comque==comp.length || itque==it.length || entcque==entc.length)
	 {
		 System.out.println("Sorry The Question limit Have Been Reached To Extend The Limit Call Developer !!!!");
	 }
	 if(brch==1)
	 {	 
		 System.out.println("How Many Question You Want To Add :- ");
		 int quech=sc.nextInt();
		 for(int i=0;i<quech;i++)
		 {
			 comp[comque]=AcceptQuestion();
			 comque++;
		 }
		 
	 }
	 if(brch==2)
	 {	 
		 System.out.println("How Many Question You Want To Add :- ");
		 int quech=sc.nextInt();
		 for(int i=0;i<quech;i++)
		 {
			 it[itque]=AcceptQuestion();
			 itque++;
		 }
		 
	 }
	 if(brch==3)
	 {	 
		 System.out.println("How Many Question You Want To Add :- ");
		 int quech=sc.nextInt();
		 for(int i=0;i<quech;i++)
		 {
			 entc[itque]=AcceptQuestion();
			 entcque++;
		 }
		 
	 }
	 
 }
 
 public questions AcceptQuestion()
 {
	 questions q=new questions();
	 q.setQuestionid(quid++);
	 sc.nextLine();
	 System.out.print("Enter Question :- ");
	 q.setQuestion(sc.nextLine());
	 System.out.print("Enter Option 1 :- ");
	 q.setOp1("1."+sc.nextLine());
	 System.out.print("Enter Option 2 :- ");
	 q.setOp2("2."+sc.nextLine());
	 System.out.print("Enter Correct Answer(Option 1/Option 2) :- ");
	 q.setAnswer(sc.nextInt());
	 
	 
	 return q;
 }
 public void viewallQuestion(int brch)
 {
	 int rept=0;
		
	 if(brch==1)
	 {	 
		  rept=0;
	 for (questions questions : comp) {
		 if(questions==null)
			{
				
			     break;
			}
			else if(rept==0)
			{
				System.out.println("\t----------- Questions -------");
				System.out.println("Question ID \t Question  \t\t Option A \t Option B \t Correct Answer  ");
				rept=+1;
			}
				display(questions);
		}
	 }
	 else if(brch==2)
	 {	  rept=0;
	 for (questions questions : it) {
		 if(questions==null)
			{
				
			     break;
			}
			else if(rept==0)
			{
				System.out.println("\t----------- Questions -------");
				System.out.println("Question ID \t Question  \t\t Option A \t Option B \t Correct Answer  ");
				rept=+1;
			}
				display(questions);
		}
	 }
	 else if(brch==3)
	 {      rept=0;
		 for (questions questions : it) {
			 if(questions==null)
				{
					
				     break;
				}
				else if(rept==0)
				{
					System.out.println("\t----------- Questions -------");
					System.out.println("Question ID \t Question  \t\t Option A \t Option B \t Correct Answer  ");
					rept=+1;
				}
					display(questions);
			} 
	 }
	 else if(brch>=3)
	 {
		 System.out.println("Sorry Wrong Choice !!");
	 } 
	 
	}
 
public void display(questions q)
{
	System.out.println(""+q.getQuestionid()+"\t\t"+q.getQuestion()+"\t\t"+q.getOp1()+"\t\t"+q.getOp2()+"\t\t"+q.getAnswer());
	}

//-----------------------------------------------------Start Exam --------------------------------------
public void stratExam(int brch,Student s)
 {
int wrngchoice,marks = 0;
if(brch==1)
{
	qucont=comque;
	
	System.out.println(qucont);
	 for (questions questions : comp) {
		 
		 
		 if(questions==null)
		 {
			 break;
		 }
		 else
		 {
	do {
		System.out.println("------------------------------------------------");
		System.out.println(questions.getQuestionid()+"\t"+questions.getQuestion());
		System.out.println("------------------------------------------------");
		System.out.println(questions.getOp1());
		System.out.println(questions.getOp2());
		System.out.println("------------------------------------------------");
		System.out.println("Enter Your Answer :- ");
		int choice=sc.nextInt();
		
		if(choice>2)
		{
			System.out.println("Wrong Choice");
			 wrngchoice = 1;
		}
		else
		{
		user[userans]=new userAnswers(questions, choice);
		userans++;
		wrngchoice=0;
		 }
		 }while(wrngchoice==1);
		 }
	}
	 marks=checkanswers(comp, user);
}
else if(brch==2)
{
	qucont=itque;
	 for (questions questions : it) {
		 
		 
		 if(questions==null)
		 {
			 break;
		 }
		 else
		 {
	do {
		System.out.println("------------------------------------------------");
		System.out.println(questions.getQuestionid()+"\t"+questions.getQuestion());
		System.out.println("------------------------------------------------");
		System.out.println(questions.getOp1());
		System.out.println(questions.getOp2());
		System.out.println("------------------------------------------------");
		System.out.println("Enter Your Answer :- ");
		int choice=sc.nextInt();
		
		if(choice>2)
		{
			System.out.println("Wrong Choice");
			 wrngchoice = 1;
		}
		else
		{
		user[userans]=new userAnswers(questions, choice);
		userans++;
		wrngchoice=0;
		 }
		 }while(wrngchoice==1);
		 }
	}
	 marks=checkanswers(it, user);
}
else if(brch==3)
{
qucont=entcque;
	 for (questions questions : entc) {
		 
		 
		 if(questions==null)
		 {
			 break;
		 }
		 else
		 {
	do {
		System.out.println("------------------------------------------------");
		System.out.println(questions.getQuestionid()+"\t"+questions.getQuestion());
		System.out.println("------------------------------------------------");
		System.out.println(questions.getOp1());
		System.out.println(questions.getOp2());
		System.out.println("------------------------------------------------");
		System.out.println("Enter Your Answer :- ");
		int choice=sc.nextInt();
		
		if(choice>2)
		{
			System.out.println("Wrong Choice");
			 wrngchoice = 1;
		}
		else
		{
		user[userans]=new userAnswers(questions, choice);
		userans++;
		wrngchoice=0;
		 }
		 }while(wrngchoice==1);
		 }
	}
	 marks=checkanswers(entc, user);
	 
}

marks=marks*10;
m[marcount]=new Marks(s, marks,calcper(marks), calcgrade(calcper(marks)),qucont*10);
marcount++;
 }
public float calcper(int marks)
{
	float per;
	System.out.println(marks);
	per=marks/qucont*100;
	return per;
}
public char calcgrade(float per)
{
	char grade='F';
	if(per>45 && per<60)
	{
		grade='D';
	}
	else if(per>60 && per<75)
	{
		grade='C';
	}
	
	else if(per>75 && per<85)
	{
		grade='B';
	}
	else if(per>85 )
	{
		grade='A';
	}
		
	return grade;
}
 public int checkanswers(questions q[],userAnswers u[])
 {
	 int marks=0;
	
	 for (userAnswers userAnswers : u ) {
		
			 int bk=0;
		for (questions questions : q) {
			 if(questions==null || userAnswers==null)
			 {
				 break;
			 }
			 else
			 {
		 if(questions.getQuestionid()==(userAnswers.getQ().getQuestionid()))
		 {
			 if(questions.getAnswer()==(userAnswers.getUserAnswer()))
			 {
				 
				 marks++;
				 bk++;
				 qucont++;
				 break;
			 }
			 else
			 {
				 qucont++;
				 break;
			 }
			 
		 }
	     }
			
		}
      }
	
	 return marks;
 }
 
 
 public void displaymarks(Marks marks)
 {
	System.out.println("----------------------------------------------------");
	System.out.println("\t Marks Obtained :- "+marks.getMark());
	System.out.println("\t Total Out Off:- "+marks.getTot());
	System.out.println("----------------------------------------------------");
	System.out.println("\t Percentage :- "+marks.getPer());
	System.out.println("\t Grade:- "+marks.getGrade());
	
	
	
 }
 public void displaycurrresult(Student s)
 {
	for (Marks marks : m) {
		if(marks==null)
		{
			break;
		}	
	   if((marks.getS().getEnrid())==s.getEnrid())
	   {
		   System.out.println("----------------------------------------------");
		   display(s);
		   displaymarks(marks);
	   }
	}
 }
 
 //------------------------------------------------Admin ------------------------------------
 private void examinerlist() {
		
		adminlist.add(new Admin(101, "Anirudha", "Ani200"));
		adminlist.add(new Admin(102, "Admin", "admin"));
		

}
public void Addnew()
{
	adminlist.add(regnewAdmin());
	System.out.println("New Examiner Added Successfully !!");
}


public Admin regnewAdmin()
{ 
	
	System.out.println("----------------------Enter Your Info --------------------------");
 id++;
 System.out.print("Enter Your Name :-  ");
	String name=sc.next();
	System.out.print("Enter Your Password :-  ");
	String password=sc.next();
 Admin new_admin=new Admin(id, name, password);
 
	return new_admin;
}
public void viewAdminNames()
{
	System.out.println("\n-------------------------------------------------------------\n");
	System.out.println("Examiner Id \t Examiner Name");
	for (Admin admin : adminlist) {
		System.out.println(admin.getId()+"\t\t"+admin.getName());
	}
	
}
public Admin checkadmin()
{
	Admin corradm = null;
	int count,idflag=0;
	int id;
	String pass;
	System.out.println("\n-------------------------------------------------------------");
	 System.out.print("Enter Your Examiner Id :- ");
	 id=sc.nextInt();
	 
	for (Admin admin : adminlist) {
		
		if(admin.getId()==id)
		{
			count=0;
			idflag=1;
			do {
			System.out.print("Enter Your Passcode :-");
			 pass=sc.next();
			 pass.trim();
			if((admin.getPassword()).equals(pass))
			{
				corradm=admin;
				break;
			}
			else
			{
				count=count+1;
				System.out.println("Sorry Wrong Pasword \nOnly "+(3-count) +" Chances Left");
			}
			}while(count<3);
		}
	   if(admin==null)
		{
			break;
		}
	}
	if(idflag==0)
	{
		System.out.println("Sorry No Examiner Id Found !!");
	}
	return corradm;
	
}


//------------------------------------------------ Student-----------------------------------------
public void newStudent()
{
	sarr[stud]=Acceptdata();
	stud++;
	System.out.println("Registration Successful !!");
}
public Student Acceptdata()
{ int id=104;
	Student s=new Student();
	String pass="pass@";
	System.out.println("\t----------- Enter Student Data-------");
	s.setEnrid(id++);
	System.out.print("Enter Your Name :-  ");
	s.setName(sc.next());
	System.out.print("Enter Your  Date Of Birth:-  ");
	s.setDOB(sc.next());
	System.out.print("Enter Student Department\n1-Computer Engineering \n2-Information Technology\n3-Electronic And Telecommunication :-  ");
	s.setDOB(sc.next());
	System.out.print("Student Password Is :-  pass@"+id);
	s.setPass(pass.concat(Integer.toString(id)));
	
	return s;
	
}
public void display(Student stud) {
	int dept=stud.getDept();
	
	
	System.out.println(stud.getEnrid()+"\t\t"+stud.getName()+"\t\t"+stud.getDOB()+"\t\t"+getdept(stud.getDept()));
	
	
}
public void displayallstuddata(Student stud) {
	System.out.println("\t----------- Student Data-------");
	
	System.out.println("ID :- "+stud.getEnrid());
	System.out.println("Name :- "+stud.getName());
	System.out.println("Date Of Birth  :- "+stud.getDOB());
	System.out.println("Department :- "+getdept(stud.getDept()));
	System.out.println("Password :- "+stud.getPass());
	
	
}
public String getdept(int dept)
{
	String dept_name = null;
	if(dept==1)
	{
		dept_name="Computer Enginerring";
	}
	else if(dept==2)
	{
		dept_name="Information Technology";
	}
	else if(dept==3)
	{
		dept_name="Electronic And Telecommunication";
	}
	return dept_name;
	}
public void  listOfStudents() {
	
int rept=0;
	for (Student student : sarr) {
		
		if(student==null)
			
		{
			break;
		}
		else if(rept==0)
		{
			System.out.println("\t----------- Student Data-------");
			System.out.println("Student ID \t Student Name \t\t Student DOB \t\t Student Department ");
			rept=+1;
		}
			display(student);
	}
	

}

public Student checkStudent()
{
	Student corrstudent = null;
	int count=0,idflag=0;
	int id;
	String pass;
	System.out.println("\n-------------------------------------------------------------");
	 System.out.print("Enter Your Student Id :- ");
	 id=sc.nextInt();
	 
	for (Student stud:sarr) {
		  if(stud==null)
			{
				break;
			}
		if(stud.getEnrid()==id)
		{
			idflag=1;
			do {
			System.out.print("Enter Your Passcode :-");
			 pass=sc.next();
			 pass.trim();
			if((stud.getPass()).equals(pass))
			{
				corrstudent=stud;
				break;
			}
			else
			{
				count++;
				
				System.out.println("Sorry Wrong Pasword \n Only "+(3-count) +" Chances Left");
			}
			}while(count<3);
		}
	 
	}
	if(idflag==0)
	{
		System.out.println("Sorry No Student Found !!");
	}
	return corrstudent;
	
	
}

}
