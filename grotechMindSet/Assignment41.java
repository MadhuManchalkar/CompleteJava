package grotechMindSet;

import java.util.Arrays;
import java.util.Collections;

public class Assignment41 {

	public static void main(String[] args) {
		String m="radar";
	String b="";
	char[] c=m.toCharArray();
	for(int i=c.length-1;i>=0;i--) {
		b=b+c[i];
		
	}
	if(b.equals(m)) {
		System.out.println("name is parindrome");
	}
	else {
		System.out.println("Name is not palindrome");
	}
	
	}

}
