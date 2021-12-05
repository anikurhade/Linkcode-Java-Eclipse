import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DSAprob2_secondwithoutset {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	int arr1size;
	Set<Integer> arr1=new TreeSet<Integer>();
	Set<Integer> arr2=new TreeSet<Integer>();
	arr1size=sc.nextInt();
    for (int i = 0; i < arr1size; i++)
	{
	arr1.add(sc.nextInt());
	}	
		arr1size=sc.nextInt();
	for (int i = 0; i < arr1size; i++)
	{
	arr2.add(sc.nextInt());
	}
	arr1.addAll(arr2);
	display(arr1);
	ArrayList<Integer>arrsorted=new ArrayList<Integer>(arr1);
	Collections.reverse(arrsorted);
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
