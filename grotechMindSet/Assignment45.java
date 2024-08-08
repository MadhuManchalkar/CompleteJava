package grotechMindSet;

public class Assignment45 {

	public static void main(String[] args) {
		String m="Madhu134 harish143 Mahindrakar$$";
		char[] k=m.toCharArray();
		for(int i=0; i<m.length();i++) {
			if(Character.isAlphabetic(k[i])) {
				System.out.print(k[i]);
			}
			
			if(Character.isDigit(k[i])) {
				System.out.println();
				System.out.print(k[i]);
			}
			
			if(Character.isWhitespace(k[i])) {
				System.out.println("spaces-->"+k[i]);
			}
			
			if(!Character.isAlphabetic(k[i]) && !Character.isDigit(k[i])  && !Character.isWhitespace(k[i]) ) {
				System.out.println("The given number is special"+k[i]);
			}
		}

	}

}
