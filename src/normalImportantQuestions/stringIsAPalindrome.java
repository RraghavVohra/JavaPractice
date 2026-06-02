package normalImportantQuestions;

public class stringIsAPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "MADAM";
		isPalindrome(s);
	}
	
	static boolean isPalindrome(String s) {
		
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
