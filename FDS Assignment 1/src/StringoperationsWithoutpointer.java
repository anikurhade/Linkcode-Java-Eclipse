import java.util.Scanner;

public class StringoperationsWithoutpointer {
	
public static void main(String[] args) {
	stringop s=new stringop();
	String str1,str2;

	
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
	for (int i = 0; c[i]!='\0'; i++) {
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

