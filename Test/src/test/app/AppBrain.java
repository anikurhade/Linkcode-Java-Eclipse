package test.app;

import java.util.Scanner;

import test.entity.Student;
import test.entity.questions;
import test.entity.userAnswers;

public class AppBrain {
	questions q[]=new questions[10];
	Student s[]=new Student[10]; 
	userAnswers user[]=new userAnswers[10];
	int stud;
	static Scanner sc=new Scanner(System.in);
     int qucont;
 int userans;
	int que=stud=qucont=userans=0;
	int quid=103;
 public void introduce()
 {
	q[0]=new questions(101, "C is A ______ ?", "1. object-oriented Programming", "2.Processed Based programming ",1);
	q[1]=new questions(102, "C is A ", "1. object-oriented Programming", "2.Processed Based programming ",1);
	q[2]=new questions(103, "C is A ", "1. object-oriented Programming", "2.Processed Based programming ",1);
	for (questions questions : q) {
		if(questions==null)
		break;
		else
		{
			que++;
		}
		
	}
	que--;
 }
 public void Addnewquestion()
 {
	 
 }
 public questions AcceptQuestion()
 {
	 questions q=new questions();
	 q.setQuestionid(quid++);
	 System.out.print("Enter Question :- ");
	 q.setQuestion(sc.nextLine());
	 System.out.print("Enter Option 1 :- ");
	 q.setOp2(sc.nextLine());
	 System.out.print("Enter Option 2 :- ");
	 q.setOp1(sc.nextLine());
	 System.out.print("Enter Correct Answer(Option 1/Option 2) :- ");
	 q.setAnswer(sc.nextInt());
	 
	 
	 return q;
 }
 public void viewallQuestion()
 {
	 int rept=0;
	 for (questions questions : q) {
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
				display(question);
		}
	}
 }
 public void stratExam()
 {
int wrngchoice;
	 for (questions questions : q) {
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
	 displaymarks(checkanswers(q, user));
		
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
				 System.out.println("hi");
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
 
 public void displaymarks(int marks)
 {
	System.out.println("----------------------------------------------------");
	System.out.println("\t Marks Obtained :- "+marks*10);
	System.out.println("\t Total Out Off:- "+qucont*10);
	
	
 }
}
