package test.Main;

import java.util.InputMismatchException;
import java.util.Scanner;

import test.app.AppBrain;

public class App {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int ch,user=0;
		AppBrain appbr=new AppBrain();
		appbr.introduce();
		do {
		System.out.println("\n-------------------------------------------------------------");
		System.out.println(" \n                    Welcome To Test-Mania  ");
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("\n Choose 1 For Examiner");
		System.out.println("\n Choose 2 For Student");
		System.out.print("\n Choose 3 For Exit :-");
		try {
			user=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Sorry Wrong Input \n Enter Input In Number ");
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
				appbr.stratExam();
			}
		break;
		case 2 :
			{
				
			}
		 break;
		 
		}
		}
		sc.nextLine();
		}while(user!=3);
		
		
	}

}
