package normalImportantQuestions;

public class printFirstLetterOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello World How Are You";
		firstLetterBrute(s);
	}
	
	static void firstLetterBrute(String s) {
		
		s = s.trim();
		System.out.print(s.charAt(0)+" ");
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==' ' && s.charAt(i-1)!=' ') {
				
				System.out.print(s.charAt(i+1)+" ");
			}
		}
		
		System.out.println();
	}

}
