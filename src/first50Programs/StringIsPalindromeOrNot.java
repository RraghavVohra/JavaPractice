package first50Programs;

import java.util.Scanner;

public class StringIsPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.Intake the string from the User
		// 2.Reverse the string text
		// 3.Compare the original with reversed
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string text");
		String originalText = scanner.nextLine();
		
		// Logic for reversing the string text
	    char[] ca = originalText.toCharArray();
	    scanner.close();
	    int size = ca.length;
	    String reversedText = "";
	    
	    for(int i=size-1;i>=0;i--) {
	    	reversedText = reversedText + ca[i];
	    }
	    	
	    if(originalText.equals(reversedText)) {
	    	
	    	System.out.println(originalText+ " is a palindrome");
	    } else {
	    	
	    	System.out.println(originalText+ " is not a palindrome");
	    }
	}

}
