
public class Adminclass extends Thread {
	private Shopping s;
	public Adminclass(Shopping shopping) {
		this.s=shopping;
	}
	public Adminclass() {
		// TODO Auto-generated constructor stub
	}
	@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			s.Storedata();
		}
}
