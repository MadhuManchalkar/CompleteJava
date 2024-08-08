package grotechMindSet;

public class Assignment14 {

	static void circle(int r, int c) {
		final float pi=3.14f;
		double area=pi*r*2;
		System.out.println(area);
		
		double circumstan=(c/2)*r;
		System.out.println(circumstan);
	}
	public static void main(String[] args) {
		circle(4,2);
	}

}
