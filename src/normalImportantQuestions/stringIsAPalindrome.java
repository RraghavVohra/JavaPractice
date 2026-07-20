package normalImportantQuestions;

public class stringIsAPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Palindrome reads same forward and backwards
		String s = "MADAM";
		isPalindrome(s);
		// String[] args represents command-line arguments passed to your program 
		// when it starts.
		
	}
	
	static boolean isPalindrome(String s) {
	// static means the method belongs to the Class itself, not to a specific 
	// object instance of that class.
		
		int left = 0;
		int right = s.length()-1;
		
		while(left<right) {
			
			if(s.charAt(left)!=s.charAt(right)) {
				
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;
	}

}
