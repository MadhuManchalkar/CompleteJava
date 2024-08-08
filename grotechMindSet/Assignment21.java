package grotechMindSet;
class nehu{
	static void dis() {
		System.out.println("madhu");
	}
}
class name1 extends nehu{
	static void dis1() {
		System.out.println("madhu");
	}
}
public class Assignment21 extends name1{
	static void dis2() {
		System.out.println("madhu");
	}

	public static void main(String[] args) {
		Assignment21 obj=new Assignment21();
		obj.dis();
		obj.dis1();
		obj.dis2();
	}

}
