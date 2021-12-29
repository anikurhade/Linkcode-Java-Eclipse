package default_package;
import java.util.Scanner;

public class Assertion {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter A Number :- ");
	int a=sc.nextInt();
	assert a>0: "You Entered Negative Number";
	System.out.println("Number Entered Is Positive ");

	}

}
