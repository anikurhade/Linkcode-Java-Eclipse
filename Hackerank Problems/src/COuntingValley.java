import java.util.Scanner;

public class COuntingValley {
	static Scanner sc=new Scanner(System.in); 
public static void main(String[] args) {
System.out.println("Enter The Steps Size");
int step=sc.nextInt();
System.out.println("Enter The Steps Path :- ");
String path=sc.next();
System.out.println(countingValleys(step, path));
}
public static int countingValleys(int steps, String path) {
    // Write your code here
    int count=0;
    int valley=0;
    int returnvall;
    char[] a=new char[steps];
    a=path.toCharArray();
    for (int i = 0; i < a.length; i++) {
    	if(a[i]=='U')
        {
            count=count+1;
      
        }
        else if(a[i]=='D')
         {
        	if(count==0)
            {
               valley++;
            }
        	count--;
           
         }
    	 
       
	}
    
    return valley;
    }

}


