package normalImportantQuestions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// GIVEN A STRING S, FIND THE FIRST CHARACTER THAT APPEARS EXACTLY ONCE AND RETURN ITS INDEX.
// IF NO SUCH CHARACTER EXISTS, RETURN -1.
public class findFirstCharacterThatAppearsExactlyOnceAndReturnItsIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(allUniqChars("leetcode")); 
	}
	
	public static int firstUniqChar(String s) {
		
		// PASS 1 : BUILD FREQUENCY MAP
		Map<Character,Integer> freq = new LinkedHashMap<>();
		for(char c : s.toCharArray()) {
			freq.put(c,freq.getOrDefault(c,0)+1);
			// Frequency Map - {l=1,e=3,t=1,c=1,o=1,d=1}
		}
		
		// SCAN LEFT TO RIGHT,FIND FIRST COUNT == 1
		for(int i=0;i<s.length();i++) {
			
			if(freq.get(s.charAt(i))==1) {
				return i;
			}
		}
		return -1;
		
	}
	
	// HashMap vs LinkedHashMap — kyun LinkedHashMap?
	// Pass 2 mein hum string ke index pe ja rahe hain — s.charAt(i) — isliye order matter nahi karta actually. Dono kaam karenge.
	// But agar kabhi freq.entrySet() iterate karna ho directly — tab LinkedHashMap insertion order guarantee karta hai. 
	// Good habit hai use karna.
	
	// CONCEPT NOTE: Why List<Character> here?
	// List is an interface in Java that represents an ordered collection —
	// it maintains insertion order and allows duplicates, and elements can
	// be accessed by index (e.g. result.get(0)). In this problem, we needed
	// to collect all unique characters in the SAME ORDER they first appeared
	// in the string (left to right) — e.g. for "leetcode", the unique chars
	// in order are [l, t, c, d]. A Set was not suitable because HashSet does
	// not guarantee order, and a Map was unnecessary because we don't need
	// key-value pairs here, just a sequence of characters. List is the right
	// fit because it preserves order and allows us to simply keep adding
	// characters as we find them.
	//
	// We can't instantiate List directly since it's an interface, so we use
	// ArrayList as the concrete implementation — ArrayList is backed by a
	// dynamic array internally, giving fast O(1) access by index, and it's
	// the most commonly used List implementation in practice.
	//
	// List<Character> result = new ArrayList<>();
	
	// WHAT IF NOW WE HAVE TO RETURN ALL THE UNIQUE CHARACTERS INSTEAD OF ONE
	public static List<Character> allUniqChars(String s){
		
		// PASS 1 : BUILD FREQUENCY MAP
				Map<Character,Integer> freq = new LinkedHashMap<>();
				for(char c : s.toCharArray()) {
					freq.put(c,freq.getOrDefault(c,0)+1);
					// Frequency Map - {l=1,e=3,t=1,c=1,o=1,d=1}
				}
		// PASS 2: COLLECT ALL CHARS WITH COUNT == 1
				List<Character> result = new ArrayList<>();
				for(int i=0;i<s.length();i++) {
					if(freq.get(s.charAt(i))==1) {
						result.add(s.charAt(i));
					}
				}
				return result;
	}
	
}


