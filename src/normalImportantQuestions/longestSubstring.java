package normalImportantQuestions;

import java.util.HashSet;
import java.util.Set;

public class longestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb"; 
        System.out.println(findLongestSubstring(s));
        }
	
	public static int findLongestSubstring(String s) {
		
		Set<Character> set = new HashSet<>();
		int left = 0;
		int maxLen = 0;
		
		for(int right=0;right<s.length();right++) {
			
			// Repeat mila toh left se hatao
			while(set.contains(s.charAt(right))) {
			// While loop reason : repeat milne pe ek baar nahi, tab tak hatao jab tak duplicate na nikal jaaye.
				set.remove(s.charAt(left));
				left++;
			}
			
		// Add Karo aur maxLen update karo
		set.add(s.charAt(right));
		maxLen = Math.max(maxLen,right-left+1);	
		}
		return maxLen;
	}

}


// DRY RUN
// abcabcbb
// left = 0, right = 0, set ={}
// right = 0 -> 'a' -> set mein nhi -> add -> set = {a}, maxLen = 1
// right = 1 -> 'b' -> set mein nhi -> add -> set = {a,b}, maxLen = 2
// right = 2 -> 'c' -> set mein nhi -> add -> set = {a,b,c}, maxLen = 3
// right = 3 -> 'a' -> set mein hai -> REPEAT -> Left se hatao 'a' -> Set = {b,c}, left = 1, 
// Ab 'a' add karo -> set = {b,c,a}, maxLen = 3












