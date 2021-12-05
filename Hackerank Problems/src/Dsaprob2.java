import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Dsaprob2 {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	int arr1size;
	Set<Integer> arr1=new TreeSet<Integer>();
	Set<Integer> arr2=new TreeSet<Integer>();
	System.out.println("--------------------- Enter List 1 Size -------------------------");
	arr1size=sc.nextInt();

	System.out.println("--------------------- Enter List 1 Data -------------------------");
	for (int i = 0; i < arr1size; i++)
	{
	arr1.add(sc.nextInt());
	}	
	System.out.println("------------------- List 1 Is ---------------------------");
	display(arr1);
	System.out.println("\n--------------------- Enter List 2 Size -------------------------");
	int arr2size;
	arr2size=sc.nextInt();
	System.out.println("--------------------- Enter List 2 Data -------------------------");
	for (int i = 0; i < arr2size; i++)
	{
	arr2.add(sc.nextInt());
	}
	System.out.println("------------------- List 2 Is ---------------------------");
	display(arr2);
	arr1.addAll(arr2);
	System.out.println("\n------------------- Ascending List  Is ---------------------------");
	display(arr1);
	ArrayList<Integer>arrsorted=new ArrayList<Integer>(arr1);
	Collections.reverse(arrsorted);
	System.out.println("\n ------------------- Descending  List  Is ---------------------------");
	for (Integer integer : arrsorted) {
		System.out.print("\t"+integer);
	}
}
public static void display(Set<Integer> set)
{
for (Integer i : set) {
	System.out.print("\t"+i);
}
}



}
