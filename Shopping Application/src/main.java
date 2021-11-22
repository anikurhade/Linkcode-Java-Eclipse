import java.awt.List;
import java.util.LinkedList;
import java.util.Scanner;

public class main {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		LinkedList<Product> cart=new LinkedList<Product>();
		float tot = 0,cgst,finalamount;
		int a;
		do {
		System.out.println(" -: Choose  Below Options :- ");
		System.out.println("1. Add Product To Cart");
		System.out.println("2. Go To Bill");
		
		System.out.println("--------------------------------");
		System.out.print("\nChoice -->");
		a = sc.nextInt();
		
		if(a==1)
		{
			int ch=0;
			do
			{
				Product p=ProductCreate();
				cart.add(p);
				System.out.print(" Press 1 to Add New Product :- ");
				ch=sc.nextInt();
			}while(ch==1);
		}
		if(a==2)
		{
		  
			  for (Product product : cart) {
				tot=tot+product.ProdTotal;
				}
			  cgst=(float) (tot*0.09);
			  finalamount= tot+cgst+cgst;
			  System.out.println("Product Id \t Product Name \t Product Quant \t Product Price \t Product Total MRP ");
				 for (Product product : cart) {
						System.out.println(product.Prodid+"\t\t"+product.ProdName+"\t\t"+product.Prodquant+"\t\t"+product.ProdPrice +"\t\t"+product.ProdTotal);
						}
				 System.out.println("-----------------------------------------------------------------------------");
				 System.out.println("\t\t\t\t Total MRP :- "+tot);
				 System.out.println("\t CGST ="+tot+" * 0.09 ="+cgst+"\t\t SGST ="+tot+" * 0.09 ="+cgst);
				 System.out.println("----------------------------------------------------------------------------");
				 System.out.println("\t\t Final Amount ="+tot+"+"+cgst+"+"+cgst+"-->"+finalamount);
		  
		 
		}
		System.out.print(" Press 0 to Exit From Program :- ");
		a=sc.nextInt();
		}while(a!=0);
		
	}
public static Product ProductCreate() {
	Product p=new Product();
	System.out.println("Enter The Product Id :-");
	p.Prodid=sc.nextInt();
	System.out.println("Enter The Product Name :-");
	p.ProdName=sc.next();
	System.out.println("Enter The Product Price :-");
	p.ProdPrice=sc.nextFloat();
	System.out.println("Enter The Product Quanity :-");
	p.Prodquant=sc.nextInt();
	p.ProdTotal=p.ProdPrice*p.Prodquant;
return p;
}
}
