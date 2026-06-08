package normalImportantQuestions;

import java.util.HashMap;
import java.util.Map;

public class longestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
	
	static int lengthOfLongestSubstring(String s) {
		
		int maxLen = 0;
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			
			map.clear();
			
			for(int j=i;j<s.length();j++) {
				char c = s.charAt(j);
				map.put(c,map.getOrDefault(c,0)+1);
				
				if(map.get(c)==2) {
					break;
				}
				
				maxLen = Math.max(maxLen,j-i+1);
			}
		}
		
		return maxLen;
	}

}


// QUICK DRY RUN
// i=0:
// j=0 → 'a' → {a:1} → maxLen=1
// j=1 → 'b' → {a:1,b:1} → maxLen=2
// j=2 → 'c' → {a:1,b:1,c:1} → maxLen=3
// j=3 → 'a' → {a:2} → repeat → break

// ROLE OF map.clear()
// i = 0 → "abc" tak gaya, map = {a:1, b:1, c:1}
// i = 1 → ab yahan se shuru karna hai "bcabcbb"
// but map mein abhi bhi {a:1, b:1, c:1} pada hai
// 'b' aaya → count 2 ho gaya → turant break
// → WRONG answer
// map.clear() isliye zaroori hai kyunki har nayi starting pe fresh map chahiye — pichla data clear karo.

// ROLE OF maxLen
// Humein sabse lamba unique substring chahiye — har substring ki length track karni hai.
// "a"   → length 1
// "ab"  → length 2
// "abc" → length 3  ← sabse lamba
// "abca" → repeat, break
// maxLen ye track karta hai ki ab tak ka sabse lamba unique substring kitna lamba tha.

// ROLE OF J-I+1
// i = 0, j = 2 → "abc"
// length = j - i + 1 = 2 - 0 + 1 = 3
// i = 0, j = 2
// j - i     = 2 - 0 = 2  ← wrong, "abc" ki length 3 hai
// j - i + 1 = 2 - 0 + 1 = 3 ✓













