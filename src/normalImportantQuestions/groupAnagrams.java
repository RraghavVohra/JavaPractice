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
		System.out.println(groupAnagrams(input1));
}
	
	public static List<List<String>> groupAnagrams(String[] strs){
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