package hashMapQuestions;

import java.util.Arrays;

public class CheckAnagramsWayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "listen";
		String s2 = "silent";
		boolean result = anagramCheck(s1,s2);
		System.out.println(result);
	}
	
	static boolean anagramCheck(String s1,String s2) {
		
		if(s1.length() != s2.length()) {
			
			return false;
		}
		
		char[] s3 = s1.toCharArray(); // ['L','i','s','t','e','n']
		char[] s4 = s2.toCharArray();
		Arrays.sort(s3); 
		Arrays.sort(s4);
		
		return Arrays.equals(s3,s4);
	}	
}


