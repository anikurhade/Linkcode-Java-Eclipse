

public class main {

	public static void main(String[] args) {
		
		area a=new area(10, 20);
		Arth a2=new Arth(10, 20);
		
		Thread t1= new Thread(a);
		Thread t2=new Thread(a2);
		t1.start();
		t2.start();
		
		
		

	}

}
