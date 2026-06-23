package normalImportantQuestions;

import java.util.HashMap;
import java.util.Map;

public class checkTwoStringsAreAnagramsOfEachOther {

// CHECK IF TWO STRINGS ARE ANAGRAMS. GIVEN TWO STRNGS S1 AND S2, RETURN TRUE IF THEY ARE ANAGRAMS
// OF EACH OTHER, ELSE RETURN FALSE
	
// TWO STRINGS ARE ANAGRAMS IF ONE CAN BE FORMED BY REARRANGING THE LETTERS OF THE OTHER
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isAnagram("listen","silent"));	
	}
	
	public static boolean isAnagram(String s1,String s2) {
		
		// EDGE CASES 
		if(s1.length() != s2.length()) {
			return false;
		}
		
		Map<Character,Integer> map = new HashMap<>();
		// PASS 1 : FIRST STORE THE ATTENDANCE OF FIRST STRING
		for(char c : s1.toCharArray()) {
			// ['l','i','s','t','e','n']
			map.put(c, map.getOrDefault(c, 0) + 1);
			// Frequency Map -> {l:1,i:1,s:1,t:1,e:1,n:1}
		}
		
		// PASS 2 : NOW WE WILL CHECK WHETHER THE CHARACTERS IN S2 ARE THEIR IN S1
		for(char c : s2.toCharArray()) {
			// ['s','i','l','e','n','t']
		//	map.containsKey(c)  → "kya c hai map mein?"
		//	!map.containsKey(c) → "kya c NAHI hai map mein?"
			if(!map.containsKey(c)) {
				return false;
			}
			
			// SEE WE CHECK FOR EACH CHARACTER, LIKE HERE 's' is already in Frequency Map
			// SO IT WILL BE LIKE s = 1-1 = 0 -> {l:1,i:1,s:0,t:1,e:1,n:1}
			// SO IF WE WOULD HAVE ANOTHER 's' IN s2, THEN IT WILL BE s = 0-1 = -1
			// IN THIS CASE WE WILL RETURN FALSE, YAHI PE STOP HOJAYEGA
			map.put(c, map.get(c)-1);
			if(map.get(c)<0) {
				return false;
			}			
		}
		return true;
	}
}
	
// containsKey sirf ye check karta hai ki character exist karta hai ki nhi - kitna aaya ye nhi dekhta
// map.get(c)-1 -> current count nikalo uss character ka. Ek minus karo, matlab "s2" ne iss character ko ek baar
// use karliya hai. Phir map.put(.....) -> Updated count wapas map mein daalo
	
	// HASHMAP vs LINKEDHASHMAP — difference

	// HashMap → order guarantee nahi karta
	// Map<Character, Integer> freq = new HashMap<>();
	// freq = {c=1, a=2, b=2, d=1, e=1}  ← kisi bhi order mein ho sakta hai

	// LinkedHashMap → insertion order maintain karta hai
	// Map<Character, Integer> freq = new LinkedHashMap<>();
	// freq = {a=2, b=2, c=1, d=1, e=1}  ← exactly jis order mein characters aaye

	// Is problem mein LinkedHashMap isliye use kiya:
	// Pass 2 mein agar map.entrySet() iterate karte (s.charAt(i) ki jagah)
	// toh order matter karta — first unique sahi crambe mein milta

	// NOTE: humne s.charAt(i) se index access kiya hai
	// isliye HashMap se bhi kaam chal jaata — order yahan matter nahi karta
	// LinkedHashMap use karna best practice hai — future-proof rehta hai
	
// THE OTHER WAY OF WRITING 

// for (char c : s2.toCharArray()) {

// if (map.containsKey(c)) {
    // Hai → subtract karo
//    map.put(c, map.get(c) - 1);
//   if (map.get(c) < 0) {
//        return false;
//    }
// } else {
    // Nahi hai → return false
//    return false;
// }
// }

//CONCEPT NOTE: Why Map<Character, Integer> here?
//Map is an interface in Java that stores data as key-value pairs —
//each key is unique, and maps to exactly one value. In this problem,
//we needed to count HOW MANY TIMES each character appears in s1, and
//then verify those same counts against s2. A List wouldn't work here
//because we don't just need to know which characters exist — we need
//to track a COUNT against each character, which is exactly what a
//key-value structure gives us: character as the key, frequency as the
//value (e.g. "listen" → {l=1, i=1, s=1, t=1, e=1, n=1}). A Set was also
//not suitable because Set only tracks existence (yes/no), not count.
//Map is the right fit because anagram-checking is fundamentally a
//frequency-comparison problem.
//
//We can't instantiate Map directly since it's an interface, so we use
//HashMap as the concrete implementation — HashMap gives O(1) average
//time complexity for get/put operations, and since order of characters
//doesn't matter for this problem (we're only comparing counts, not
//sequence), HashMap (unordered) is sufficient — no need for the extra
//overhead of LinkedHashMap.
//
//Map<Character, Integer> map = new HashMap<>();

