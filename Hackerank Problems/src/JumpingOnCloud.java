import java.util.LinkedList;
import java.util.List;

public class JumpingOnCloud {

	public static void main(String[] args) {
		
  List c=new LinkedList<Integer>();
  c.add(1);
  c.add(0);//skip
  c.add(0);
  c.add(1);
  c.add(0);
  c.add(0);//skip
  c.add(0);
  c.add(1);
  c.add(0);
  
  System.out.println(jumpingOnClouds(c));
  
	}  
	public static int jumpingOnClouds(List<Integer> c) {
    int minjump=0;
    int a[]=new int[c.size()];
    for (int i = 0; i < c.size(); i++) {
    	System.out.println("hi");
		if(c.get(i)==1 || c.get(i)==4)
		{
			i++;
		}
		else if(c.get(i)==0)
		{
			minjump++;
		}
	}
    return minjump;

    }
}
