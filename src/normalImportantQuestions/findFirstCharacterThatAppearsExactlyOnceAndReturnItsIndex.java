package normalImportantQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

// GIVEN A STRING S, FIND THE FIRST CHARACTER THAT APPEARS EXACTLY ONCE AND RETURN ITS INDEX.
// IF NO SUCH CHARACTER EXISTS, RETURN -1.
public class findFirstCharacterThatAppearsExactlyOnceAndReturnItsIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(firstUniqChar("leetcode"));
	}
	
	public static int firstUniqChar(String s) {
		
		// PASS 1 : BUILD FREQUENCY MAP
		Map<Character,Integer> freq = new LinkedHashMap<>();
		for(char c : s.toCharArray()) {
			freq.put(c,freq.getOrDefault(c,0)+1);
			
		}
		
		// SCAN LEFT TO RIGHT,FIND FIRST COUNT == 1
		for(int i=0;i<s.length();i++) {
			
			if(freq.get(s.charAt(i))==1) {
				
				return i;
			}
		}
		
		return -1;
		
	}
	

}
