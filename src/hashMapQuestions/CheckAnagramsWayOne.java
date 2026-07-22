package hashMapQuestions;

import java.util.Arrays;

public class CheckAnagramsWayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Listen";
		// If one of the alphabet is in upper case then we 
		// will get an error. 
		s1 = s1.toLowerCase();
		String s2 = "Silent";
		s2 = s2.toLowerCase();
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

// String Java mein immutable hai — ek baar ban gayi toh uske characters 
// ko in-place rearrange nahi kar sakte, koi bhi "modify" operation naya 
// String object banata hai. Arrays.sort() ko ek mutable structure chahiye 
// jise wo directly modify kar sake — isliye char[] mein convert karte hain, 
// kyunki array mutable hota hai, uske elements ko jagah pe hi rearrange kiya ja sakta hai.


