import java.util.Scanner;

public class Employee {
	 int empId;
	 String empName,empdeg,empwork;
	 long empPhone;
	 int annualctc;
	 Scanner sc =new Scanner(System.in);
	 void newemployee()
	 {
		    System.out.println("\n\n\t\t\t\t\t ------------------------------------------------------");
			System.out.println("\t\t\t\t\t |                                                    |");
			System.out.println("\t\t\t\t\t |\t\t    Welcome To Salary Manager \t      |");
			System.out.println("\t\t\t\t\t |                                                    |");
			System.out.println("\t\t\t\t\t ------------------------------------------------------");
			System.out.println("\n\t\t\t\t\t\t\tEnter Your Data :- \n\t\t\t\t\t\t  Be Free Your date Is safe With Us ");
			System.out.println("\n\n Your Name :-");
			empName=sc.next();
			System.out.println("\n\n Your Contact Id :-");
			empPhone=sc.nextLong();
			System.out.println("\n\n Your Work Place Name :-");
			empwork=sc.next();
			System.out.println("\n\n Your Designation :-");
			empwork=sc.next();
			System.out.println("\n\n Your Annual CTC :-");
			annualctc=sc.nextInt();
		 }
	 void salarybreakdown()
	 {
		 
	 }
	 void displary()
	 {
		 
	 }
}
