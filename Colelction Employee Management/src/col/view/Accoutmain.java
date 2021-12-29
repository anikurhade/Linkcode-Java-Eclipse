package col.view;
import java.util.List;

import col.controller.Accountinfo;
import col.model.Account;

public class Accoutmain {

	public static void main(String[] args) {
		Accountinfo a=new Accountinfo();
		List<Account>lst=a.CreateEmp();
		a.display(lst);
		int ch=0;
		do {
			System.out.println("\n\n\t\t\t\t\t ------------------------------------------------------");
			System.out.println("\t\t\t\t\t |                                                    |");
			System.out.println("\t\t\t\t\t |\t\t    Welcome To Techno-Hind \t      |");
			System.out.println("\t\t\t\t\t |                                                    |");
			System.out.println("\t\t\t\t\t ------------------------------------------------------");
			System.out.println("\n1. 	");
			
		}while(ch!=4);
	
	}

}
