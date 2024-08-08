package grotechMindSet;

class dis{
	public void display() {
		System.out.println("madhu");
	}
}
class show extends dis{
	public void display1() {
		System.out.println("megha");
	}
}
public class Assignment20 extends show {
	public void display2() {
		System.out.println("hari");
	}

	public static void main(String[] args) {
		
		Assignment20 obj=new Assignment20();
		obj.display();
		obj.display1();
		obj.display2();
	}

}
