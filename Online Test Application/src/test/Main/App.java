package test.Main;

import java.util.InputMismatchException;

import java.util.Scanner;

import test.entity.*;
import test.app.AppBrain;

public class App {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int ch,brch,user=0;
		AppBrain appbr=new AppBrain();
		appbr.introduce();
		do {
		System.out.println("\n-------------------------------------------------------------");
		System.out.println(" \n                    Welcome To Test-Mania  ");
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("\nChoose 1 For Examiner");
		System.out.println("\nChoose 2 For Student");
		System.out.print("\nChoose 3 For Exit :-");
		try {
			user=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Sorry Wrong Input \nEnter Input In Number ");
		}
		if(user>3)
		 {
			 System.out.println("Sorry Wrong Input ");
		 }
		else {
		switch(user)
		{
		
		
		case 1:
			{
				int adminlog;
				
				Admin curradm=appbr.checkadmin();
				if(curradm!=null)
				{	
				int opch;
				System.out.println(" Hey "+curradm.getName()+" , Welcome ");
				do {
				
				System.out.println("\n-------------------------------------------------------------");
				System.out.println("\nSay 1 To View All Questions ");
				System.out.println("Say 2 To Add New Questions  ");
				System.out.println("Say 3 To Enroll Student For Exam  ");
				System.out.println("Say 4 To View All Enrolled Student Info ");
				System.out.println("Say 5 To Add New Examiner ");
				System.out.println("Say 6 To View All Examiner ");
				System.out.println("Say 7 To View All Students Given Test  ");
				System.out.print("Say 8 To Exit From Admin :- ");
				opch=sc.nextInt();
				switch (opch) {
				case 1: {
				 System.out.println("Choose Branch :- \n1.Computer Engineer \n2.Information Technology \n3.Electronic And Telecommunication \n Your Choice :- ");
				 brch=sc.nextInt();
				 appbr.viewallQuestion(brch);
				 
				}
				break;
				case 2: {
				System.out.println("Choose Branch :- \n1.Computer Engineer \n2.Information Technology \n3.Electronic And Telecommunication \n Your Choice :- ");
				brch=sc.nextInt();
				appbr.Addnewquestion(brch);
					
				}
				break;
				case 3: {
				
					
					appbr.Acceptdata();
					
				}
				break;
				case 4: {
				appbr.listOfStudents();
					
				}
				break;
				case 5: {
					appbr.Addnew();
				}
				break;
				case 6: {
					appbr.viewAdminNames();
					
				}
				break;
				case 7: {
					appbr.viewAdminNames();
					
				}
				break;
				}
				}while(opch!=8);
				}
			}
		break;
		case 2 :
			{
				Student currs=appbr.checkStudent();
				if(currs!=null)
				{
					System.out.println("\n Hey Welcome "+currs.getName());
					do {
					System.out.println("------------------------------------------------------");
					System.out.println("Say 1 To View Your Details ");
					System.out.println("Say 2 To  Start Your Exam  ");
					System.out.println("Say 3 To  View Current Result  ");
					System.out.println("Say 4 To  View Your Past Result  ");
					System.out.print("Say 5 To Sign Out  :- ");
					ch=sc.nextInt();
					switch(ch)
					{
					case 1:
					{
						appbr.displayallstuddata(currs);
					}
					break;

					case 2:
					{
						appbr.stratExam(currs.getDept(),currs);
						System.out.println("Test Successfully Recorded \n View Your Marks In Result Section");
					}
					break;
					
					
					case 3:
					{
						appbr.displaycurrresult(currs);
					}
					break;
					case 4:
					{
						appbr.displaycurrresult(currs);
					}
					break;
					}
					}while(ch!=5);
					
				
				
			}
		}
		 break;
		 
		}
		}
		sc.nextLine();
		}while(user!=3);
		
		
	}

}
