package normalImportantQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] input1 = {"eat","tea","ate","tan","nat","bat"};
		System.out.println(groupAnagramss(input1));
}
	
	public static List<List<String>> groupAnagramss(String[] strs){
		// This is a method of list of lists of strings
		
		Map<String, List<String>> map = new HashMap<>();
		
		for(String s : strs) {
			
			// We have to sort the string in order to get the key
			// String ko character array mein convert karo i.e. s = "eat" -> ca = ['e','a','t']
			char[] ca = s.toCharArray();
			// Now we will sort it, it will become ca = ['a','e','t']
			Arrays.sort(ca);
			// Now convert Sorted Array to String, by this we will make it a key
			// ca = ['a','e','t'] -> "aet"
			String key = new String(ca);
			// Now we will check it in the Map
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
				// First case : map = { "aet": [] }
			}
			map.get(key).add(s);
			// map.get(key) → us key ki list nikalo.
			// .add(s) → us list mein original word daalo.
			// map = { "aet": ["eat"] }
			
		}
		
		// Return All Groups
		return new ArrayList<>(map.values());
		// Collection ko ArrayList mein convert karo — kyunki method ka return type List<List<String>> 
		// hai, Collection nahi.
		}
}

// s = "eat"
// → toCharArray → ['e','a','t']
// → sort        → ['a','e','t']
// → key         → "aet"
// → map mein "aet" nahi → nayi list → ["eat"]
// map = { "aet":["eat"] }

//CONCEPT NOTE: Why Map<String, List<String>> here?
//Map is an interface that stores key-value pairs with unique keys.
//In Group Anagrams, the KEY INSIGHT is: anagrams produce the SAME
//sorted string (e.g. "eat" and "tea" both sort to "aet"). So we use
//that sorted string as the MAP KEY, and store a LIST of all original
//words that share that key as the VALUE — e.g. {"aet": ["eat","tea","ate"]}.
//A simple List wouldn't work here because we need to GROUP words by
//a derived property (their sorted form) — that grouping requires a
//key-value lookup, which only Map provides. We can't instantiate Map
//directly since it's an interface, so we use HashMap — order of groups
//doesn't matter per the problem statement, so HashMap (unordered) is
//sufficient and faster than LinkedHashMap/TreeMap.
//
//Map<String, List<String>> map = new HashMap<>();

//CONCEPT NOTE: Why sort the string to build the key?
//Two strings are anagrams if and only if they contain the exact same
//characters with the exact same frequency. Sorting a string arranges
//its characters in a fixed, predictable order — so any two anagrams,
//regardless of their original order, will produce an IDENTICAL sorted
//string. This sorted string becomes a canonical signature — a unique
//fingerprint shared by every anagram of that word. That's why we
//convert to char[], sort it, then convert back to String to use as
//the map key.
//
//char[] ca = s.toCharArray();
//Arrays.sort(ca);
//String key = new String(ca);

//CONCEPT NOTE: Why List<List<String>> as return type?
//The result isn't a single list of words — it's a COLLECTION OF GROUPS,
//where each group is itself a list of anagram words. So the outer List
//holds multiple inner Lists — hence List<List<String>>. Since map.values()
//returns a Collection (not a List), we wrap it with 
//new ArrayList<>(map.values()) to match the required return type.
//
//return new ArrayList<>(map.values());
























