package hashMapQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupingOfAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = {"eat","tea","tan","ate","nat","bat"};
		groupAnagrams(words);
	}
	
	public static void groupAnagrams(String[] words) {
		
		HashMap<String, ArrayList<String>> groups = new HashMap<>();
		// Key = sorted word - "eat" sort = "aet"
		// Value = ArrayList<String> - Words ki list - Ek Key andar multiple words
		// "aet" -> ["eat","tea","ate"]
		for(String word : words) {
			
			char[] chars = word.toCharArray();
			// chars = ['e','a','t']
			// After sorting -> ['a','e','t']
			Arrays.sort(chars);
			String key = new String(chars);
			// ['a','e','t'] becomes "aet"
			
			if(groups.containsKey(key)==false) {
				// We are checking whether "aet" group is their in the map or not
				// This is initial case, as we make a new group
				groups.put(key,new ArrayList<>());
			}
			
			groups.get(key).add(word);
		}
		
		System.out.println(groups.values());
	}

}
