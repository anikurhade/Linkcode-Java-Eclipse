import java.util.Iterator;
import java.util.Scanner;

public class DSALab {
	static  Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int arrsize=sc.nextInt();
		int a[]=new int[arrsize];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int ar=sc.nextInt();
		System.out.println("-------------------------------------");
		int count=0;
		for (int i = 0; i < arrsize-1; i++) {
			if(a[i]==ar)
			{
				count++;
				
				if(count==1)
				{
					System.out.println(i);
				}	
				if(a[i+1]!=ar)
				{
					System.out.println(i);
					break;
				}
			}
			
		}
		
		System.out.println(count);
	}
}
