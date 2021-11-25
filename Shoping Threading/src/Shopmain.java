
public class Shopmain {
public static void main(String[] args) {
	Shopping s=new Shopping();
	Adminclass a=new Adminclass();
	Customerclass c=new Customerclass(s);
 Thread t=new Thread(a);
		c.start();
	
	
		
}
}
