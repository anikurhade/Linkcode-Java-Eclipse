package map.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Mapmain {
public static void main(String[] args) {
	Map<Integer, String> student=new TreeMap<Integer, String>();
	
	student.put(101, "Hermionie Granger");
	student.put(102, "Harry Potter");
	student.put(103, "Ron Weasely ");
	student.put(104, "Draco Malfoy");
	
	ArrayList<Integer> akey=new ArrayList<Integer>(student.keySet());
	Iterator<Integer> a=akey.iterator();
	System.out.println("Key\t\tName");
	while (a.hasNext()) {
	Integer key=(Integer)a.next();
	System.out.println(" "+key +" "+student.get(key));
		
	}
	
}
}
