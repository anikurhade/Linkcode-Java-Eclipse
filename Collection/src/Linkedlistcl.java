import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlistcl {
public static void main(String[] args) {
	List<Integer> a=new LinkedList<Integer>();
	a.add(100);
	a.add(200);
	a.add(300);
	a.add(1100);
	a.add(600);
	a.add(190);
	a.add(10);
	
	System.out.println(a);
	System.out.println(a.size());
	a.remove(4);
	System.out.println(a.indexOf(200)+1);
	System.out.println(a.contains(600));
	System.out.println(a.isEmpty());
	System.out.println(a.lastIndexOf(190));
	System.out.println(a.get(1));
	 
	
	
}
}
