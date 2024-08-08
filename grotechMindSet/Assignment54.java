package grotechMindSet;

import java.util.Stack;

public class Assignment54 {

	public static void main(String[] args) {
		
		Stack  obj=new Stack();
		obj.add("Madhu");
		obj.add("Harish");
		obj.add("mami");
		obj.push("megha");
		System.out.println(obj);
		
		obj.pop();
		System.out.println(obj);
		
		//obj.peek();
		System.out.println(obj.peek());
	}

}

