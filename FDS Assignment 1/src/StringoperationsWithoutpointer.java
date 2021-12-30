import java.util.Scanner;

public class StringoperationsWithoutpointer {
	
public static void main(String[] args) {
	stringop s=new stringop();
	String str1 = null,str2 = null;
	int ch=0;
	Scanner sc=new Scanner(System.in);
	do {
 System.out.println("---------------------------------------------------------------------------");
 System.out.println("\n.1 To Create A New String");
 System.out.println("\n.2 To String Length");
 System.out.println("\n.3 To Concat String");
 System.out.println("\n.4 To Copy To Another String");
 System.out.println("\n.5 To Compare Two String");
 System.out.println("\n.6 To  Reverse A String");
 System.out.println("\n.7 To  Exit");
 System.out.println("--------------------------------------------------------------------------");
 System.out.print("Choice :- ");
 ch=sc.nextInt();
 switch (ch) {
	case 1:
	{
		str1=s.enterstring();
		System.out.println("Entererd String :- "+str1);
		System.out.println("---------------------------------------------------------");
	}
	break;
	case 2:
	{
		System.out.println("--------------------------------------------------------------------");
		System.out.println("String Is :- "+str1);
		System.out.println("String Length :- "+s.getstring(str1));
		System.out.println("--------------------------------------------------------------------");
		
	}
	break;
	case 3:
	{
		str2=s.enterstring();
		System.out.println("Entererd String :- "+str2);
		System.out.println("Past String :- "+str1);
		str1=s.concat(str1, str2);
		System.out.println("Concatnated String Is :- "+str1);
		System.out.println("----------------------------------------------------------------------");
				
	}
	break;
	case 4:
	{
		System.out.println("Past String 1 :- "+str1);
		System.out.println("Past String 2 :- "+str2);
		System.out.println("Copying String 1 To String 2 ");
		str2=s.Copy(str1, str2);
		System.out.println("String 2 Updated Is "+str2);
		System.out.println("---------------------------------------------------------------------");
		
	}
	break;
	case 5:
	{
		System.out.println("Past String 1 :- "+str1);
		System.out.println("Past String 2 :- "+str2);
		s.compare(str1, str2);
		System.out.println("---------------------------------------------------------------------");
	}
	break;
	case 6:
	{
		System.out.println("Past String 1 :- "+str1);
		System.out.println("Past String 2 :- "+str2);
		System.out.println("Reversed String 1:- "+s.Reverse(str1));
		System.out.println("Reversed String 2:- "+s.Reverse(str2));
		System.out.println("---------------------------------------------------------------------");

	}
	break;
	case 7:
	{
		System.out.println("---------------------------------------------------------------");
		System.out.println("Thank You ");
		System.exit(0);
	}
	break;	

default:
System.out.println("Invalid Choice");
}
 
	
}while(ch!=7);
}
}
class stringop
{
	static Scanner sc = new Scanner(System.in);
	String enterstring()
	{
		System.out.println("----------------------------------------------------------------");
		System.out.println("Enter A String :- ");
		String str=sc.next();
		
		return str;
	}
 int getstring(String s) {
	 
	int length=0;
	char c[]=s.toCharArray();
	for (int i = 0;i<c.length; i++) {
		length++;
	}
	return length;
 }
  String concat(String str1,String Str2)
  {
	 str1=str1+Str2;
	 
	 return str1;
  }
  
  void compare(String str1, String Str2)
  {
	  if(str1.equals(Str2))
	  {
		  System.out.println("String 1 And String 2 Are Same");
	  }
	  else 
	  {
		  System.out.println("String 1 And String 2 Are Different");
	  }	  
	if(true)
	  {
		  int res=str1.compareTo(Str2);
		  if(res>0)
		  {
			  System.out.println("String 1 is Greater Than String 2 By "+res+" Characters");
		  }
		  else if(res<0)
		  {
			  System.out.println("String 2 is Greater Than String 1 By"+Math.abs(res)+" Characters");
		  }
		  else 
		  {
			  System.out.println("Both String Have Same Size Of Characters ");
		  }  
	  }
  
  }
  String Copy(String str1,String str2)
  {
	  str2=str1;
	  return str2;
  }
  
  String Reverse(String a)
  {
	  char c;
	  String rev="";
	  for (int i =a.length()-1; i >=0; i--)
	{
		c=a.charAt(i);
		rev=rev+c;
		
	}
	
	  a=rev;
	  return a;
  }
  
}

