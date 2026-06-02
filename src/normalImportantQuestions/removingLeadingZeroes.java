package normalImportantQuestions;

public class removingLeadingZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "00001234";
		System.out.println(removeLeadingZeroes(s));
	}
	
	static String removeLeadingZeroes(String s) {
		
		int i=0;
		while(i<s.length() && s.charAt(i)=='0') {
			
			i++;
		}
		return s.substring(i);
	}
}

// But why WHILE feels more natural here? The logic is: "Keep moving forward AS LONG AS you see a zero" 
// That's a condition-driven loop — no fixed iterations, just "keep going until condition breaks." 
// while reads more like plain English for this. for loop is more natural when you know you're iterating 
// over something (array, string index, range).