import java.util.Scanner;
import Node.MyLinkedlist;
public class Linkedlistop
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int ch=0,count=0;
		MyLinkedlist list=new MyLinkedlist();
		do {
		System.out.println("\n--------------------------------Linkedlist In Java-------------------------------------");
		System.out.println("1. To Create  ");
		System.out.println("2. To Display  ");
		System.out.println("3. To Add New Node  ");
		System.out.println("4. To Insertion Operations  ");
		System.out.println("5. To Deletion Operations  ");
		System.out.println("6. To Searching Operations  ");
		System.out.println("7. To Sorting Operations  ");
		System.out.println("8. Exit  ");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.print("Your Choice :- ");
		ch=sc.nextInt();
		switch (ch) {
		case 1: {
			if(count>0)
			{
				System.out.println("List Created Already Press 3 To Insert When Menue Occurs");
				break;
			}
			else
			{
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.print("Enter Number For First Node :- ");
			int data=sc.nextInt();
			list=list.create(list, data);
			if(list==null)
			{
				System.out.println("Record Not Inserted");
			}
			else
			{
				System.out.println("Record Inserted");
			}
			count++;
			}
		}
		break;
		//case 1 ends 
		case 2: {
			list.display(list);
			
		}
		break;
		//case 2 ends 
		case 3: {
			
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.print("Enter Data For Node :- ");
			int data=sc.nextInt();
			list=list.create(list, data);
			if(list==null)
			{
				System.out.println("New Record Not Inserted");
			}
			else
			{
				System.out.println("New Record Inserted");
			}
		}
		break;
		//case 3  ends 
	case 4: {
			int ins=0;
			do {
			System.out.println("\n--------------------------------------------------------------------------------------");
			System.out.println("1.Insert At First");
			System.out.println("2.Insert At Medium");
			System.out.println("3.Insert At End");
			System.out.println("4.View List ");
			System.out.println("5.Exit");
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.print("Your Choice :- ");
			ins=sc.nextInt();
			
			switch (ins) {
			case 1:
			{
				System.out.println("\n--------------------------------------------------------------------------------------");
				System.out.print("Enter Data For Node :- ");
				int data=sc.nextInt();
				list=list.insertfirst(list, data);
				if(list!=null)
				{
				System.out.println("Record Insreted At Begining");
				}
			}
				break;
			case 2:
			{
				System.out.println("\n--------------------------------------------------------------------------------------");
				System.out.print("Enter Data For Node :- ");
				int data=sc.nextInt();
				System.out.print("\nEnter Postion For Node :- ");
				int pos=sc.nextInt();
				
				list=list.insertmid(list, data,pos);
				
				
			}
				break;

			case 3:
			{
				System.out.println("\n--------------------------------------------------------------------------------------");
				System.out.print("Enter Data For Node :- ");
				int data=sc.nextInt();
				list=list.insertend(list, data);
				if(list!=null)
				{
				System.out.println("Record Inserted At End");
				}
			}
				break;
			case 4:
			{
				list.display(list);
			}
				break;
			
			
			}
			}while(ins!=5);
			
			
		}
		break;
		//case 4  ends  ----------------------------------- Deletion ---------------------------------------------------
			case 5:
			{
				int del=0;
				do {
				System.out.println("\n--------------------------------------------------------------------------------------");
				System.out.println("1.Delete At First");
				System.out.println("2.Delete At Middle");
				System.out.println("3.Delete At End");
				System.out.println("4.View List ");
				System.out.println("5.Exit");
				System.out.println("--------------------------------------------------------------------------------------");
				System.out.print("Your Choice :- ");
				del=sc.nextInt();
				
				switch (del) {
				case 1:
				{
					boolean returndel = list.Deltestart(list);
					if(returndel==true)
					{
					System.out.println("Record Deleted At Begining");
					}
					else
					{
						System.out.println("Record Deletion Error Occurrred.");
					}
				}
					break;
				case 2:
				{
					System.out.print("\nEnter Postion For Node :- ");
					int pos=sc.nextInt();
					boolean returndel=list.Deltemid(list, pos);
					if(returndel==true)
					{
					System.out.println("Record Deleted At "+pos+"  Postion.");
					}
					else
					{
						System.out.println("Record Deletion Error Occurrred.");
					}
					
				}
					break;

				case 3:
				{
					boolean returndel = list.Delteend(list);
					if(returndel==true)
					{
					System.out.println("Record Deleted At End");
					}
					else
					{
						System.out.println("Record Deletion Error Occurrred.");
					}
				}
					break;
				case 4:
				{
					list.display(list);
				}
					break;
				
				
				}
				}while(del!=5);
				
			}
				break;
		//case 5 --------------------------------------------Searching ----------------------------------------------------
			case 6: 
			{
			
			}
			break;	
		// case 6 ------------------------------------------Sorting-----------------------------------------------------------------
				
			
		}
		}while(ch!=8);
		
	}
}
