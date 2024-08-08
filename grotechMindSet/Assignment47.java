package grotechMindSet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment47 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		try{
		int b=a.nextInt();
		System.out.println(b);
		
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
	}

}
