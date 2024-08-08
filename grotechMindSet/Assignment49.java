package grotechMindSet;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Assignment49 {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add("madhu");
		obj.add("megha");
		obj.add("harish");
		obj.add("mummy");
		obj.add(0, "pappa");
		obj.add("madhu");
//		obj.add(null);
//		obj.add(null);
		//obj.add(7);
	Collections.sort(obj);
		System.out.println(obj);
		
		LinkedList obj1=new LinkedList();
		obj1.add("madhu");
		obj1.add("madhu");
		obj1.add(90);
		obj1.add("harish");
		obj1.add(null);
		obj1.add(null);
		obj1.add(1, "hari");
		System.out.println(obj1);
		
		Vector obj2=new Vector();
		obj2.add("madhu");
		obj2.add("null");
		obj2.add("madhu");
		obj2.add("madhu");
		obj2.add("meghu");
		obj2.add(1, "neela");
		obj2.add(null);
		obj2.add(null);
		obj2.add(3);
//		obj2.addFirst("hari");
//		obj2.addLast("Mahindrakar");
		System.out.println(obj2);
		
		PriorityQueue obj3=new PriorityQueue();
		obj3.add("madhu");
		obj3.add("null");
		obj3.add("madhu");
		obj3.add("madhu");
		obj3.add("meghu");
		
		
//		obj3.add(null);
//		obj3.add(null);
//		obj3.add(3);
//		obj2.addFirst("hari");
//		obj2.addLast("Mahindrakar");
		System.out.println(obj3);
		
		
		HashSet obj34=new HashSet();
		obj34.add("madhu");
		obj34.add("null");
		obj34.add("madhu");
		obj34.add("madhu");
		obj34.add("meghu");
		obj34.add(4);
		System.out.println(obj34);
		
		Set obj4=new TreeSet();
		obj4.add("madhu");
		obj4.add("null");
		obj4.add("madhu");
		obj4.add("madhu");
		obj4.add("meghu");
		obj4.add("Harish");
		//obj4.add(4);
		System.out.println(obj4);
		
		Set obj5=new LinkedHashSet();
		obj5.add("madhu");
		obj5.add("null");
		obj5.add("madhu");
		obj5.add("madhu");
		obj5.add("meghu");
		obj5.add("Harish");
		
		//obj4.add(4);
		System.out.println(obj5);
		
	}

}
