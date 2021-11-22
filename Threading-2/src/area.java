
public class area extends Thread {
int l,b;
double area;

public area(int l, int b) {
	super();
	this.l = l;
	this.b = b;
	
}

public void areadis() {
	
	area=0.5*l*b;
	System.out.println("Area is :-"+area);
	
}

@Override
	public void run() {
		areadis();
	}
}
