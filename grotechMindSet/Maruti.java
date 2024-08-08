package grotechMindSet;

import java.util.Arrays;

public class Maruti {
  public static void main(String[] args) {
//	  String n="  madhu  manchalakar ";
//	String h=  n.trim();
//	System.out.println(h);
//	char[] hari=n.toCharArray();
//	for(int i=0;i<n.length();i++) {
//	
//		System.out.print(hari[i]);
//	}
//	  System.out.println("Maruti");
//	  if(n.contains("madhu")) {
//		  System.out.println("yes");
//	  }
//	  else {
//		  System.out.println("no");
//	  }
	  
//	  int mm[]=new int[5];
//	  mm[0]=1;
//	  mm[1]=2;
//	  for(int i=0;i<mm.length;i++) {
//		  System.out.println(mm[i]);
//	  }
//	  System.out.println(Arrays.toString(mm));
	  
	  String a1="manish tiwari";
	  System.out.println(a1.matches("(.*)"));
	  System.out.println(a1.matches("(.*)m"));
	  
	  System.out.println(a1.matches("m(.*)"));
	 
	  System.out.println(a1.matches("(.*)z(.*)"));
	String b=  a1.replace('m', 'g');
	System.out.println(b);
  }
  
	  
}
