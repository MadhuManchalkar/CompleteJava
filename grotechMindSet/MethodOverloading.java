package grotechMindSet;
class Animal{
   public   void display() {
	   System.out.println("madhu");
   }	
}
class Animal1 extends Animal{
	public  void display() {
		
		   System.out.println("madhu");
	   }
}
public class MethodOverloading {

	public static void main(String[] args) {
		Animal1 obj=new Animal1();
		obj.display();

	}

}
