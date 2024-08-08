package grotechMindSet;

public class Assignment44 {

	public static void main(String[] args) {
		String m="madhu13";
	char[] name=m.toCharArray();
	for(int i=0;i<name.length;i++) {
		if(Character.isAlphabetic(name[i])) {
			System.out.print(name[i]);
		}
	}

	}

}