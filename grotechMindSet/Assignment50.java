package grotechMindSet;

import java.util.ArrayList;
import java.util.List;

public class Assignment50 {

	public static void main(String[] args) {
		List obj=new ArrayList();
		obj.add("madhu");
		obj.add("hari");
		
		
		List obj1=new ArrayList();
		obj1.add("megha");
		obj1.add("nitesh");
		obj1.addAll(obj);
		System.out.println(obj1);
		
		

	}

}
