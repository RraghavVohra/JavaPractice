package normalImportantQuestions;

import java.util.HashMap;
import java.util.Map;

public class permutationAndSubstring {

	// Given two strings s1 and s2, return true if any permutation of s1 exists as a substring in s2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(checkInclusion("ab","eidbaoooo"));
	}
	
    // FIRSTLY UNDERSTAND THE LOOP STRUCTURE, YOU HAVE TWO STRINGS S1 = "ab" and S2 = "eidbaooo"
	// Length() of both are 2 and 8. Humko S2 se 2 characters ek saath uthane hain, aur har baar
	// ek aage badhna hai. index 0 se uthao 2 chars → "ei"
	// index 1 se uthao 2 chars → "id" BAAT HAI LOOP KAHAAN ROKENGEY HUMLOG
	// JAB HUM 7TH INDEX PE REACH HONGEY TOH, USKE AAGE TOH KOI HAI NHI, WE WILL BE OUT OF BOUNDS
	// TOH LAST VALID INDEX -> 8-2=6, SO THE FORMULA WILL BE LOOP CHALEGA FROM i=0 TO 
	// i<s2.length()-s1.length(). THE OTHER PART IS OF GETTING A SUBSTRING, WE WILL BE USING SUBSTRING METHOD
	// substring(start,end) AND WE KNOW "end" exclusive hota hai.
	
	// EXPLANATION 
	// checkInclusion window banata hai aur isAnagram ko deta hai. 
	// isAnagram check karta hai — true mila toh checkInclusion bhi true return karta hai.
	
	// METHOD 1 : CHECK IF THESE TWO STRINGS ARE ANAGRAM
	public static boolean isAnagram(String s1,String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		Map<Character,Integer> map =  new HashMap<>();
		for(char c : s1.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		for(char c : s2.toCharArray()) {
			if(!map.containsKey(c)) {
				return false;
			}
		map.put(c,map.get(c)-1);
		if(map.get(c)<0) {
			return false;
		}
	}
	return true;	
	}
	
	// METHOD 2 : BRUTE FORCE : HAR WINDOW CHECK KARO
	// i = 0
	// window = s2.substring(0, 0+2) = "ei"
	// isAnagram("ab", "ei") call hota hai
	
	// s1 = "ab", s2 = "ei" ,Length check: 2 == 2 ✓ ,Pass 1 — s1 se map banao:
	// 'a' → {a:1} THEN 'b' → {a:1, b:1} THEN Pass 2 — s2 se subtract karo:
	// 'e' → map mein hai? NO → return false
	public static boolean checkInclusion(String s1,String s2) {
	// Base case: s1 s2 se bada hai toh possible hi nahi
        if (s1.length() > s2.length()) {
            return false;
        }
	for(int i=0; i<s2.length()-s1.length();i++) {
		
		String window = s2.substring(i,i+s1.length());
		if(isAnagram(s1,window)) {
			return true;
		}
	}
	
	return false;
	}
}









