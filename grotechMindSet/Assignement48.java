package grotechMindSet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignement48 {
	static {
		System.out.println("mad");
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		try {
			int i=scn.nextInt();
			System.out.println(i);
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
