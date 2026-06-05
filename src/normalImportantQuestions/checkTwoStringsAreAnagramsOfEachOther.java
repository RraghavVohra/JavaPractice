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
