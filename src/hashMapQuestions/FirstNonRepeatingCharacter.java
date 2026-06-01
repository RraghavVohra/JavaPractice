package hashMapQuestions;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "leetcode";
		firstNonRepeating(s);
		}
	
	static void firstNonRepeating(String s) {
		
		HashMap<Character,Integer> firstIndex = new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			if(firstIndex.containsKey(c)==false) {
				
				firstIndex.put(c,i);
			} else {
				
				firstIndex.put(c,-1);
			}
		}
		
		// SECOND LOOP IS FOR FINDING THE ANSWER FROM THE HASHMAP
		// Map ka order reliable nhi hota, isliye original string pe loop use 
		// karengey
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			if(firstIndex.get(c)!=-1) {
				System.out.println("First Non-Repeating: "+c);
				return;
			}
		}
	}
	

}


// s = "leetcode"

// Map build hua:
// {l:0, e:-1, t:3, c:4, o:5, d:6}

// Agar map pe loop karte:
// Map kisi bhi order mein iterate kar sakta hai!

// Example:
// t → 3 != -1 → return 't' ❌
// c → 4 != -1 → return 'c' ❌

// But actual answer = 'l' ✅
// Kyunki 'l' STRING mein pehle aaya!



