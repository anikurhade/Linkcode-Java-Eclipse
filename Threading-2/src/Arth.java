
public class Arth extends Thread {
int a,b,add;

public Arth(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	
}
public void dispadd()
{
	add=a+b;
	System.out.println("Addition Is "+add);
	
}

@Override
	public void run() {
		dispadd();
	}
}
