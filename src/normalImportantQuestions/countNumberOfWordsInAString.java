package normalImportantQuestions;

public class countNumberOfWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello World How Are You";
		countWordsBrute(s);
	}

	// Your alternate idea: s.charAt(i)==' ' && s.charAt(i+1)!=' '
	// Checking: "space found, and next char is NOT a space
	// When i = s.length()-1 (last index), doing i+1 will throw StringIndexOutOfBoundsException
	
	static int countWordsBrute(String s) {
		
		s = s.trim(); // Trailing and Leading spaces are gone now
		int count = 1;
		
		for(int i=1;i<s.length();i++) {
			
			// Main condition
			if(s.charAt(i)==' ' && s.charAt(i-1)!=' ') {
				
				count++;
			}
		}
		
		return count;
		
	}

}
