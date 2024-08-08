package grotechMindSet;

public class Assignment9 {
     static void displyNmuber() {
    	 int i=10;
    	 if(i>8) {
    		 System.out.println("condition is true");
    	 }
     }
     
     static void dispalyNumber1() {
    	 int i=10;
    	 if(i>10) {
    		 System.out.println("condition is true");
    	 }
    	 else {
    		 System.out.println("condition is false");
    	 }
     }
     
     static void displanumber3() {
    	int i=10;
    	int y=20;
    	
    	if(i==10) {
    		System.out.println("number is 10");
    	}
    	
    	else if(y==20) {
    		System.out.println("number is 20");
    	}
    	
    	else if(i>10) {
    		System.out.println("number is less than 10");
    	}
    	else {
    		System.out.println("Number is out of range");
    	}
     }
	public static void main(String[] args) {
		displyNmuber();
		dispalyNumber1();
		displanumber3();
	}

}
