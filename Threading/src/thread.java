
public class thread extends Thread {
	
public thread(int[] a) {
	thread1(a);
}
void  thread1(int[] a) {
	for (int i = a.length-1; i >=0; i--) {
		System.out.println("\t"+a[i]);
	}


 new Runnable() {
	public void run() {
		thread1(a);
	}
};
}
}
