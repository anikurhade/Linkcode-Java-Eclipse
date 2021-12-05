package col.view;
import java.util.List;

import col.controller.Accountinfo;
import col.model.Account;

public class Accoutmain {

	public static void main(String[] args) {
		Accountinfo a=new Accountinfo();
		List<Account>lst=a.CreateEmp();
		a.display(lst);
	
	}

}
