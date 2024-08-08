package grotechMindSet;

import java.util.Arrays;
import java.util.Scanner;

public class ReversePrgrom  {

	public static void main(String[] args) {
		int[] mm=new int[4];
		Scanner a=new Scanner(System.in);
		long area=0;
	final	int  height=2;
		for(int i=0;i<mm.length; i++) {
			mm[i]=a.nextInt();
		
		 area=height*mm[i];
		 System.out.println(area);
		}
		
	}
}


